package ro.ase.csie.cts.g1087.curs.unitTesting1;

public class OperatiiMatematice {

	public static float calculeazaMedie(int[] valori) {

		if (valori.length == 0)
			return 0;

		float suma = 0;
		for (int valoare : valori) {
			suma += valoare;
		}
		return suma / valori.length; // media
	}
}
