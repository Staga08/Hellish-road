package modelo;

public class Background implements IConstantes{
	
	
	
	
	private int limiteBoundSuperior;
	private int limiteBoundInferior;
	private int posXFirtsBack;
	private int posXSecondBack;
	private String imagen;
	private boolean avanzar;
	private int velocidad;
	private CaraJugador seleccionado;
	private CaraJugador disponibles;
	
	
	
	
	public Background() {
		
		imagen=	DABACKGROUND;
		disponibles=PLAYERS[0];
		disponibles.setSiguiente(PLAYERS[1]);
		disponibles.getSiguiente().setSiguiente(PLAYERS[2]);
		limiteBoundSuperior=LIMITESUPERIORDELBACKGROUND;
		limiteBoundInferior=LIMITEINFERIORDELBACKGROUND;
	
	
	
	}


	public int getPosXFirsBack() {
		return posXFirtsBack;
	}

	
	
	public void setPosXFirsBack(int posXFirsBack) {
		this.posXFirtsBack = posXFirsBack;
	}

	public void moverImagen1() {
		if(posXFirtsBack==TAMANHOPANEL) {
			posXFirtsBack=-TAMANHOPANEL;
		}else {
			posXFirtsBack+=1;
			}

	}
	
	
	public int getPosXSecondBack() {
		return posXSecondBack;
	}


	public void setPosXSecondBack(int posXSecondBack) {
		this.posXSecondBack = posXSecondBack;
	}

	
	public void moverImagen2() {
		if(posXSecondBack==TAMANHOPANEL) {
			posXSecondBack=-TAMANHOPANEL;
		}else {
			posXSecondBack+=1;
		}
	}
	
	
	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void detener() {
		avanzar=false;
	}

	public void avanzar() {
		avanzar=true;
	}


	public int getLimiteBoundSuperior() {
		return limiteBoundSuperior;
	}


	public void setLimiteBoundSuperior(int limiteBoundSuperior) {
		this.limiteBoundSuperior = limiteBoundSuperior;
	}


	public int getLimiteBoundInferior() {
		return limiteBoundInferior;
	}


	public void setLimiteBoundInferior(int limiteBoundInferior) {
		this.limiteBoundInferior = limiteBoundInferior;
	}


	public CaraJugador getSeleccionado() {
		return seleccionado;
	}


	public void setSeleccionado(CaraJugador seleccionado) {
		this.seleccionado = seleccionado;
	}


	public CaraJugador getDisponibles() {
		return disponibles;
	}


	public void setDisponibles(CaraJugador disponibles) {
		this.disponibles = disponibles;
	}

	

		


}