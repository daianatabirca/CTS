package ro.ase.csie.cts.g1087.dp.chain;

public class ModulFiltru extends NodChainAbstract { //Handler A

	public ModulFiltru(String numeModul) { //se transmite denumirea modulului prin constructor 
		super(numeModul); //se apeleaza constructorul din NodChainAbstract

	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		String[] dictionar = new String[] { "rau", "obraznic", "violent" }; //cuvinte pentru filtru 
		boolean esteValid = true;

		for (String cuvant : dictionar) {
			if (mesaj.getContinut().contains(cuvant)) { //daca in continutul din mesaj text exista vreo secventa din dictionarul de mai sus 
				esteValid = false; //mesajul nu mai este valid 
			break; //iese 
			}
		}
		if(esteValid && this.next != null) { //daca mesajul este valid si are succesor
			this.next.procesareMesajChat(mesaj); //il trimite mai departe 
		}
	}

	
}
