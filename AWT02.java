import java.awt.*;
class AWT02
{
    public static void main(String[] args) {
            
        MyFrame mf=new MyFrame (300,300);
        mf.setVisible (true);
    }
}
class MyFrame extends Frame 
{
    Label l;
    TextField t;
    Button b;
    
    public MyFrame (int m,int  n)
    {
        super ("My App");
        l=new Label ("Name");
        t=new TextField (30);
        b=new Button ("OK");
       
        setSize (m,n);
       
        add(l);
        add(t);
        add (b); 
       
        setLayout(new FlowLayout());
        
        
    }
}
