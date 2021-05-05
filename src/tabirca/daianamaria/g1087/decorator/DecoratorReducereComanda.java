package tabirca.daianamaria.g1087.decorator;

public class DecoratorReducereComanda extends DecoratorUtilizator {

	public DecoratorReducereComanda(Utilizator utilizator) {
		super(utilizator);
	}

	@Override
	public void reducereComanda(int nrComenzi) {
		if ((nrComenzi > 20) && (utilizator.nrPenalizari < 10)) {
			System.out.println("Utilizatorul a obtinut o reducere de 10%.");
		} else if ((nrComenzi > 20) && (utilizator.nrPenalizari > 10)) {

			System.out.println("Verificati disponibilitatea contului!");
		} else {
			System.out.println("Ne pare rau! Nu dispuneti inca de reducere.");
		}
	}

}
