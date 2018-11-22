package modelo;

public class Jugador {
	
	private String nickname;
	private int puntaje;
	private Jugador izq;
	private Jugador der;
	
	public Jugador(String nickname, int puntaje) {
		this.nickname = nickname;
		this.puntaje = puntaje;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Jugador getIzq() {
		return izq;
	}

	public void setIzq(Jugador izq) {
		this.izq = izq;
	}

	public Jugador getDer() {
		return der;
	}

	public void setDer(Jugador der) {
		this.der = der;
	}

}
