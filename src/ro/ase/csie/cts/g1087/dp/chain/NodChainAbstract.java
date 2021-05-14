package ro.ase.csie.cts.g1087.dp.chain;

public abstract class NodChainAbstract { //Handler

	NodChainAbstract next = null; //nodul catre succesor (referinta)

	String numeModul;

	public void setNext(NodChainAbstract next) { //metoda clasica de stabilire a nodului next 
		this.next = next;
	}

	public NodChainAbstract(String numeModul) {
		super();
		this.numeModul = numeModul;
	}

	public abstract void procesareMesajChat(MesajChat mesaj); // legatura cu mesajul(evenimentul) -> metoda de gestionare mesaj (gestioneaza cerere)

}
