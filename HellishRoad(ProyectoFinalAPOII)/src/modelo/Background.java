package modelo;

public class Background implements IConstantes{
	
	public static final String DABACKGROUND = "data/background.gif";
	
	
	
	private int posXFirtsBack;
	private int posXSecondBack;
	private String imagen;
	private boolean avanzar;
	private int velocidad;
	
	
	
	public Background() {
		imagen=	DABACKGROUND;
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

	

		


}