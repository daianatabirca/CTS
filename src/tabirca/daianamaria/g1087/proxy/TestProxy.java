package tabirca.daianamaria.g1087.proxy;

public class TestProxy {

	public static void main(String[] args) {
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

	}

}
