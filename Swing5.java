
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Swing5
{
    public static void main(String[] args) {
    MyFrame05  mf =new MyFrame05();
    mf.setSize(500,500);
    mf.setVisible(true);
    mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
}

class MyFrame05 extends JFrame implements ListSelectionListener
{
    JLabel o;
   JSplitPane s;
  JList l;
  JScrollPane j1,j2;
  
 MyFrame05()
 { 
     
     String str []={"RED","BLUE","GREEN","BLACK"};
     l=new JList(str);
     j1=new JScrollPane(l);
     
     o=new JLabel ();
     o.setBackground(Color.red);
     o.setOpaque(true);
     j2=new JScrollPane(o);
     
    l.addListSelectionListener(this);
     
         
    s=new JSplitPane (JSplitPane.HORIZONTAL_SPLIT,j1,j2);
  
 
  add(s);
     
     
 }
 @Override
    public void valueChanged(ListSelectionEvent e) {
 String s=(String)l.getSelectedValue();
switch (s)
{
    case "RED":
    {o.setBackground(Color.red);
    break;}
    case "GREEN":
    {o.setBackground(Color.GREEN);
    break;}
    case "BLUE":
    {o.setBackground(Color.BLUE);
    break;}
    default:
     {o.setBackground(Color.BLACK);}

        
}
    }
}