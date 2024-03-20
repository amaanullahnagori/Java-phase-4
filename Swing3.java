import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.String.valueOf;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class Swing3
{
    public static void main(String[] args) {
    MyFrame03 mf=new MyFrame03();
    mf.setSize(800,800);
    mf.setVisible(true);
    
    mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
class MyFrame03 extends JFrame implements ActionListener  
{ 
    JRadioButton r1,r2,r3;
    JLabel l1,l2,l3,l4;
    JLayeredPane lp;
    int x;
    int y;
    
    public  MyFrame03()
    {
        l1=new JLabel ("Green");
        l1.setBackground(Color.green);
        l1.setOpaque(true);
         
        l2=new JLabel ("Red");
        l2.setBackground(Color.red);
        l2.setOpaque(true);
        
        l3=new JLabel ("Blue");
        l3.setBackground(Color.blue);
        l3.setOpaque(true);
        
        
        l4=new JLabel ("Black");
        l4.setBackground(Color.black);
        l4.setOpaque(true);
       
       l1.setBounds(50,50,500,200);
       l2.setBounds(70,70,500,200); 
       l3.setBounds(100,100,500,200); 
       l4.setBounds(x,y,50,50);
        
       r1=new JRadioButton("green",false);
       r2=new JRadioButton("red",false);
       r3=new JRadioButton("blue",true );
       
       ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
      
        
                JPanel p=new JPanel ();
                p.add(r1);
                p.add(r2);
                p.add(r3);
              
                p.setBounds(10, 10, 600, 100);
                
                lp=new JLayeredPane();
                lp.add(l1,valueOf(0));
                lp.add(l2,new Integer(1));
                lp.add(l3,new Integer(2));               
                lp.add(l4,new Integer(3));
                
 add (p,BorderLayout.NORTH);
 add(lp,BorderLayout.CENTER);
 
 
 r1.addActionListener(this);
 r2.addActionListener(this);
 r3.addActionListener(this);
       
       
 addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me)
            {
                l4.setLocation(me.getX(), me.getY());
            }
        });
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected())
        {
            lp.setLayer(l4, 1);
        }
        if (r2.isSelected())
        {
        lp.setLayer(l4,2);
        }
        if (r3.isSelected())
        {lp.setLayer(l4,3);
        }
    }
    
    
}





