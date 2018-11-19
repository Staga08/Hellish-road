package modelo;

import javax.xml.transform.Templates;

public class CaraAdversario extends Cara {
	
	private CaraAdversario siguiente;

	public CaraAdversario(String imagen, int posX, int posY, int anchoImagen, int altoImagen, int velocidad) {
		super(imagen, posX, posY, anchoImagen, altoImagen, velocidad);
		this.siguiente = null;
	}

	public CaraAdversario getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(CaraAdversario siguiente) {
		this.siguiente = siguiente;
	}
	
	public CaraAdversario get(int index) {
		int c = 0;
		CaraAdversario temp = siguiente;
		if (c<index) {
			while (siguiente!=null) {
				temp=siguiente.getSiguiente();
			}
			c++;
		}
		return temp;
	}





}
