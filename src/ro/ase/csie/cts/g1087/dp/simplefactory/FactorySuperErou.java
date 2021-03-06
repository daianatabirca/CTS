package ro.ase.csie.cts.g1087.dp.simplefactory;

public class FactorySuperErou {
	
	//metoda statica de obtinere a unui obiect prin argumente definitorii (tipul de caracter - din ENUM, numele)
	
	public static SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		
		SuperErouAbstract superErou = null; //cream o instanta NULA de SuperErouAbstract (interfata sau clasa abstracta initiala - superioara)
		
		switch(tip) { //obtinem dupa tip
		case DISNEY:
			superErou = new CaracterDisney(nume, 100, false);
			break; //sa nu se continue
		case MARVEL:
			superErou = new CaracterMarvel(nume, 500, 0);
			break;
		case DC:
			superErou = new CaracterDCComics(nume, 500, 100);
			break;
		default:
			throw new UnsupportedOperationException(); //pt cazul default, arunca exceptia, daca este instanta NULA
		}
		return superErou; //obtine instanta
	}

}
