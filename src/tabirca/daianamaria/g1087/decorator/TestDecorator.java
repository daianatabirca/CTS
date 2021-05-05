package tabirca.daianamaria.g1087.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		Utilizator utilizator = new UtilizatorGeneral("Tabirca", "Daiana", 9);
		utilizator.reducereComanda(25);
		utilizator.suspendareCont();
		utilizator.recuperareCont(30);

		utilizator = new DecoratorSuspendareCont(utilizator);
		utilizator.suspendareCont();

		utilizator = new DecoratorReducereComanda(utilizator);
		utilizator.reducereComanda(25);

		utilizator.setNrPenalizari(13);
		utilizator = new DecoratorSuspendareCont(utilizator);
		utilizator.suspendareCont();
		utilizator = new DecoratorReducereComanda(utilizator);
		utilizator.reducereComanda(25);
		utilizator = new DecoratorRecuperareCont(utilizator);
		utilizator.recuperareCont(31);

	}

}
