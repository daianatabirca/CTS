package tabirca.daianamaria.g1087.proxy;

public class ModulAutentificare implements InterfataModulAutentificare {
	
	String track;
	int idConexiune;
	
	public ModulAutentificare(String track, int idConexiune) {
		super();
		this.track = track;
		this.idConexiune = idConexiune;
	}

	@Override
	public boolean login(String username, String parola) {
		if(username.equals("suportItMagazin") && parola.equals("suport1999"))
			return true;
		else
			return false;
	}

	@Override
	public boolean verificaConexiune(int serialId) {
		if (this.idConexiune == serialId) return true;
		else {
			return false;
		}
	}

}
