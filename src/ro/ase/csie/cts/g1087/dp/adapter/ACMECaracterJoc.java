package ro.ase.csie.cts.g1087.dp.adapter;

public abstract class ACMECaracterJoc {
	
	protected String nume;
	protected int puncteViata;
	
	public ACMECaracterJoc(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}
	
	public abstract void seDeplaseaza();
	
	public abstract void esteLovit(int puncte);
	
	public abstract void seVindeca(int puncte);

	public String getNume() { //sunt protected pt clasa DecoratorCaracter din pachetul decorator (ca sa fie accesibile, facem getteri)
		return nume;
	}

	public int getPuncteViata() {
		return puncteViata;
	}

	//am adaugat 
	public void setPuncteViata(int puncteViata) {
		this.puncteViata = puncteViata;
	}
	
	
}
