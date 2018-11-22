package application;

import java.io.File;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import modelo.IConstantes;

public class VentanaPController {
	
	@FXML private ImageView background;
	@FXML private ImageView enemigo1;
	@FXML private ImageView enemigo2;
	@FXML private ImageView enemigo3;

	@FXML private ImageView jugador;

	@FXML private Timeline hilo;

	
	public VentanaPController() {
		
	}
	
	public void initialize() {
		cargarBackground();
		cagarEnemigos();

		moverEnemigos();
	}
	
	public void cargarBackground() {
		background.setImage(new Image(new File(IConstantes.DABACKGROUND).toURI().toString()));
		background.setFitHeight(400);
		background.setFitWidth(700);
	}
	
	public void cagarEnemigos() {
		Main.getJ().crearEnemigos();
		enemigo1.setImage(new Image(new File(Main.getJ().enemigoRadom().getImagen()).toURI().toString()));
		enemigo1.setFitHeight(80);
		enemigo1.setFitWidth(80);
//		enemigo1.setLayoutX(700);
//		enemigo1.setLayoutY(Main.getJ().get(0).getPosY());
		enemigo2.setImage(new Image(new File(Main.getJ().enemigoRadom().getImagen()).toURI().toString()));
		enemigo2.setFitHeight(80);
		enemigo2.setFitWidth(80);
//		enemigo2.setLayoutX(700);
//		enemigo2.setLayoutY(Main.getJ().get(1).getPosY());
		enemigo3.setImage(new Image(new File(Main.getJ().enemigoRadom().getImagen()).toURI().toString()));
		enemigo3.setFitHeight(80);
		enemigo3.setFitWidth(80);
//		enemigo3.setLayoutX(700);
//		enemigo3.setLayoutY(Main.getJ().get(2).getPosY());
	}
	
//	public void cargarJugador() {
//		Main.getJ().crearJugador();
//		jugador.setImage(new Image(new File(Main.getJ().getJugador().getImagen()).toURI().toString()));
//		jugador.setFitHeight(100);
//		jugador.setFitHeight(100);
//	
//	}
//	

	public void moverEnemigos() {
		hilo = new Timeline(new KeyFrame(Duration.millis(30), f-> {
			Main.getJ().resetEnemigos();
			Main.getJ().get(0).moverAdelante();
			Main.getJ().get(1).moverAdelante();
			Main.getJ().get(2).moverAdelante();
			enemigo1.setX(Main.getJ().get(0).getPosX());
			enemigo1.setY(Main.getJ().get(0).getPosY());
			enemigo2.setX(Main.getJ().get(1).getPosX());
			enemigo2.setY(Main.getJ().get(1).getPosY());
			enemigo3.setX(Main.getJ().get(2).getPosX());
			enemigo3.setY(Main.getJ().get(2).getPosY());
		}));
		hilo.setCycleCount(Timeline.INDEFINITE);
		hilo.play();
	}

	
	
	
}
