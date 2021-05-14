package ro.ase.csie.cts.g1087.dp.state;

public class SuperErou {
	
	public static final int NIVEL_CRITIC = 10; //nu se mai deplaseaza aici - contor constant (final)

	String nume;
	int puncteViata;
	
	InterfataMiscare modMiscare = null; //referinta la interfata
	
	
	public SuperErou(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.modMiscare = new MiscareNormala(); //SETAM STAREA INITIALA !!! (atentie state)
	}


	void seDeplaseaza() {
		this.modMiscare.seDeplaseaza(); //callback catre metoda din starea setata
	}
	
	void esteAtacat(int puncte) {
		this.puncteViata -=puncte;
		if(this.puncteViata < NIVEL_CRITIC)
			this.modMiscare = new MiscareModRanit(); //setam starea pe Miscare Mod Ranit
	}
	
	void seVindeca(int puncte) {
		this.puncteViata +=puncte;
		if(this.puncteViata >= NIVEL_CRITIC)
			this.modMiscare = new MiscareNormala(); //setam starea pe Miscare Mod Normal 
	}
}
