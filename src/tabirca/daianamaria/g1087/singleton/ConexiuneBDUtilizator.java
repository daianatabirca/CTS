package tabirca.daianamaria.g1087.singleton;

public class ConexiuneBDUtilizator {

	String username;
	String parola;

	public static final ConexiuneBDUtilizator conexUtilizator;

	static {
		String username = "tabircadaiana18";
		String parola = "bdTest";
		conexUtilizator = new ConexiuneBDUtilizator(username, parola);
	}

	private ConexiuneBDUtilizator(String username, String parola) {
		super();
		System.out.println("S-a creat un cont de utilizator.");
		this.username = username;
		this.parola = parola;
	}

}
