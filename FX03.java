

import java.awt.event.ActionEvent;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


public class FX03 extends Application implements EventHandler
        
{
    Alert a1,a2;
     Button b;
    int count =0;
    public static void main(String[] args) {
        launch (args);
    }

    public void start(Stage stage) throws Exception {
       
        Tooltip t=new Tooltip("Counter");
       b=new Button ("CLI_CK ME ");
        b.setTooltip(t);
        b.setOnAction(this);
        b.setTextFill(Color.RED);
        b.setMnemonicParsing(true);
        
        
        a1=new Alert(AlertType.WARNING,"STOP TAKE REST I AM MACHINE YOU ARE NOT");
               a2=new Alert(AlertType.ERROR,"I WILL CLOSE");

        
        
        
        FlowPane f=new FlowPane (b);
         f.setAlignment(Pos.CENTER);
         Scene s= new Scene (f);
     
         
         stage.setMaxHeight(500);
      stage.setMaxWidth(500);
     stage.setMaximized(true);
      stage.setScene(s);
      stage.show();
    }

    @Override
    public void handle(Event t) {
count++;
String str =Integer.toString(count);
b.setText(str);
if (str.equals("15"))
{
    a1.show ();
}
if (str.equals("20"))
        {  
            a2.showAndWait();
           System.exit(0);

    }

    }
    }

    