package tabirca.daianamaria.g1087.decorator;

public abstract class DecoratorUtilizator extends Utilizator {

	Utilizator utilizator = null;

	public DecoratorUtilizator(Utilizator utilizator) {
		super(utilizator.getNume(), utilizator.getPrenume(), utilizator.getNrPenalizari());
		this.utilizator = utilizator;
	}

	@Override
	public void reducereComanda(int nrComenzi) {
		this.utilizator.reducereComanda(nrComenzi);

	}

	@Override
	public void suspendareCont() {
		this.utilizator.suspendareCont();

	}

	@Override
	public void recuperareCont(int timpAsteptare) {
		this.utilizator.recuperareCont(timpAsteptare);

	}

}
