package ro.ase.csie.cts.seminar3;

public interface Payable {
	
	//metoda retragere de bani	
	void withdraw(long amount) throws InsuficientFundsException;

}
