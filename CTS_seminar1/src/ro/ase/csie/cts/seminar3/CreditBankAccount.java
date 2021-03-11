package ro.ase.csie.cts.seminar3;

public class CreditBankAccount extends BankAccount implements Receivable {
	
//	private long balance;
//	private String iban;
//	private Person accountHolder;
	
	public CreditBankAccount(NotificationService ns,String iban, Person accountHolder, long balance) {
		super(ns);
		this.iban=iban;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}

//	@Override
//	public void withdraw(long amount) throws InsuficientFundsException {
//		throw new UnsupportedOperationException("Cannot withdraw from this account");
//
//	}

	@Override
	public void deposit(long amount) {
		notificationService.sendNotification(accountHolder, "Adding " + amount  + " to " +iban);
		//System.out.println("Adding " + amount  + " to " +iban);
		this.balance +=amount;

	}

//	public void setBalance(long balance) {
//		this.balance = balance;
//	}
	
}
