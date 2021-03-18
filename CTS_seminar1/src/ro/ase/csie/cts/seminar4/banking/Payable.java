package ro.ase.csie.cts.seminar4.banking;

public interface Payable {
	
	//metoda retragere de bani	
	void withdraw(long amount) throws InsuficientFundsException;

}
