package ro.ase.csie.cts.g1087.dp.simplefactory;

public class CaracterDisney extends SuperErouAbstract {

	boolean cuAcordParental; // +un atribut nou

	public CaracterDisney(String nume, int puncteViata, boolean acordParental) { // constructorul mostenit + atributul
		super(nume, puncteViata);
		this.cuAcordParental = acordParental;
	}

	@Override
	public void seDeplaseaza() { // metoda suprascrisa

	}

}
