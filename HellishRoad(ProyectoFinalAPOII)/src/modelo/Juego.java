package modelo;

import java.security.SecureRandom;

public class Juego {
	
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
        }
        tamanio++;
	}
	
	public void crearEnemigos() {

		CaraAdversario busta = new CaraAdversario("Busta", 10, 12, 100, 100, 5);
		CaraAdversario yasmin = new CaraAdversario("yasmin", 10, 12, 100, 100, 5);
		CaraAdversario yaker = new CaraAdversario("Jaker", 10, 12, 100, 100, 5);
		
		crearListaEnemigos(busta);
		crearListaEnemigos(yasmin);
		
	}
	
	public CaraAdversario enemigoRadom() {
		SecureRandom random = new SecureRandom();
		int randomEnemigo = random.nextInt(10);
		return enemigo.get(randomEnemigo);
	}
	

}
