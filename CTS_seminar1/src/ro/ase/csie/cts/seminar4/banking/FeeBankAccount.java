package ro.ase.csie.cts.seminar4.banking;

public class FeeBankAccount extends DebitBankAccount {

	private long fee = 2; //comision
	
	public FeeBankAccount(NotificationService ns, String iban, Person person) {
		super(ns, iban, person);
	}
	
	//modificare metoda de retragere + comision adaugat
	
	//adaugam noi semnatura Override
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		System.out.println("Adding " + fee + " fee to withdrawal");
			super.withdraw(amount+fee);
	}
	

}
