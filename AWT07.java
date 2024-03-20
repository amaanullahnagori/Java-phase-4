import java.lang .*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
class AWT07
{
    public static void main(String[] args) {
        MyFrame07 mf=new MyFrame07();
        mf.setSize(600,400);
        mf .setVisible(true);
    }
}
class MyFrame07 extends Frame implements AdjustmentListener
       {

    TextField tf;
    Scrollbar red ,green,blue ;
    
    MyFrame07()
    {
        red=new Scrollbar (Scrollbar.HORIZONTAL,0,20,0,255);
        green=new Scrollbar (Scrollbar.HORIZONTAL,0,20,0,255);
        blue=new Scrollbar (Scrollbar.HORIZONTAL,0,20,0,255);
       
        
       tf=new TextField(20);
        tf.setBounds(150, 50, 300, 50);
         red.setBounds(150,170,300,30);
             green.setBounds(150,120,300,30);
                 blue.setBounds(150,220,300,30);
        
        add(tf);
        add (green);
        add(red);
        
        add (blue);
    
 blue.addAdjustmentListener(this);
  red.addAdjustmentListener(this);
   green.addAdjustmentListener(this);
   
        setLayout(null);
    }
    
    public void adjustmentValueChanged(AdjustmentEvent e) {
        
            tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
        
        
    }
    
}