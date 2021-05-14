package ro.ase.csie.cts.g1087.dp.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		GrupCaractere grup1 = new GrupCaractere("Grup 1");
		grup1.adaugaNod(new CaracterNPC("Soldat 1", 100));
		grup1.adaugaNod(new CaracterNPC("Soldat 2", 200));
		
		GrupCaractere grup2 = new GrupCaractere("Grup1");
		grup2.adaugaNod(new CaracterNPC("Soldar 3", 300));
		grup2.adaugaNod(new CaracterNPC("Tanc", 500));
		
		GrupCaractere grupNivelJoc = new GrupCaractere("Level 2");
		grupNivelJoc.adaugaNod(new CaracterNPC("Level BOSS", 1000));
		grupNivelJoc.adaugaNod(grup1); //putem adauga si grupe in grupa dar si caractere simple 
		grupNivelJoc.adaugaNod(grup2);
		
		//grupNivelJoc.getNod(0).atacaJucator("Superman");
		grupNivelJoc.atacaJucator("Superman");
		grupNivelJoc.seRetrage();
		grupNivelJoc.getNod(0).seDeplaseaza(); //level Boss este primul adaugat in grup 

	}

}
