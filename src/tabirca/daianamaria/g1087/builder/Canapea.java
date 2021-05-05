package tabirca.daianamaria.g1087.builder;

import tabirca.daianamaria.g1087.builder.module.InterfataBrand;
import tabirca.daianamaria.g1087.builder.module.InterfataGarantie;
import tabirca.daianamaria.g1087.builder.module.InterfataOrigine;
import tabirca.daianamaria.g1087.builder.module.InterfataPret;

public class Canapea {

	String denumire;
	String categorie;

	InterfataBrand brandOrigine;
	InterfataGarantie garantie;
	InterfataOrigine taraOrigine;
	InterfataPret pret;

	private Canapea() {

	}

	public String getDenumire() {
		return denumire;
	}

	public String getCategorie() {
		return categorie;
	}

	public InterfataBrand getBrandOrigine() {
		return brandOrigine;
	}

	public InterfataGarantie getGarantie() {
		return garantie;
	}

	public InterfataOrigine getTaraOrigine() {
		return taraOrigine;
	}

	public InterfataPret getPret() {
		return pret;
	}

	public static class CanapeaBuilder {
		private Canapea canapea;

		public CanapeaBuilder(String denumire, String categorie) {
			this.canapea = new Canapea();
			this.canapea.denumire = denumire;
			this.canapea.categorie = categorie;
		}

		public CanapeaBuilder adaugaBrand(InterfataBrand brand) {
			this.canapea.brandOrigine = brand;
			return this;
		}

		public CanapeaBuilder adaugaGarantie(InterfataGarantie garantie) {
			this.canapea.garantie = garantie;
			return this;
		}

		public CanapeaBuilder adaugaTaraOrigine(InterfataOrigine taraOrigine) {
			this.canapea.taraOrigine = taraOrigine;
			return this;
		}

		public CanapeaBuilder adaugaPret(InterfataPret pret) {
			this.canapea.pret = pret;
			return this;
		}

		public Canapea build() {
			return this.canapea;
		}

	}

}
