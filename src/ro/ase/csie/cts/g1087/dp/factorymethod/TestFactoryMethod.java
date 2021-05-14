package ro.ase.csie.cts.g1087.dp.factorymethod;

import ro.ase.csie.cts.g1087.dp.simplefactory.SuperErouAbstract;
import ro.ase.csie.cts.g1087.dp.simplefactory.TipErou;

public class TestFactoryMethod {

	public static void main(String[] args) {

		boolean esteTemaFantasy = true; //un atribut boolean initialita true (pt testare) -> fantasy
		
		FactoryAbstract factoryCaractere = null; //instanta nula de Factory Abstract
		
		if(esteTemaFantasy) { //daca tema este fantasy
			factoryCaractere = new FactoryTemaFantasy(); //Cream un Factory de tipul Fantasy
		}
		else
		{
			factoryCaractere = new FactoryTemaUniversala();
		}
		//Instantiem obiectul de tipul Abstract 
		SuperErouAbstract superCaracter = 
				factoryCaractere.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
		superCaracter = factoryCaractere.getSuperErou(TipErou.MARVEL, "Spiderman");
		superCaracter = factoryCaractere.getSuperErou(TipErou.DC, "Batman");

	}

}
