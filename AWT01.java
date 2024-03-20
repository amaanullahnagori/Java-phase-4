import java.awt.*;

class AWT01
{
    public static void main(String[] args) {
    Frame f =new Frame ("My app ");
    f.setSize(300,300);
    f.setLayout(new FlowLayout());


    Button b =new Button ("Ok");
    Label l =new Label ("Name");
    TextField t =new TextField(20);
    
    f.add(l);
    f.add(t);
    f.add(b);
    
    f.setVisible(true);
    
    
    
}
}