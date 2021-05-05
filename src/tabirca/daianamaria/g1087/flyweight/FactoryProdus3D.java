package tabirca.daianamaria.g1087.flyweight;

import java.util.HashMap;

public class FactoryProdus3D {

	static HashMap<String, InterfataProdus3D> produse = new HashMap<>();

	static {
		String[] listaProduse = new String[] { "Canapea", "Fotoliu", "Scaun", "Birou" };
		for (String produs : listaProduse) {
			Produs3D produs3D = new Produs3D(produs);
			produs3D.incarcareProdus3D(produs + ".fbx");
			produse.put(produs, produs3D);
		}
	}

	public static InterfataProdus3D getProdus3D(String categorie) {
		return produse.get(categorie);
	}

}
