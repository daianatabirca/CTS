package ro.ase.csie.cts.g1087.dp.flyweight;

public interface InterfataModel3D { //Interfata pentru Flyweight (stocheaza starile temporare)

	public void incarcaModel3D(String fisier); 

	public void afisareEcran(ContextEcran ecran); //metoda primeste starea temporara  (ContextEcran ecran) -> starea extrinseca (la diferite puncte)
	//diferentele sunt pozitiile pe ecran (din ContextEcran)
	//metoda este echivalenta cu 
	//public void afisareEcran(int x, int y, String culoareTextura);

}
