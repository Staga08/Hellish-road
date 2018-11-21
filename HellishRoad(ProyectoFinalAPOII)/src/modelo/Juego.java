package modelo;

import java.security.SecureRandom;

public class Juego implements IConstantes{
	
	private Background background;
	private CaraAdversario enemigo;
	private CaraJugador jugador;
	private int tamanio;
	
	public Juego() {
		
	}

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

	public CaraAdversario getEnemigo() {
		return enemigo;
	}

	public void setEnemigo(CaraAdversario enemigo) {
		this.enemigo = enemigo;
	}

	public CaraJugador getJugador() {
		return jugador;
	}

	public void setJugador(CaraJugador jugador) {
		this.jugador = jugador;
	}
	
	public void crearListaEnemigos(CaraAdversario caraEnemigo) {
		CaraAdversario nuevo = caraEnemigo;
        if (enemigo==null) {
        	enemigo = nuevo;
        } else{    
        	CaraAdversario aux = enemigo;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
//            crearListaEnemigos(aux.getSiguiente());
        }
        tamanio++;
	}
	
	public void crearEnemigos() {

		
		crearListaEnemigos(ENEMIES[0]);
		crearListaEnemigos(ENEMIES[1]);
		
	}
	
	public CaraAdversario enemigoRadom() {
		SecureRandom random = new SecureRandom();
		int randomEnemigo = random.nextInt(2);
		return enemigo.get(randomEnemigo);
	}
	

	public void crearListaJugadores(CaraJugador caraJ) {
		CaraJugador nuevo = caraJ;
        if (jugador==null) {
        	jugador = nuevo;
        } else{    
        	CaraJugador aux = jugador;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
//            crearListaEnemigos(aux.getSiguiente());
        }
        tamanio++;

	}


	public void crearJugador() {
		crearListaJugadores(PLAYERS[0]);
		
	}

	






}