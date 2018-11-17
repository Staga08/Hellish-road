package modelo;

public class Background {
	
	public static final String DABACKGROUND = "data/background.gif";
	public static final int POSYINICIALCARA = 450;
	public static final int POSXINICALCARA = 176;
	public static final int LIMITESUPERIORDELBACKGROUND = 229;
	public static final int LIMITEINFERIORDELBACKGROUND= 136;
	public static final int POSINICIAL=0;
	public static final int TAMANHOPANEL=600;
	
	private int posXFirtsBack;
	private int posXSecondBack;
	private String imagen;
	private boolean avanzar;
	private int velocidad;
	private CaraAdversario enemigo;
	
	
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