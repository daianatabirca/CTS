package ro.ase.csie.cts.g1087.dp.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataModulLogin {

	InterfataModulLogin modulLogin = null;

	public static final int NR_MAX_INCERCARI = 3; // pt parole -> contor (consecutive), aici e once in a lifetime
	public Map<String, Integer> nrIncercari = new HashMap<>();// nr de incarcari nereusite

	public ProxyLogin(InterfataModulLogin modulLogin) {
		super();
		this.modulLogin = modulLogin;
	}

	@Override
	public boolean login(String username, String pass) {
		Integer nrIncercariNereusite = nrIncercari.get(username); // Integer = referinta
		if (nrIncercariNereusite == null) { // este prima data cand se autentifica
			nrIncercari.put(username, 0);
			nrIncercariNereusite = 0;
		}

		if (modulLogin != null) {
			if (nrIncercariNereusite < NR_MAX_INCERCARI) {
				if (modulLogin.login(username, pass) == true) {// primesti un token de autentificare, de obicei
					nrIncercariNereusite = 0;
					return true; // login ul a reusit
				} else {
					nrIncercariNereusite += 1;
					nrIncercari.put(username, nrIncercariNereusite);
					return false;
				}
			} else
				return false;
		} else
			throw new UnsupportedOperationException();
	}

	@Override
	public boolean verificaStatusServer() {
		if (modulLogin != null)
			return modulLogin.verificaStatusServer();// callback
		else
			throw new UnsupportedOperationException();// nu are referinta sau nu poate sa faca acest lucru
	}

}
