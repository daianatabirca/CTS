package ro.ase.csie.cts.g1087.dp.builder;

public class SuperErou {
	
	private String nume;
	private int puncteViata;
	
	private boolean esteNegativ;
	private boolean esteRanitGrav;
	
	private InterfataArma armaStanga;
	private InterfataArma armaDreapta;
	private InterfataSuperPutere superPutere;
	private InterfataSuperPutere superSuperPutere;
	
	
	private SuperErou() { //constructor default privat
	}

	private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav,
			InterfataArma armaStanga, InterfataArma armaDreapta, InterfataSuperPutere superPutere,
			InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	public static class SuperErouBuilder { //inner class - este STATICA, o clasa in interiorul altei clase, denumita OUTER CLASS
		
		SuperErou supererou; //instanta a unui SuperErou ; default sau private
		
		//constructor al clasei statice
		public SuperErouBuilder(String nume, int puncteViata) {
			this.supererou = new SuperErou(); //creeaza obiect SuperErou
			this.supererou.nume = nume;
			this.supererou.puncteViata = puncteViata;
		}
		
		//metode => ca niste setteri pentru atributele din SuperErou - outer class
		
		public SuperErouBuilder esteNegativ() {
			this.supererou.esteNegativ = true; //cand apelam functia => SuperEroul este negativ! fara sa-i mai dam valori
			return this;
		}
		
		public SuperErouBuilder esteRanit() {
			this.supererou.esteRanitGrav = true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.supererou.armaStanga = arma;
			return this;
		}
		
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.supererou.armaDreapta = arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
			this.supererou.superPutere = superPutere;
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
			this.supererou.superSuperPutere = superSuperPutere;
			return this;
		}
		
		public SuperErou build() { //metoda BUILD care returneaza instanta de supererou => CREEAZA OBIECTUL, de fapt
			return this.supererou;
		}
	}
	
}
