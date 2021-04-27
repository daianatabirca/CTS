package ro.ase.csie.cts.g1087.dp.singleton.statica;

public class ConexiuneBD {
	
	String ip;
	String denumire;
	
	public static final ConexiuneBD conexiune; //versiune cu Public Static Final (atribut)
	
	static { 
		String ip = "127.0.0.1";
		String denumire = "bdTest";
		conexiune = new ConexiuneBD(ip,denumire);
	}

	private ConexiuneBD(String ip, String denumire) {
		System.out.println("Apel constructor");
		this.ip = ip;
		this.denumire = denumire;
	}

	
}
