package tabirca.daianamaria.g1087.decorator;

public class UtilizatorGeneralD extends Utilizator {

	public UtilizatorGeneralD(String nume, String prenume, int nrPen) {
		super(nume, prenume, nrPen);
	}

	@Override
	public void reducereComanda(int nrComenzi) {
		System.out.println(String.format("Utilizatorul %s %s a efectuat %d comenzi.", nume, prenume, nrComenzi));

	}

	@Override
	public void suspendareCont() {
		System.out.println(String.format("Utilizatorul %s %s verifica disponibilitatea contului.", nume, prenume));

	}

	@Override
	public void recuperareCont(int timpAsteptare) {
		System.out
				.println(String.format("Utilizatorul %s %s are contul suspendat pentru %d zile.", nume, prenume, 30 - timpAsteptare));

	}

}
