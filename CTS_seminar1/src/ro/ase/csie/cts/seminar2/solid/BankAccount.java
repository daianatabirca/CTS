package ro.ase.csie.cts.seminar2.solid;

public class BankAccount {

	private String iban;
	//private double balance; //double, float (cu virtgula mobila) nu au precizie f buna -> verifica Main
	private long balance;
	
	private Person accountHolder;
	
	//constructor cu 2 parametri
	
	public BankAccount(String iban, Person person) {
		this.iban=iban;
		this.accountHolder=person;
		balance = 0; //intr-un cont nou deschis o initializam cu 0
	}
	
	//metoda retragere de bani	
	public void withdraw(long amount) throws InsuficientFundsException {
		if(amount > balance)
			throw new InsuficientFundsException("Insuficient funds " + balance);
		System.out.println("Withdrawing " + amount  + " from " +iban);
		balance -= amount; //scoatem din balance amount
	}
	
	
	//metoda depunere bani
	public void deposit(long amount) {
		System.out.println("Adding " + amount  + " from " +iban);
		balance += amount; //adaugam in balance amount
	}
	

	//getteri - setteri
	
	public String getIban() {
		return iban;
	}


	public long getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}


}
