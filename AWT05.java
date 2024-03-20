
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class AWT05
{
    public static void main(String[] args) {
        MyFrame02 mf =new MyFrame02();
        mf.setSize(400, 400);
        mf.setVisible(true);
        
    
}
}
class MyFrame02 extends Frame implements ItemListener 
{
    Label l;
    Checkbox c1,c2;
    CheckboxGroup cg;
    public MyFrame02()
    {
        super ("CHECK BOX ");
        l=new Label ("NOTHING IS SELECTED ");
    
        cg=new CheckboxGroup();
        
        c1=new Checkbox("JAVA",false,cg);
        c2=new Checkbox ("C++",false,cg);
     
        setLayout( new FlowLayout());
       
        c1.addItemListener(this);
       c2.addItemListener(this);
     
       
       add(l);
       add(c1);
       add(c2);
       
        
    }
    
    


    public void itemStateChanged(ItemEvent e) {
        
    String str="" ;
    if (c1.getState()==true)
          str=str+"JAVA"+" ";
  if (c2.getState()==true)
         str=str+"C++";
    
    if (str.equals(""))
        str="NOTHING IS SELECTED ";
    l.setText(str);
    }
    
    
}