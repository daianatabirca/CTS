package tabirca.daianamaria.g1087.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyAutentificare implements InterfataModulAutentificare {

	InterfataModulAutentificare modulAutentificare = null;

	public static final int NR_MAX_INCERCARI_AUTENTIFICARE = 3;
	public Map<String, Integer> nrIncercari = new HashMap<>();

	public ProxyAutentificare(InterfataModulAutentificare modulAutentificare) {
		super();
		this.modulAutentificare = modulAutentificare;
	}

	@Override
	public boolean login(String username, String parola) {
		Integer nrIncercariEsuate = nrIncercari.get(username);
		if (nrIncercariEsuate == null) {
			nrIncercari.put(username, 0);
			nrIncercariEsuate = 0;
		}
		if (modulAutentificare != null) {
			if (nrIncercariEsuate < NR_MAX_INCERCARI_AUTENTIFICARE) {
				if (modulAutentificare.login(username, parola) == true) {
					nrIncercariEsuate = 0;
					return true;
				} else {
					nrIncercariEsuate += 1;
					nrIncercari.put(username, nrIncercariEsuate);
					return false;
				}
			} else
				return false;
		} else
			throw new UnsupportedOperationException();
	}

	@Override
	public boolean verificaConexiune(int serialId) {
		if (modulAutentificare != null)
			return modulAutentificare.verificaConexiune(serialId);
		else
			throw new UnsupportedOperationException();
	}

}
