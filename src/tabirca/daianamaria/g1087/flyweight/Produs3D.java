package tabirca.daianamaria.g1087.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Produs3D implements InterfataProdus3D{
	
	String categorie;
	ArrayList<Integer> dimensiuniProdus = new ArrayList<>();

	public Produs3D(String categorie) {
		super();
		this.categorie = categorie;
	}

	@Override
	public void incarcareProdus3D(String fbx) {
		System.out.println(String.format("Incarcare produs 3D din fisierul produs.%s", fbx));
		try {
			Thread.sleep(1000);

			Random random = new Random(10);
			for (int i = 0; i < 3; i++) {
				this.dimensiuniProdus.add(random.nextInt(200));
			}
		} catch (InterruptedException e) {

		}
		System.out.println(String.format("S- a finalizat incarcarea produsului 3D din categoria - %s", categorie));
	}

	@Override
	public void afisareEcran(Canvas ecran) {
		System.out.println(String.format("Afisare produs din categoria %s la pozitiile %d, %d folosind culoarea %s pentru umplere si culoarea %s pentru contur.",
				categorie, ecran.getDimX(),
				ecran.getDimY(), ecran.getCuloareFill(), ecran.getCuloareStroke()));
	}

}
