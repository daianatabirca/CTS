package ro.ase.csie.cts.g1087.dp.chain;

public class MesajChat { //clasa obiect 
	
	String destinatie;
	String continut;
	int proritate;
	
	public MesajChat(String destinatie, String continut, int proritate) {
		super();
		this.destinatie = destinatie;
		this.continut = continut;
		this.proritate = proritate;
	}

	public String getDestinatie() {
		return destinatie;
	}

	public String getContinut() {
		return continut;
	}

	public int getProritate() {
		return proritate;
	}
	
	
}
