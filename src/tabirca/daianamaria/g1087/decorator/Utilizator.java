package tabirca.daianamaria.g1087.decorator;

public abstract class Utilizator {

	protected String nume;
	protected String prenume;
	protected int nrPenalizari;

	public Utilizator(String nume, String prenume, int nrPen) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.nrPenalizari = nrPen;
	}

	public abstract void reducereComanda(int nrComenzi);

	public abstract void suspendareCont();

	public abstract void recuperareCont(int timpAsteptare);

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public int getNrPenalizari() {
		return nrPenalizari;
	}

	public void setNrPenalizari(int nrPenalizari) {
		this.nrPenalizari = nrPenalizari;
	}

}
