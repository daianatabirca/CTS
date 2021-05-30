package ro.ase.csie.cts.g1087.dp.decorator;

import ro.ase.csie.cts.g1087.dp.adapter.ACMECaracterJoc;

public abstract class DecoratorCaracter extends ACMECaracterJoc{ //clasa Decorator Abstract

	ACMECaracterJoc caracter = null; //has a (referinta default)

	public DecoratorCaracter(ACMECaracterJoc caracter) { //referinta in constructor 
		super(caracter.getNume(), caracter.getPuncteViata());
		this.caracter = caracter;
	}

	@Override
	public void seDeplaseaza() {
		this.caracter.seDeplaseaza(); //implementare standard pentru functiile mostenite (le apelam pe celel vechi)
	}

	@Override
	public void esteLovit(int puncte) {
		this.caracter.esteLovit(puncte);
	}

	@Override
	public void seVindeca(int puncte) {
		this.caracter.seVindeca(puncte);
	}
	
	
}
