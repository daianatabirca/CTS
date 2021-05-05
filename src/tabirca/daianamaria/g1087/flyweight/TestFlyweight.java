package tabirca.daianamaria.g1087.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		
		Canvas ecran1 = new Canvas(20,70, "Alb", "Negru");
		
		InterfataProdus3D produsCanapea = FactoryProdus3D.getProdus3D("Canapea");
		produsCanapea.afisareEcran(ecran1);

	}

}
