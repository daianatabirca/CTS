package tabirca.daianamaria.g1087.adapter;

import java.util.Random;

public class UtilizatorProiectant implements InterfataSpecificatiiUtilizatorProiectant {

	public static final String nume = "CHARLES MELLERSH";
	public String prenume;
	public int nrPenalizari;
	public int valoareComanda;

	public static String getNume() {
		return nume;
	}

	@Override
	public String getDenumire() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public int getNrPenalizari() {
		return nrPenalizari;
	}

	public void setNrPenalizari(int nrPenalizari) {
		this.nrPenalizari = nrPenalizari;
	}

	public int getValoareComanda() {
		return valoareComanda;
	}
	
	public void setValoareComanda(int valComanda) {
		this.valoareComanda = valComanda;
	}

	@Override
	public void trimiteMail(String destinatar) {
		System.out.println("Utilizatorul trimite mail catre " + destinatar);

	}

	@Override
	public void acceseazaZonaIdei() {
		System.out.println("Incarcare fereastra idei...");
		try {
			Thread.sleep(1000);

			Random random = new Random(10);
			for (int i = 0; i < 10; i++) {
				System.out.println("Pagina " + i + " contine " + random.nextInt(100) + " proiecte de vizualizat.");
			}
		} catch (InterruptedException e) {

		}
		System.out.println("Fereastra incarcata.");

	}

	@Override
	public void obtineReducere(int nrComenzi) {
		System.out.println(
				String.format("Utilizatorul proiectant - %s a efectuat %d comenzi.", nume, nrComenzi));
	}

	@Override
	public void suspendaCont() {
		System.out
				.println(String.format("Utilizatorul proiectant - %s doreste suspendarea contului.", nume));

	}

	@Override
	public void recupereazaCont(int asteptare) {
		System.out.println(String.format(
				"Utilizatorul proiectant - %s doreste recuperarea contului, dar mai are de asteptat %d zile.", nume,
				30 - asteptare));

	}

	@Override
	public void trimiteComanda() {
		System.out.println(String.format("Utilizatorul proiectant - %s solicita o comanda in valoare de %d ", nume, valoareComanda));

	}

}
