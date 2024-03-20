
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

class Swing8
{
    public static void main(String[] args) {
 MyFrame08 m1=new MyFrame08();
 m1.setVisible(true );
 m1.setSize(400,400);
}
}
class MyFrame08 extends JFrame implements ActionListener 
{
       JTextArea j;
      JToolBar t;
       JButton b;
       MyFrame08()
       {
           ImageIcon i=new ImageIcon("C:\\Users\\amaan\\OneDrive\\Desktop\\Save21.jpg");
      
           b=new JButton(i);
           t=new JToolBar ();
           t.add(b);
           add(t,BorderLayout.NORTH);
           b.setActionCommand("Open");
           b.addActionListener(this );
           
      j =new JTextArea ();
                     add(j,BorderLayout.SOUTH);

          


       }

    @Override
    public void actionPerformed(ActionEvent e) {
if (b.getActionCommand().equals("Open"))
{
   JFileChooser c=new JFileChooser();
   c.showOpenDialog(this);
   File f= c.getSelectedFile();
   try{
       FileInputStream fs =new FileInputStream (f);
       byte b[]=new byte[fs.available()];
       fs.read(b);
       String str =new String (b);
       j.setText(str);
       
       
   }
   catch(Exception e1)
   {}
   
   
}

    }
}