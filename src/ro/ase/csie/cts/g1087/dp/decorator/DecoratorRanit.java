package ro.ase.csie.cts.g1087.dp.decorator;

import ro.ase.csie.cts.g1087.dp.adapter.ACMECaracterJoc;

public class DecoratorRanit extends DecoratorCaracter{

	public DecoratorRanit(ACMECaracterJoc caracter) {
		super(caracter);
	}

	@Override
	public void seDeplaseaza() { //decorator pentru metoda seDeplaseaza()
		//am scris super in loc de this
		System.out.println(this.caracter.getPuncteViata()); //aici are dragonul 300?????
		if (this.caracter.getPuncteViata() < 100) {
			System.out.println("Nu se mai poate deplasa. Este ranit critic");
		}
		else
			this.caracter.seDeplaseaza();
	}

	
}
