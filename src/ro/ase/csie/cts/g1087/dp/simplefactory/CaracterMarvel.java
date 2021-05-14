package ro.ase.csie.cts.g1087.dp.simplefactory;

public class CaracterMarvel extends SuperErouAbstract {

	int putere; // +atribut nou

	public CaracterMarvel(String nume, int puncteViata, int putere) { // constr mostenit + noul atribut
		super(nume, puncteViata);
		this.putere = putere;
	}

	@Override
	public void seDeplaseaza() { // metoda suprascrisa

	}

}
