package tabirca.daianamaria.g1087.simplefactory;

public class FactoryProdus {

	public static ProdusAbstract getProdus(TipProdus tip, String categorie) {
		ProdusAbstract produs = null;

		switch (tip) {
		case SCAUN:
			produs = new Scaun(categorie, 150, true, 0, 58, 53, 83);
			break;
		case BIROU:
			produs = new Birou(categorie, 350, false, 0, "Lemn");
			break;
		case CANAPEA:
			produs = new Canapea(categorie, 6000, true, 0, true);
			break;
		case FOTOLIU:
			produs = new Fotoliu(categorie, 800, true, 0, "Alb");
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return produs;
	}
}
