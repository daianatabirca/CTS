package ro.ase.csie.cts.g1087.dp.composite;

import java.util.ArrayList;

public class GrupCaractere extends NodAbstractStructura { //Composite (+departament, grup)
	
	ArrayList<NodAbstractStructura> noduri = new ArrayList<>(); //lista!
	String denumire;
	

	public GrupCaractere(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void adaugaNod(NodAbstractStructura nod) {
		this.noduri.add(nod);
		
	}

	@Override
	public void stergeNod(NodAbstractStructura nod) {
		this.noduri.remove(nod);
		
	}

	@Override
	public NodAbstractStructura getNod(int index) {
		return this.noduri.get(index);
	}

	@Override
	public void atacaJucator(String numeJucator) {
		for(NodAbstractStructura nod : noduri) //parcurgere simpla 
			nod.atacaJucator(numeJucator);
		
	}

	@Override
	public void seRetrage() {
		for(NodAbstractStructura nod: noduri) //parcurgere simpla 
			nod.seRetrage();
		
	}

	@Override
	public void seDeplaseaza() {
		throw new UnsupportedOperationException(); //nu dorim sa definim (non-sens pentru grup)
		
	}

}
