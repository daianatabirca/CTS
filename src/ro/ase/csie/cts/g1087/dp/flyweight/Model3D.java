package ro.ase.csie.cts.g1087.dp.flyweight;

import java.util.ArrayList;

public class Model3D implements InterfataModel3D { // FlyweightConcret

	//stari permanente
	String descriere;
	ArrayList<Integer> puncteModel = new ArrayList<>();

	public Model3D(String descriere) {
		super();
		this.descriere = descriere;
	}

	//stari temporare
	@Override
	public void incarcaModel3D(String fisier) {
		System.out.println(String.format("Incarcare model pentru %s din fisierul %s", descriere, fisier));
		for (int i = 0; i < 10; i++)
			puncteModel.add(i);

	}
	//stare temporara
	@Override
	public void afisareEcran(ContextEcran context) {
		System.out.println(String.format("Afisare %s la %d, %d cu textura %s", descriere, context.getX(),
				context.getY(), context.getCuloareTextura()));

	}

}
