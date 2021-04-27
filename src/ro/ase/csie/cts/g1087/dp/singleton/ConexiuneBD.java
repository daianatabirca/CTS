package ro.ase.csie.cts.g1087.dp.singleton;

public class ConexiuneBD { //<=> clasa SINGLETON
	
	String ip;
	String denumire;
	
	private static ConexiuneBD conexiune = null; //atribut static, privat, de tipul clasei care reprezinta instanta unica (PAS 1)
	

	private ConexiuneBD() { 
	}

	private ConexiuneBD(String ip, String denumire) { //(PAS 2) - constructorul privat apelabil doar din clasa
		System.out.println("Apel constructor");
		this.ip = ip;
		this.denumire = denumire;
	}
	
	//PAS 3 - metoda publica getInstance
	//lazy instantiation - obiectul este creat doar la nevoie
	
	public static synchronized ConexiuneBD getConexiune() {
		if(conexiune == null) {
			conexiune = new ConexiuneBD("10.0.0.1", "CTS");
		}
		return conexiune;
	}

}
