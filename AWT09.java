import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class AWT09
{
    public static void main(String[] args) {
        MyFrame09 mf=new MyFrame09();
       mf.setSize(600, 400);
        mf.setVisible(true);
    }
}
class MyFrame09 extends Frame implements ActionListener 
{
TextArea ta ;
Label l;
Button b;
    TextField  t;
MyFrame09()           
{
    ta=new TextArea ();
    l=new Label ("Nothing is Print");
    b=new Button("CLICK");
     t=new TextField (20);    
    setLayout(new FlowLayout());
  
   
   add(ta);
    add(l);
   
    add(t);
     add(b);
    
    b.addActionListener(this);
    
}

   
    public void actionPerformed(ActionEvent e) {
      t.setText(ta.getText());
      l.setText("Something is Written ");

    }
    
}