package ro.ase.csie.cts.seminar4.banking;

public interface Transferable {
	
	public void transfer(Receivable destination, long amount)  throws InsuficientFundsException;

}
