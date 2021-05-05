package tabirca.daianamaria.g1087.adapter;

public class UtilizatorGeneral extends Utilizator {

	public UtilizatorGeneral(String nume, String prenume, int nrPen, int valCom) {
		super(nume, prenume, nrPen, valCom);
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

	@Override
	public void trimiteComanda() {
		System.out.println(String.format("Utilizatorul %s %s trimite comanda in valoare de %d ", nume, prenume, valoareComanda));
		
	}

}
