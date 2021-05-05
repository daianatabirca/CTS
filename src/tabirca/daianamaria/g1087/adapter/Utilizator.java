package tabirca.daianamaria.g1087.adapter;

public abstract class Utilizator {

	protected String nume;
	protected String prenume;
	protected int nrPenalizari;
	protected int valoareComanda;

	public Utilizator(String nume, String prenume, int nrPen, int valComanda) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.nrPenalizari = nrPen;
		this.valoareComanda = valComanda;
	}

	public abstract void reducereComanda(int nrComenzi);

	public abstract void suspendareCont();

	public abstract void recuperareCont(int timpAsteptare);
	
	public abstract void trimiteComanda();

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public int getNrPenalizari() {
		return nrPenalizari;
	}
	
	public int getValoareComanda() {
		return valoareComanda;
	}

	public void setNrPenalizari(int nrPenalizari) {
		this.nrPenalizari = nrPenalizari;
	}

}
