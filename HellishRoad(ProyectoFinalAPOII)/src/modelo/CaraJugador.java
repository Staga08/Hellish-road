package modelo;

public class CaraJugador extends Cara {
	

	private boolean movimientoArriba;
	private boolean movimientoAbajo;
	
	
	public CaraJugador(String imagen, int posX, int posY, int anchoImagen, int altoImagen, int velocidad) {
		super(imagen, posX, posY, anchoImagen, altoImagen, velocidad);
		
		movimientoArriba=false;
		movimientoAbajo=false;
	
	
	}
	
	public void moverCara(int boundUp, int boundDown) {
		if(movimientoArriba==true && super.getPosY()!=boundUp) {
			moverseArriba();
			}
	
		else if(movimientoAbajo==true && super.getPosX()!=boundDown){
			moverseAbajo();
			}
	
	}

	private void moverseArriba() {
		super.setPosY(super.getPosY()-1);
		
	}

	private void moverseAbajo() {
		super.setPosY(super.getPosY()+1);
		
	}







}
