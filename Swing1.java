
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class  Swing1
{
    public static void main(String[] args) {
        MyFrame01 mf =new MyFrame01();
        mf.setSize(600, 400);
        mf.setVisible(true);
      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       
}
}
class MyFrame01 extends JFrame
{
 JLabel l;
 JTextField t;
 
    JButton b1,b2,b3,b4,b5;
    GridLayout g;
    MyFrame01()
    { 
    super("Button By Swing");
    l=new JLabel (" none of the button is click");
    //  g=new GridLayout(3,2);
       t= new JTextField (50);
     b1=new JButton ("First");
       b2=new JButton ("Second");
      b3=new JButton ("Third");
      b4=new JButton ("Fourth");
      b5=new JButton ("Fifth");
      setLayout(new FlowLayout());
      add(l);
      add(t);
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(b5);
     b5.addActionListener(( ActionEvent ae)->l.setText("Button5 is pressed"));
      b1.addActionListener(( ActionEvent ae)->l.setText("Button1 is pressed"));
      b2.addActionListener(( ActionEvent ae)->l.setText("Button2 is pressed"));
      b3.addActionListener(( ActionEvent ae)->l.setText("Button3 is pressed"));
      b4.addActionListener(( ActionEvent ae)->l.setText("Button4 is pressed"));
    b1.addActionListener(( ActionEvent ae)->t.setText("Button1 is pressed"));
    
     
    
    
    
    }

    
    }
