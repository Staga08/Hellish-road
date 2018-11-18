package modelo;

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





}
