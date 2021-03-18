package ro.ase.csie.cts.seminar4.banking;

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
	
//	public CreditBankAccount(NotificationService ns,String iban, Person accountHolder) {
//		super(ns);
//		this.iban=iban;
//		this.accountHolder=accountHolder;
//	}

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
	//metoda care inlocuieste constr
	public static CreditBankAccount createCreditBankAccountWithBalance(NotificationService ns,String iban, Person accountHolder, long balance) {
		return new CreditBankAccount(ns, iban, accountHolder,balance);
	}
	public static CreditBankAccount createCreditBankAccount(NotificationService ns,String iban, Person accountHolder) {
		return new CreditBankAccount(ns,iban, accountHolder,0);
	}
	
}
