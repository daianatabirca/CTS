package tabirca.daianamaria.g1087.simplefactory;

public class Canapea extends ProdusAbstract {

	boolean esteExtensibila;

	public Canapea(String categorie, int pret, boolean inStoc, int nrAniGarantie, boolean esteExt) {
		super(categorie, pret, inStoc, nrAniGarantie);
		this.esteExtensibila = esteExt;
	}

	@Override
	public void calculeazaAniGarantie() {
		if (this.pret > 5000) {
			this.setNrAniGarantie(10);
		} else {
			this.setNrAniGarantie(7);
		}

	}

	@Override
	public String toString() {
		return "Canapea [esteExtensibila=" + esteExtensibila + ", categorie=" + categorie + ", pret=" + pret + ", inStoc="
				+ inStoc + ", nrAniGarantie=" + nrAniGarantie + "]";
	}

}
