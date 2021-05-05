package tabirca.daianamaria.g1087.adapter;

public class AdaptorProiectantLaGeneral extends Utilizator {

	InterfataSpecificatiiUtilizatorProiectant utilProiect = null;

	public AdaptorProiectantLaGeneral(InterfataSpecificatiiUtilizatorProiectant utilProiect) {
		super(utilProiect.getDenumire(), utilProiect.getPrenume(), utilProiect.getNrPenalizari(),
				utilProiect.getValoareComanda());
		this.utilProiect = utilProiect;
	}

	@Override
	public void reducereComanda(int nrComenzi) {
		utilProiect.obtineReducere(nrComenzi);

	}

	@Override
	public void suspendareCont() {
		utilProiect.suspendaCont();

	}

	@Override
	public void recuperareCont(int timpAsteptare) {
		utilProiect.recupereazaCont(timpAsteptare);

	}

	@Override
	public void trimiteComanda() {
		utilProiect.trimiteComanda();

	}

}
