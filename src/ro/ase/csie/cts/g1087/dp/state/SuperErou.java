package ro.ase.csie.cts.g1087.dp.state;

public class SuperErou {
	
	public static final int NIVEL_CRITIC = 10; //nu se mai deplaseaza aici

	String nume;
	int puncteViata;
	
	InterfataMiscare modMiscare = null;
	
	
	public SuperErou(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.modMiscare = new MiscareNormala(); //avem referinta nula mai sus de gestionat si cream obiectul aici
	}


	void seDeplaseaza() {
		this.modMiscare.seDeplaseaza(); //callback catre metoda
	}
	
	void esteAtacat(int puncte) {
		this.puncteViata -=puncte;
		if(this.puncteViata < NIVEL_CRITIC)
			this.modMiscare = new MiscareModRanit();
	}
	
	void seVindeca(int puncte) {
		this.puncteViata +=puncte;
		if(this.puncteViata >= NIVEL_CRITIC)
			this.modMiscare = new MiscareNormala();
	}
}
