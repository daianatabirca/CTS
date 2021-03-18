package ro.ase.csie.cts.seminar4.banking;

public abstract class BankAccount {
    protected String iban;
    protected long balance;
    protected Person accountHolder;
    
    protected NotificationService notificationService;
    
    public BankAccount(NotificationService notificationService) {
    	this.notificationService=notificationService;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

	@Override
	public String toString() {
		return "BankAccount [iban=" + iban + ", balance=" + balance + "]";
	}
}