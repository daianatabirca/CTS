package ro.ase.csie.cts.g1087.dp.chain;

public class ModulChatGlobal extends NodChainAbstract { //HandlerC

	public ModulChatGlobal() { //constructor fara parametri
		super("Modul chat global"); //se apeleaza direct constructorul din NodChainAbstract
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		if (mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")) { //verificam daca este mesaj global
			System.out.println("Mesaj catre toti jucatorii: " + mesaj.getContinut()); //transmitem continutul
		}
		
		if(this.next != null) { //daca are succesor
			this.next.procesareMesajChat(mesaj); //apelam functia pentru urmatorul nod 
		}

	}

}
