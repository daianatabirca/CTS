package tabirca.daianamaria.g1087.adapter;

public interface InterfataSpecificatiiUtilizatorProiectant {
	
	public String getDenumire();
	public String getPrenume();
	public int getNrPenalizari();
	public int getValoareComanda();
	
	public void obtineReducere(int nrComenzi);
	public void suspendaCont();
	public void recupereazaCont(int asteptare);
	public void trimiteComanda();
	public void trimiteMail(String destinatar);
	public void acceseazaZonaIdei();

}
