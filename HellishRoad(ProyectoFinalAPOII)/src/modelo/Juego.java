package modelo;

import java.security.SecureRandom;

public class Juego {
	
	private Background background;
	private CaraAdversario enemigo;
	private CaraJugador jugador;
	private Jugador usuario;
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
		CaraAdversario aux = enemigo;
        if (enemigo==null) {
        	enemigo = nuevo;
        } else{    
        	
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            	aux.setSiguiente(nuevo);
//            crearListaEnemigos(aux.getSiguiente());
        	}
        tamanio++;
	}
	
	public void crearEnemigos() {

		CaraAdversario busta = new CaraAdversario("data/busta.jpeg", 300, 12, 100, 100, 5);
		CaraAdversario frapi = new CaraAdversario("data/frapi.jpeg", 400, 200, 100, 100, 5);
		CaraAdversario yaker = new CaraAdversario("data/jackTheRipper.jpeg", 450, 62, 100, 100, 5);
		
		crearListaEnemigos(busta);
		crearListaEnemigos(frapi);
		crearListaEnemigos(yaker);
		
	}
	
	public CaraAdversario get(int index) {
		int c = 0;
		CaraAdversario temp = enemigo;
		
			while (temp!=null&&c<index) {
				
				temp=temp.getSiguiente();
				c++;
			}
		return temp;
	}
	
	public CaraAdversario enemigoRadom() {
		SecureRandom random = new SecureRandom();
		int randomEnemigo = random.nextInt(3);
		return get(randomEnemigo);
	}
	
	public void agregarUsuarios(Jugador actual, Jugador nuevo) {
		if (usuario==null) {
			usuario=nuevo;
		}else {
			if (nuevo.getPuntaje()<=actual.getPuntaje()) {
				if (actual.getIzq()==null) {
					actual.setIzq(nuevo);
				}else {
					agregarUsuarios(actual.getIzq(), nuevo);
				}
			
			}else {
				if (nuevo.getPuntaje()>=actual.getPuntaje()) {
					if (actual.getDer()==null) {
						actual.setDer(nuevo);
					}else {
						agregarUsuarios(actual.getDer(), nuevo);
					}
				}
			}
		}
	}
	

}