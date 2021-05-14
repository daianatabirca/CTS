package ro.ase.csie.cts.g1087.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		
		NodChainAbstract chatGlobal = new ModulChatGlobal();
		NodChainAbstract chatPrivat = new ModulChatPrivat();
		NodChainAbstract filtruChat = new ModulFiltru("Reguli limba Romana");
		
		//setam ordinea 
		//de la cel mai important -> cel mai putin important
		//filtru -> privat -> global
		filtruChat.setNext(chatPrivat);
		chatPrivat.setNext(chatGlobal);
		
		NodChainAbstract serverChat = filtruChat; //cream un server si atribuim ordinea 
		
		serverChat.procesareMesajChat(new MesajChat("@Everyone", "Esti rau", 1)); //nu se transmite mai departe -> nu se afiseaza => contine cuv "rau"
		serverChat.procesareMesajChat(new MesajChat("@Everyone", "Esti ok. Multumesc", 1)); //se propaga pentru toti, trece de filtru 
		serverChat.procesareMesajChat(new MesajChat("@Gigel", "Hai sa incercam nivelul 5.", 1)); //mesaj doar pentru Gigel (privat)
		

	}

}
