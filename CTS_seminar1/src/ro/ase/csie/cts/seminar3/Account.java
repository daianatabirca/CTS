package ro.ase.csie.cts.seminar3;

public interface Account {

	//metoda retragere de bani	
	void withdraw(long amount) throws InsuficientFundsException;

	//metoda depunere bani
	void deposit(long amount);

}