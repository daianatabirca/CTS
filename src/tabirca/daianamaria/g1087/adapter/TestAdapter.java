package tabirca.daianamaria.g1087.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		UtilizatorGeneral utGen = new UtilizatorGeneral("Tabirca","Daiana", 14, 2500);
		utGen.reducereComanda(20);
		utGen.suspendareCont();
		utGen.trimiteComanda();
		utGen.recuperareCont(20);
		
		UtilizatorProiectant utProi = new UtilizatorProiectant();
		utProi.getDenumire();
		utProi.setNrPenalizari(13);
		utProi.setValoareComanda(130000);
		utProi.obtineReducere(13);
		utProi.suspendaCont();
		utProi.trimiteComanda();
		utProi.recupereazaCont(10);
		utProi.trimiteMail("Client 1");
		utProi.acceseazaZonaIdei();
	}

}
