import java.awt.event.*;
import java .awt.*;
import java.util.Date;
class AWT08
{
    public static void main(String[] args) {
        MyFrame08 mf=new MyFrame08();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
class MyFrame08 extends Frame 
{
    Label l1,l2,l3,l4;
    MyFrame08()
    {
        super ("KEY PRESSED EVENT DEMO");
        l1=new Label ("");
        l2=new Label ("");
        l3=new Label ("");
        l4=new Label ("");
      
       
        l1.setBounds(10, 30, 100, 20);
        l2.setBounds(10, 50, 100, 20);
        l3.setBounds(10, 70, 100, 20);
        l4.setBounds(10, 90,100, 20);
       
        setLayout(null);
      add(l1);
      add(l2);
      add(l3);
     add(l4);
     Handler h=new Handler ();
     addKeyListener(h);
      l2.addKeyListener(h);
       l3.addKeyListener(h);
              l4.addKeyListener(h);

    }
    class Handler implements KeyListener

    {
        public void keyTyped(KeyEvent e) {
        l3.setText("key Typed");
        l4.setText(new Date(e.getWhen())+"");
        }

        
        public void keyPressed(KeyEvent e) {
                       l1.setText("KEY IS PRESSED");
                       l2.setText("");
        }

        
        public void keyReleased(KeyEvent e) {
           l2.setText("keyreleased");
        l1.setText("");
        l3.setText("");
        l4.setText("");


        }
    
    }
       
}
