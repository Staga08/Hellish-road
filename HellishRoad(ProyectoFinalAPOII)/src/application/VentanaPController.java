package application;

import java.awt.Event;
import java.awt.RenderingHints.Key;
import java.io.File;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.util.Duration;
import modelo.IConstantes;

public class VentanaPController {
	
	@FXML private ImageView background;
	@FXML private ImageView enemigo1;
	@FXML private ImageView enemigo2;
	@FXML private ImageView enemigo3;
	@FXML private ImageView jugador;
	@FXML private Timeline hilo;
	@FXML private Button j;

	
	public VentanaPController() {
		
	}
	
	public void initialize() {
		cargarBackground();
		cagarEnemigos();
		moverEnemigos();
		cargarJugador();
		moverJugador();
		moverBackground();
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
	}
	

	public void moverEnemigos() {
		hilo = new Timeline(new KeyFrame(Duration.millis(30), f-> {
			
			Main.getJ().get(0).moverAdelante();
			enemigo1.setLayoutX(Main.getJ().get(0).getPosX());
			Main.getJ().resetEnemigos();
			
		}));
		hilo.setCycleCount(Timeline.INDEFINITE);
		hilo.play();
	}

	public void cargarJugador() {
		Main.getJ().crearJugador();
		jugador.setImage(new Image(new File(Main.getJ().getJugador().getImagen()).toURI().toString()));
		jugador.setFitHeight(80);
		jugador.setFitWidth(80);
		jugador.setLayoutX(100);
		jugador.setLayoutY(100);
	}
	
	public void moverJugador() {
		j.setOnKeyPressed(e ->{
			if (e.getCode()==KeyCode.UP) {
				System.out.println("you has pressed");
			}
		});
	}

	public void moverBackground() {
		hilo= new Timeline(new KeyFrame(Duration.millis(30), f->{
			Main.getJ().getBackground().getVelocidad();
			Main.getJ().getBackground().moverBackground();
		
		
		
		}));
	}
	
	
}
