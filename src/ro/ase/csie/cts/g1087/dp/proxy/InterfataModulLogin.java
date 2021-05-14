package ro.ase.csie.cts.g1087.dp.proxy;

public interface InterfataModulLogin { //interfata pentru modul (pt clasa concreta)
	
	public boolean login(String username, String password);

	public boolean verificaStatusServer();
}
