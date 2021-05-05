package tabirca.daianamaria.g1087.decorator;

public class DecoratorSuspendareCont extends DecoratorUtilizator {

	public DecoratorSuspendareCont(Utilizator utilizator) {
		super(utilizator);
	}

	@Override
	public void suspendareCont() {
		if (this.utilizator.getNrPenalizari() > 10) {
			System.out.println("Utilizatorul este suspendat. Nu isi mai poate folosi contul.");
		} else
			System.out.println("Utilizatorul are " + utilizator.getNrPenalizari() + " penalizari.");
	}

}
