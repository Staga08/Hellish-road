package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.stage.Stage;
import modelo.IConstantes;
import modelo.Juego;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private static Juego j = new Juego();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("VentanaP.fxml"));
			primaryStage.getIcons().add(new Image(new File("data/Icon.png").toURI().toString()));
			primaryStage.setTitle("Hellish Road");
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public static Juego getJ() {
		return j;
	}
	
}
