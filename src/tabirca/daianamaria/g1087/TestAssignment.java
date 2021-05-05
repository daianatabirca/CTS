package tabirca.daianamaria.g1087;

import tabirca.daianamaria.g1087.adapter.UtilizatorGeneral;
import tabirca.daianamaria.g1087.adapter.UtilizatorProiectant;
import tabirca.daianamaria.g1087.builder.Canapea;
import tabirca.daianamaria.g1087.builder.module.BrandInternational;
import tabirca.daianamaria.g1087.builder.module.GarantieExtinsa;
import tabirca.daianamaria.g1087.builder.module.OrigineItalia;
import tabirca.daianamaria.g1087.builder.module.PretScump;
import tabirca.daianamaria.g1087.decorator.DecoratorRecuperareCont;
import tabirca.daianamaria.g1087.decorator.DecoratorReducereComanda;
import tabirca.daianamaria.g1087.decorator.DecoratorSuspendareCont;
import tabirca.daianamaria.g1087.decorator.Utilizator;
import tabirca.daianamaria.g1087.decorator.UtilizatorGeneralD;
import tabirca.daianamaria.g1087.flyweight.Canvas;
import tabirca.daianamaria.g1087.flyweight.FactoryProdus3D;
import tabirca.daianamaria.g1087.flyweight.InterfataProdus3D;
import tabirca.daianamaria.g1087.prototype.Model3DProdus;
import tabirca.daianamaria.g1087.proxy.InterfataModulAutentificare;
import tabirca.daianamaria.g1087.proxy.ModulAutentificare;
import tabirca.daianamaria.g1087.proxy.ProxyAutentificare;
import tabirca.daianamaria.g1087.simplefactory.FactoryProdus;
import tabirca.daianamaria.g1087.simplefactory.ProdusAbstract;
import tabirca.daianamaria.g1087.simplefactory.TipProdus;
import tabirca.daianamaria.g1087.singleton.ConexiuneBDUtilizator;

public class TestAssignment {

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("1) Test ADAPTER");
		UtilizatorGeneral utGen = new UtilizatorGeneral("Tabirca", "Daiana", 14, 2500);
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

		System.out.println("2) Test BUILDER");
		Canapea canapeaCatifea = new Canapea.CanapeaBuilder("Canapea Sophia", "Interior")
				.adaugaBrand(new BrandInternational("LUXDECO", true)).adaugaGarantie(new GarantieExtinsa(20))
				.adaugaTaraOrigine(new OrigineItalia(120)).adaugaPret(new PretScump(50.5)).build();

		System.out.println(canapeaCatifea.getBrandOrigine().toString());

		System.out.println(canapeaCatifea.getTaraOrigine().toString());

		System.out.println("3) Test DECORATOR");
		Utilizator utilizator = new UtilizatorGeneralD("Tabirca", "Daiana", 9);
		utilizator.reducereComanda(25);
		utilizator.suspendareCont();
		utilizator.recuperareCont(30);

		utilizator = new DecoratorSuspendareCont(utilizator);
		utilizator.suspendareCont();

		utilizator = new DecoratorReducereComanda(utilizator);
		utilizator.reducereComanda(25);

		utilizator.setNrPenalizari(13);
		utilizator = new DecoratorSuspendareCont(utilizator);
		utilizator.suspendareCont();
		utilizator = new DecoratorReducereComanda(utilizator);
		utilizator.reducereComanda(25);
		utilizator = new DecoratorRecuperareCont(utilizator);
		utilizator.recuperareCont(31);

		System.out.println("4) Test FLYWEIGHT");
		Canvas ecran1 = new Canvas(20, 70, "Alb", "Negru");

		InterfataProdus3D produsCanapea = FactoryProdus3D.getProdus3D("Canapea");
		produsCanapea.afisareEcran(ecran1);

		System.out.println("5) Test PROTOTYPE");
		Model3DProdus canapea = new Model3DProdus("Lemn");

		Model3DProdus canapeaExtensibila = (Model3DProdus) canapea.clone();

		System.out.println(canapea.toString());
		System.out.println(canapeaExtensibila.toString());

		System.out.println("6) Test PROXY");
		InterfataModulAutentificare autentificare = new ModulAutentificare("source.medium", 1798);

		autentificare = new ProxyAutentificare(autentificare);

		if (autentificare.login("suportItMagazin", "suport1999"))
			System.out.println("Autentificare cu succes!");

		String[] parole = new String[] { "magazin", "suport", "suppMag", "suport1999", "mag1999" };

		for (String parola : parole) {
			if (autentificare.login("suportItMagazin", parola))
				System.out.println("Parola a fost identificata: " + parola);
		}

		System.out.println("Log out");

		System.out.println("7) Test SIMPLE-FACTORY");
		ProdusAbstract produs = null;

		produs = FactoryProdus.getProdus(TipProdus.SCAUN, "Interior");

		produs.calculeazaAniGarantie();

		System.out.println(produs.toString());

		System.out.println("8) Test SINGLETON-STATIC");
		ConexiuneBDUtilizator utilizatorGeneral = ConexiuneBDUtilizator.conexUtilizator;
		ConexiuneBDUtilizator utilizatorProiectant = ConexiuneBDUtilizator.conexUtilizator;

		if (utilizatorGeneral == utilizatorProiectant) {
			System.out.println("Exista un singur cont de utilizator.");
			System.out.println("Referintele sunt identice.");
		}

	}

}
