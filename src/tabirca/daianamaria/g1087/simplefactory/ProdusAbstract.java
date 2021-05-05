package tabirca.daianamaria.g1087.simplefactory;

public abstract class ProdusAbstract {

	String categorie;
	int pret;
	boolean inStoc;
	int nrAniGarantie;

	public void setPret(int pret) {
		this.pret = pret;
	}

	public void setNrAniGarantie(int nrAniGarantie) {
		this.nrAniGarantie = nrAniGarantie;
	}

	public ProdusAbstract(String categorie, int pret, boolean inStoc, int nrAniGarantie) {
		super();
		this.categorie = categorie;
		this.pret = pret;
		this.inStoc = inStoc;
		this.nrAniGarantie = nrAniGarantie;
	}

	public abstract void calculeazaAniGarantie();

}
