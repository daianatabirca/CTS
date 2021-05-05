package tabirca.daianamaria.g1087.simplefactory;

public class Fotoliu extends ProdusAbstract {

	String culoare;

	public Fotoliu(String categorie, int pret, boolean inStoc, int nrAniGarantie, String cul) {
		super(categorie, pret, inStoc, nrAniGarantie);
		this.culoare = cul;
	}

	@Override
	public void calculeazaAniGarantie() {
		if (this.culoare.equals("Negru")) {
			this.setNrAniGarantie(8);
		} else {
			this.setNrAniGarantie(5);
		}

	}

	@Override
	public String toString() {
		return "Fotoliu [culoare=" + culoare + ", categorie=" + categorie + ", pret=" + pret + ", inStoc=" + inStoc
				+ ", nrAniGarantie=" + nrAniGarantie + "]";
	}

}
