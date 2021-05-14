package ro.ase.csie.cts.g1087.dp.decorator;

import ro.ase.csie.cts.g1087.dp.adapter.ACMECaracterJoc;
import ro.ase.csie.cts.g1087.dp.adapter.CaracterFantastic;

public class TestDecorator {

	public static void main(String[] args) {
		ACMECaracterJoc dragon = new CaracterFantastic("Dragonul albastru", 400);
		dragon.seDeplaseaza(); //metodele din CaracterFantastic
		dragon.esteLovit(200);
		dragon.seVindeca(100); //aici are 300
		
//		ACMECaracterJoc dragonCuScut = new DecoratorScut(dragon, 200);
//		dragonCuScut.esteLovit(300); //o sa piarda doar 100 pcte pt ca are scut de 200
		
		//-> dragonul are 300 pct viata aici
		dragon = new DecoratorScut(dragon, 200);
		dragon.esteLovit(300); //metoda din decoratorScut => dragonul o sa aiba 200
			
//		dragon = new DecoratorRanit(dragon);
//		dragon.esteLovit(650);
//		dragon.seDeplaseaza();
		
		DecoratorRanit dragonCuScutSiRanit = new DecoratorRanit(dragon);
		dragonCuScutSiRanit.esteLovit(650);
		dragonCuScutSiRanit.seDeplaseaza();
		
	}

}
