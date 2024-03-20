
import javafx.application.Application;
//import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author amaan
 */
public  class FX02  extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

launch (args);    }

    @Override
    public void start(Stage stage) throws Exception {
   Button b=new Button ("Click");
        FlowPane f=new FlowPane ();
    f.getChildren().add(b);
    
    Scene s=new Scene (f);
    stage.setScene(s);
stage.show();    }
    
}
