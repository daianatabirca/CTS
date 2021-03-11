package ro.ase.csie.cts.seminar3;

public class DebitBankAccount extends BankAccount implements Payable, Receivable, Transferable {

//	private String iban;
//	//private double balance; //double, float (cu virtgula mobila) nu au precizie f buna -> verifica Main
//	private long balance;
//	
//	private Person accountHolder;
	
	//constructor cu 2 parametri
	
	public DebitBankAccount(String iban, Person person) {
		this.iban=iban;
		this.accountHolder=person;
		balance = 0; //intr-un cont nou deschis o initializam cu 0
	}
	
	//metoda retragere de bani	
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		if(amount > balance)
			throw new InsuficientFundsException("Insuficient funds " + balance);
		System.out.println("Withdrawing " + amount  + " from " +iban);
		balance -= amount; //scoatem din balance amount
	}
	
	
	//metoda depunere bani
	@Override
	public void deposit(long amount) {
		System.out.println("Adding " + amount  + " to " +iban);
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

	@Override
	public void transfer(Receivable destination, long amount) throws InsuficientFundsException {
		this.withdraw(amount);
		destination.deposit(amount);
	}


}
