/*
 * Class: CMSC204 - 30377
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: Exception JUnit Test cases
 * Due: 2.6.2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Felipe Machado
*/

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.JFrame;

public class PasswordDriverFX extends Application{
	
   
   public static void main(String[] args){
	   launch(args);
   }
   
   public void start(Stage stage)
   {

	   //call the main scene which is a BorderPane
	   PasswordMain mainPane = new PasswordMain();
	   //PasswordMain root = mainPane.getTopContainer();
	   Scene scene = new Scene(mainPane, 550, 350);
	   stage.setScene(scene);
	   stage.setTitle("Password Checker");
	   stage.show();
   }
   
}
