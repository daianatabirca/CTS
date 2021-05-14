package ro.ase.csie.cts.g1087.dp.chain;

public class ModulChatPrivat extends NodChainAbstract { //HandlerB
	
	public static final String NUME_MODUL = "Modul Chat Privat";

	public ModulChatPrivat() { //se transmite denumirea modulului prin constanta - final 
		super(NUME_MODUL);
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		if(mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")) { //daca mesajul nu are un destinatar precizat (sau este explicit pt toata lumea)
			if(this.next != null) //si daca are cui sa trimita mesajul in continuare
				this.next.procesareMesajChat(mesaj); //apeleaza functia de procesare pentru nodul urmator 
		}
		else //else => mesajul este privat 
		{
			System.out.println(String.format("Mesaj privat pentru %s = %s",
					mesaj.getDestinatie(), mesaj.getContinut()));
		}
	}

}
