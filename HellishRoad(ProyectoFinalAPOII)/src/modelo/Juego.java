package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;




import excepciones.JugadorNoEncontradoException;
import javax.crypto.spec.IvParameterSpec;


import excepciones.PuntajeNoExisteException;

public class Juego implements IConstantes{

	
	private Background background;
	private CaraAdversario enemigo;
	private CaraJugador jugador;
	private Jugador usuario;
	private int tamanio;
	private ArrayList<Jugador> users;
	
	public Juego() {
		users = new ArrayList<Jugador>();
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

		crearListaEnemigos(ENEMIES[0]);
		crearListaEnemigos(ENEMIES[1]);

		//CaraAdversario yaker = new CaraAdversario("data/jackTheRipper.jpeg", 500, 62, 100, 100, 5);
		
		crearListaEnemigos(busta);
		crearListaEnemigos(frapi);
		crearListaEnemigos(yaker);

		
	}
	
	public CaraAdversario get(int index) {
		int c = 0;
		CaraAdversario temp = enemigo;
		
			while (temp!=null && c<index) {
				
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
	
	public void resetEnemigos() {
		SecureRandom random = new SecureRandom();
		int randomPosY = random.nextInt(330);
		
		if (get(0).getPosX()<0) {
			get(0).setPosX(700);
			get(0).setPosY(randomPosY);
			get(0).setImagen(enemigoRadom().getImagen());
		}
		if (get(1).getPosX()<0) {
			get(1).setPosX(700);
			get(1).setPosY(randomPosY);
			get(1).setImagen(enemigoRadom().getImagen());
		}
		if (get(2).getPosX()<0) {
			get(2).setPosX(700);
			get(2).setPosY(randomPosY);
			get(2).setImagen(enemigoRadom().getImagen());
		}
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
	
	public Jugador buscarPuntaje(Jugador actual, int puntaje) throws PuntajeNoExisteException {
		if(actual.getPuntaje()==puntaje) {
			return actual;
		}else {
			if(puntaje<actual.getPuntaje()) {
				if(actual.getIzq()!=null) {
					return buscarPuntaje(actual.getIzq(), puntaje);
				}else {
					throw new PuntajeNoExisteException(puntaje);
				}
			}else {
				if(actual.getDer()!=null) {
					return buscarPuntaje(actual.getDer(), puntaje);
				}else {
					throw new PuntajeNoExisteException(puntaje);
				}
			}
		}
	} 
	
//	public void listaUsuarios() {
//        if (usuario.getIzq()!=null) {
//			usuario.getIzq().;
//		}
//        acumulado.add(nombre);
//        
//        if (usuario.getDer()!=null) {
//			usuario.getIzq().inorden(acumulado);
//		}
//	}
//	
//	public void guardar() {
//		FileOutputStream fS = null;
//		ObjectOutputStream oS = null;
//		try {
//			fS = new FileOutputStream("src/data/Ranking.ser");
//			oS = new ObjectOutputStream(fS);
//			oS.writeObject(usuario);
//		} catch (IOException ex) {
//			System.out.println(ex.getMessage());
//		} finally {
//			try {
//				if (usuario != null) {
//					fS.close();
//				}
//				if (oS != null) {
//					oS.close();
//				}
//			} catch (IOException ex) {
//				System.out.println(ex.getMessage());
//			}
//		}
//	}
//	
//	public void recuperarData() {
//		FileInputStream fS = null;
//		ObjectInputStream oS = null;
//		ArrayList<Jugador> users = null;
//		try {
//			fS = new FileInputStream("src/data/Ranking.ser");
//			oS = new ObjectInputStream(fS);
//			users = (ArrayList<Jugador>) oS.readObject();
////			setJugadores(users);
//		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
//		} finally {
//			try {
//				if (fS != null) {
//					fS.close();
//				}
//				if (oS != null) {
//					oS.close();
//				}
//			} catch (IOException e) {
//				System.out.println(e.getMessage());
//			}
//		}
//	}
	
}

	






