package ro.ase.csie.cts.seminar3;

public interface Transferable {
	
	public void transfer(Receivable destination, long amount)  throws InsuficientFundsException;

}
