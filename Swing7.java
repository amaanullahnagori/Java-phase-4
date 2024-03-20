
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Swing7
{
    
    public static void main(String[] args) {
    MyFrame07 m=new MyFrame07();
    m.setVisible (true);
   m.setSize(400,400);
m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

}
}
class MyFrame07 extends JFrame implements  ChangeListener
{
    JSlider s;
   JProgressBar p;
   JPanel p1,p2;
   int w=0;
  
   MyFrame07()
   {
       p1=new JPanel ();
              p2=new JPanel ();

        s=new JSlider ();
      
        s.setMajorTickSpacing(10);
        s.setMinorTickSpacing(1);
        s.setMaximum(100);
        s.setMinimum(0);
        s.setPaintTicks(true);
        s.setPaintLabels(true);
       s.addChangeListener(this);
        
        
        
        p=new JProgressBar();
        p.setSize(400,400);
        p.setString("50%");
        p.setStringPainted(true);
        p1.add(p);
         p2.add(s);
        p.setBorderPainted(true);
//       add(p2,BorderLayout.NORTH);
//      add(p1,BorderLayout.SOUTH);
add(s,BorderLayout.NORTH);
add(p,BorderLayout.SOUTH);


   }
   
   
   public void paintComponent(Graphics g)
   {                   
       
       g.drawOval (50,50,50,50);
      
   }

    @Override
    public void stateChanged(ChangeEvent e) {
        w = s.getValue();
       String str=w+"%";
        p.setString(str);
                p.setStringPainted(true);
         MyFrame07 f=new MyFrame07();
       f.repaint();
   
   
    }
}