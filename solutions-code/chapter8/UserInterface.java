package chapter8;

import java.time.LocalDateTime;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UserInterface extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Label label = new Label(LocalDateTime.now().toString());
		Button button = new Button("Now");
		button.setOnAction(e -> label.setText(LocalDateTime.now().toString()));
		
		Parent root = null; // Initialize with a component graph
		primaryStage.setScene(new Scene(new HBox(label,button)));
		primaryStage.show();
	}

}
