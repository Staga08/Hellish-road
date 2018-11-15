package modelo;

public class Cara {
	
	private String imagen;
	private int posX;
	private int posY;
	private int anchoImagen;
	private int altoImagen;
	private int velocidad;
	
	
	public Cara(String imagen, int posX, int posY,int anchoImagen, int altoImagen, int velocidad) {
		this.imagen=imagen;
		this.posX=posX;
		this.posY=posY;
		this.anchoImagen=anchoImagen;
		this.altoImagen=altoImagen;
		this.velocidad=velocidad;
		
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public int getAnchoImagen() {
		return anchoImagen;
	}


	public void setAnchoImagen(int anchoImagen) {
		this.anchoImagen = anchoImagen;
	}


	public int getAltoImagen() {
		return altoImagen;
	}


	public void setAltoImagen(int altoImagen) {
		this.altoImagen = altoImagen;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	
	public void aumentarVelocidad() {
		velocidad-=1;
	}
	
	
	public void disminuirVelocidad() {
		velocidad+=1;
	}
	
	
	public void moverAdelante() {
		posY-=1;
	}
	
	
	public void moverAtras() {
		posY+=1;
	}


}
