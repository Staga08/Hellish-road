package modelo;

public interface IConstantes {
	public static final String SELECTION1="";
	public static final String FARINEZ="";
	public static final String SELECTION2="";
	public static final String BRITO="";
	public static final String SELECTION3="";
	public static final String BRYAN="";
	
	public static final int POSYINICIALCARA = 450;
	public static final int POSXINICIALCARA = 176;
	public static final int TAMANHOCARA=100;
//	public static final int ANCHOCARA=0;
	public static final int VELOCIDADI=15;
	
	public static final String DABACKGROUND = "data/background.gif";
	public static final int LIMITESUPERIORDELBACKGROUND = 229;
	public static final int LIMITEINFERIORDELBACKGROUND= 136;
	public static final int POSINICIALBACK=0;
	public static final int TAMANHOPANEL=600;
	
	public final static CaraJugador[] PLAYERS= {
			new CaraJugador(BRITO, POSYINICIALCARA, POSXINICIALCARA,TAMANHOCARA, TAMANHOCARA,VELOCIDADI),	
			new CaraJugador(BRYAN, POSYINICIALCARA, POSXINICIALCARA, TAMANHOCARA, TAMANHOCARA, VELOCIDADI),
			new CaraJugador(FARINEZ, POSYINICIALCARA, POSXINICIALCARA, TAMANHOCARA, TAMANHOCARA, VELOCIDADI)
	
	
	};
}
