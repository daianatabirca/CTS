package tabirca.daianamaria.g1087.simplefactory;

public class Scaun extends ProdusAbstract {

	int dimensiuneL;
	int dimensiunel;
	int dimensiuneH;

	public Scaun(String categorie, int pret, boolean inStoc, int nrAniGarantie, int dimL, int diml, int dimH) {
		super(categorie, pret, inStoc, nrAniGarantie);
		this.dimensiuneL = dimL;
		this.dimensiunel = diml;
		this.dimensiuneH = dimH;

	}

	@Override
	public void calculeazaAniGarantie() {

		if (this.pret > 300) {
			this.setNrAniGarantie(3);
		} else {
			this.setNrAniGarantie(1);
		}

	}

	@Override
	public String toString() {
		return "Scaun [dimensiuneL=" + dimensiuneL + ", dimensiunel=" + dimensiunel + ", dimensiuneH=" + dimensiuneH
				+ ", categorie=" + categorie + ", pret=" + pret + ", inStoc=" + inStoc + ", nrAniGarantie="
				+ nrAniGarantie + "]";
	}

}
