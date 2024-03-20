
import static java.awt.SystemColor.window;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import static javax.management.Query.TIMES;


 public class FX04 extends Application implements EventHandler
{
Slider s;
TextArea t;
Button b;
DatePicker p;
ColorPicker c;
 Font f;

    @Override
    public void start(Stage stage) throws Exception {
        s =new Slider ();
        t=new TextArea();
        t.setMaxHeight(400);
        t.setMaxWidth(600);
       
        s.setMajorTickUnit(10);
        s.setMinorTickCount(1);
        s.setShowTickMarks(true);
        s.setShowTickLabels(true);
        
        
        b=new Button("OPEN FILE ");
   //    b.autosize();
       b.setDefaultButton(true);
      b.setTextFill(Color.BLACK);
      b.setOpacity(100);
      
      p=new DatePicker ();
      p.setShowWeekNumbers(true);
     
       c=new ColorPicker ();
      c.setOpacity(50);
      
        
        VBox vb=new VBox(t,s,b,c,p);
       vb.setAlignment(Pos.TOP_CENTER);
       BackgroundFill backgroundfill = new BackgroundFill(Color.PINK, 
                                          CornerRadii.EMPTY, Insets.EMPTY);
  
       Background b1=new Background (backgroundfill);
      
//FileInputStream f=new FileInputStream ("C:\\Users\\amaan\\OneDrive\\Desktop\\image.jfif");
//Image i=new Image (f);
//
//BackgroundImage bi=new BackgroundImage (i,BackgroundRepeat.NO_REPEAT, 
//                                             BackgroundRepeat.NO_REPEAT, 
//                                              BackgroundPosition.DEFAULT, 
//                                                BackgroundSize.DEFAULT);
//Background b1=new Background (bi); 
//vb.setBackground(b1);
vb.setBackground(b1);


Scene s1=new Scene (vb);
      stage.setScene(s1);
      stage.setHeight(600);
      stage.setWidth(600);
      stage.setTitle("JAVA FX ");
      stage.show();
   
         s.valueProperty().addListener(e->t.setFont(Font.font(s.getValue())));
       
  c.setOnAction(f->{
                               String str =t.getText();
                                  Color cp=c.getValue();
                     t.setStyle("-fx-text-fill:#"+c.getValue().toString().substring(2,8)); 
                                 });
    
   b.setOnAction(this);
    p.setOnAction(e->{
        
        t.setText(p.getValue().toString());
            });
    
    }
    public static void main(String[] args) {
        launch (args);
    }

    @Override
    public void handle(Event y) {
   
      Window w=null;
        FileChooser fc=new FileChooser ();
              File g=  fc.showOpenDialog(w);
                
    try { 
        FileInputStream fs =new FileInputStream (g);
        byte b[]=new byte[fs.available()];
        fs.read(b);
        String s=new String (b);
        t.setText(s);  }
    
    catch (Exception e){
        System.out.println("FILE NOT FOUND");
        System.out.println(e.toString());
        
    }

           
   
    }

 
    
    }

        