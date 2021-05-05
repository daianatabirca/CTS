package tabirca.daianamaria.g1087.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {

		ProdusAbstract produs = null;

		produs = FactoryProdus.getProdus(TipProdus.SCAUN, "Interior");

		produs.calculeazaAniGarantie();

		System.out.println(produs.toString());

	}

}
