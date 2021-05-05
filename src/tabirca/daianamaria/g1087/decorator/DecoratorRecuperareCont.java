package tabirca.daianamaria.g1087.decorator;

public class DecoratorRecuperareCont extends DecoratorUtilizator {

	public DecoratorRecuperareCont(Utilizator utilizator) {
		super(utilizator);
	}

	@Override
	public void recuperareCont(int timpAsteptare) {
		if ((utilizator.getNrPenalizari() < 10) && (timpAsteptare > 30)) {
			System.out.println("Contul este activ");
		} else if ((utilizator.getNrPenalizari() > 10) && (timpAsteptare > 30)) {
			System.out.println("Contul poate fi recuperat.");
			System.out.println("Accesati linkul urmator: https://www.appDemo.com/accountRecovery");
		} else {
			System.out.println("Contul nu poate fi recuperat deocamdata.");
			System.out.println("Va rugam incercati peste " + (30 - timpAsteptare) + " zile");
		}
	}

}
