import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class AWT04
 {
     public static void main(String[] args) {
         MyFrame01 mf=new MyFrame01();
         mf.setSize(400, 400);
         mf.setVisible(true);
         
     }
 }
class MyFrame01 extends Frame implements ActionListener
{
 Label l ;
 Button b;
 int count =0;
public MyFrame01()
{
    super ("RESPONSE BUTTON");
    setLayout(new FlowLayout()) ;
    String s1=Integer.toString(count );
    l=new Label (s1);
    b=new Button("Click");
    
    
    add (l); 
   add(b);
   
  
    b.addActionListener(this);
    
    
}
    
 @Override
    public void actionPerformed(ActionEvent e) {
  
             count ++;
             String s2=Integer.toString(count);
             System.out.println(b.getFont());

             l.setText(s2);
    }
    
}