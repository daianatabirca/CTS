package tabirca.daianamaria.g1087.singleton;

public class TestSingletonStatic {

	public static void main(String[] args) {

		ConexiuneBDUtilizator utilizatorGeneral = ConexiuneBDUtilizator.conexUtilizator;
		ConexiuneBDUtilizator utilizatorProiectant = ConexiuneBDUtilizator.conexUtilizator;

		if (utilizatorGeneral == utilizatorProiectant) {
			System.out.println("Exista un singur cont de utilizator.");
			System.out.println("Referintele sunt identice.");
		}

	}

}
