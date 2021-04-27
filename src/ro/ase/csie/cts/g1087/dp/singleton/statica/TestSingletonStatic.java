package ro.ase.csie.cts.g1087.dp.singleton.statica;

public class TestSingletonStatic {

	public static void main(String[] args) {
		
		ConexiuneBD conexiune1 = ConexiuneBD.conexiune;
		ConexiuneBD conexiune2 = ConexiuneBD.conexiune;
		
		if(conexiune1 == conexiune2) {
			System.out.println("Cele 2 referinte sunt identice");
		}

	}

}
