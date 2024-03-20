
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

class Swing4
{
    public static void main(String[] args) {
        MyFrame04 mf=new MyFrame04();
        mf.setSize (600,400);
        mf.setVisible(true);
    
}
}
class MyInternalFrame extends JInternalFrame 
{
    JTextArea a;
 JMenu m;
JMenuItem save;
JMenuBar b;
   
MyInternalFrame ()
{
    save =new JMenuItem("Save");
    m=new JMenu ("Files");
    b=new JMenuBar ();
    
    
    m.add(save);
    b.add(m);
    setJMenuBar(b);
    
    
    a=new JTextArea ();
    
    
         setSize(300,300);
        setLocation(50,50);
        setVisible(true);
}
    
    
}

class MyFrame04 extends JFrame implements ActionListener 
{
    JMenu m2;
    JMenuBar b1;
    JMenuItem n;
    JDesktopPane dp;
    
    MyFrame04()
    {
        n=new JMenuItem("New");
        m2=new JMenu("Files");
        b1=new JMenuBar();
     m2.add(n);
        b1.add(m2);
        
        setJMenuBar (b1);
        
        n.addActionListener (this );
    }
    public void actionPerformed(ActionEvent e) {

 MyInternalFrame i=new  MyInternalFrame();
 dp.add(i);
 
    }
    
    
    
}


