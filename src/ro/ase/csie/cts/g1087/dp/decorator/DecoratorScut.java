package ro.ase.csie.cts.g1087.dp.decorator;

import ro.ase.csie.cts.g1087.dp.adapter.ACMECaracterJoc;

public class DecoratorScut extends DecoratorCaracter{

	int nivelScut; //cand caracterul este lovit, scutul preia o parte din lovitura
	
	public DecoratorScut(ACMECaracterJoc caracter, int nivel) {
		super(caracter);
		this.nivelScut = nivel;
	}

	@Override
	public void esteLovit(int puncte) {
		int puncteLovitura = puncte - this.nivelScut; //scutul preia
		if(puncteLovitura > 0)
			super.caracter.esteLovit(puncteLovitura);
	}

	
}
