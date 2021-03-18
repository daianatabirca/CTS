package ro.ase.csie.cts.seminar4.banking;


public class Bank {

	private NotificationService emailNotificationService;
	private NotificationService smsNotificationService;
	
	//SINGLETON
	
	private static Bank INSTANCE;
	private Bank() {
		emailNotificationService = new EmailNotificationService();
		smsNotificationService = new SMSNotificationService();
	}
	
	public static synchronized Bank getInstance() {
		if (INSTANCE==null)
			INSTANCE = new Bank();
		
		return INSTANCE;
		
	}
	
	public DebitBankAccount openDebitAccount(Person holder) {
		DebitBankAccount account;
		if(holder.getAge() > 18)
//			 account = new FeeBankAccount(holder.getNotificationType() == Person.NotificationType.EMAIL ? emailNotificationService : smsNotificationService, generateIban(), holder);
			 account = new FeeBankAccount(holder.getNotificationType().getNotificationService(), generateIban(), holder);
			
			else
            
			//account = new DebitBankAccount(holder.getNotificationType() == Person.NotificationType.EMAIL ? emailNotificationService : smsNotificationService, generateIban(), holder);
			account = new DebitBankAccount(holder.getNotificationType().getNotificationService(), generateIban(), holder);
		return account;
	}
	
	private String generateIban() {
		return "ING" 
				+ System.currentTimeMillis();
	}
	

	
}
