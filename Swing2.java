
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class Swing02
{
    public static void main(String[] args) {
    MyFrame02 mf =new MyFrame02();
    mf.setSize(600,400);
    mf.setVisible(true);
    mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
class MyFrame02 extends JFrame 
{
    JButton b;
    JTextField f;
    MyFrame02 ()
    {
        b=new JButton ("click");
        f=new JTextField (20);
        JPanel p=new JPanel ();
         p.add(f);
         p.add(b);   
        add(p);
        b.setToolTipText("BUTTON");
          f.setToolTipText("TEXT FIELD");
      //  Border br =BorderFactory.createBevelBorder(BevelBorder.LOWERED);
    
     //  Border br =BorderFactory.createLineBorder(Color.BLACK, 3,false);
        Border br =BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED,3),"LOGIN", TitledBorder.LEFT,   TitledBorder.CENTER);
//ImageIcon i=new ImageIcon("C:\\Users\\amaan\\OneDrive\\Desktop\\OIP.jpg");
//b.setIcon(i);
      p.setBorder(br);
    setLayout(new FlowLayout());
    }
    
}