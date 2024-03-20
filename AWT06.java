import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent; 
import java.awt.event.TextListener;

class AWT06
{
    public static void main(String[] args) {
        MyFrame06 mf=new MyFrame06 ();
        mf.setSize(400,400);
        mf.setVisible(true);
    
}
}



class MyFrame06 extends Frame implements TextListener,ActionListener
{
    Label l1,l2;
    TextField t;
    MyFrame06()
    {
        l1=new Label ("No text enter entered text field is blank ");
        l2=new Label ("Enter key is not yet hit");
        t=new TextField (20);
       // t.setEchoChar('*');
        setLayout(new FlowLayout());
        add(l1);
         add(t);
         add(l2);
        t.addActionListener(this);
       t.addTextListener(this);
        
    }

 
    public void textValueChanged(TextEvent e) {
        l1.setText(t.getText());
        
    }

   
    public void actionPerformed(ActionEvent e) {
     l2.setText(t.getText());
    }
    
}