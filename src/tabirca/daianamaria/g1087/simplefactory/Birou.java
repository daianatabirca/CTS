package tabirca.daianamaria.g1087.simplefactory;

public class Birou extends ProdusAbstract {

	String material;

	public Birou(String categorie, int pret, boolean inStoc, int nrAniGarantie, String mat) {
		super(categorie, pret, inStoc, nrAniGarantie);
		this.material = mat;
	}

	@Override
	public void calculeazaAniGarantie() {
		this.setNrAniGarantie(4);

	}

	@Override
	public String toString() {
		return "Birou [material=" + material + ", categorie=" + categorie + ", pret=" + pret + ", inStoc=" + inStoc
				+ ", nrAniGarantie=" + nrAniGarantie + "]";
	}

}
