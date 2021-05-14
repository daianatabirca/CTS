package ro.ase.csie.cts.g1087.dp.composite;

public class CaracterNPC extends NodAbstractStructura implements InterfataCaractereNPC{ //NodFrunza (doar 1 angajat)

	String nume;
	int putere;
	

	public CaracterNPC(String nume, int putere) {
		super();
		this.nume = nume;
		this.putere = putere;
	}

	//metode specifice pentru jucator 
	@Override
	public void atacaJucator(String numeJucator) {
		System.out.println(String.format("%s ataca pe %s", nume, numeJucator));
		
	}

	@Override
	public void seRetrage() {
		System.out.println(String.format("%s se retrage", nume));
		
	}

	@Override
	public void seDeplaseaza() {
		System.out.println(String.format("%s se deplaseaza pe ecran", nume));
		
	}
	//metode specifice grupurilor 
	@Override
	public void adaugaNod(NodAbstractStructura nod) {
		throw new UnsupportedOperationException(); //se arunca exceptii pentru ca nu e grup! Non-sens!
	}

	@Override
	public void stergeNod(NodAbstractStructura nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NodAbstractStructura getNod(int index) {
		throw new UnsupportedOperationException();
	}

}
