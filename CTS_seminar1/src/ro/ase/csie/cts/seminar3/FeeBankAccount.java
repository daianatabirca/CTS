package ro.ase.csie.cts.seminar3;

public class FeeBankAccount extends BankAccount {

	private long fee = 2; //comision
	
	public FeeBankAccount(String iban, Person person) {
		super(iban, person);
	}
	
	//modificare metoda de retragere + comision adaugat
	
	//adaugam noi semnatura Override
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		System.out.println("Adding " + fee + " fee to withdrawal");
			super.withdraw(amount+fee);
	}
	

}
