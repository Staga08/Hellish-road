package application;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.IConstantes;

public class VentanaPController {
	
	@FXML private ImageView background;
	@FXML private ImageView enemigo1;
	@FXML private ImageView enemigo2;
	@FXML private ImageView enemigo3;
	
	public VentanaPController() {
		
	}
	
	public void initialize() {
		cargarBackground();
		cagarEnemigos();
	}
	
	public void cargarBackground() {
		background.setImage(new Image(new File(IConstantes.DABACKGROUND).toURI().toString()));
		background.setFitHeight(400);
		background.setFitWidth(700);
	}
	
	public void cagarEnemigos() {
		Main.getJ().crearEnemigos();
		enemigo1.setImage(new Image(new File(Main.getJ().enemigoRadom().getImagen()).toURI().toString()));
		enemigo1.setFitHeight(100);
		enemigo1.setFitWidth(100);
	}
	
	
	
}
