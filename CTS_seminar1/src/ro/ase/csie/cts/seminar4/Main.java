package ro.ase.csie.cts.seminar4;

import java.math.BigInteger;
import java.util.Random;


import ro.ase.csie.cts.seminar4.banking.Bank;
import ro.ase.csie.cts.seminar4.banking.BankAccount;
import ro.ase.csie.cts.seminar4.banking.CreditBankAccount;
import ro.ase.csie.cts.seminar4.banking.DebitBankAccount;
import ro.ase.csie.cts.seminar4.banking.EmailNotificationService;
import ro.ase.csie.cts.seminar4.banking.InsuficientFundsException;
import ro.ase.csie.cts.seminar4.banking.NotificationService;
import ro.ase.csie.cts.seminar4.banking.Person;
import ro.ase.csie.cts.seminar4.singleton.Elvis;

public class Main {

	public static void main(String[] args) {
		NotificationService emailService = new EmailNotificationService();
		Person p3 = new Person("Pers 3");
		p3.setEmail("donald@trump.com");
		p3.setMobile("072223664");
		
		DebitBankAccount b3 = new DebitBankAccount(emailService,"BT74865387",p3);

		
		//static factory method
		
		//BankAccount b = new CreditBankAccount(emailService, "ING78345289",p3,100);
		CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance
				(emailService, "ING78345289",p3,100);
		
		CreditBankAccount b1 = CreditBankAccount.createCreditBankAccount(emailService, "RFZ876457863", p3);
		
		BigInteger bi = new BigInteger(24,11,new Random());
		BigInteger bi2 = BigInteger.probablePrime(12, new Random());
		
		Boolean value = Boolean.valueOf(false);
		
		b.deposit(50);
		
		System.out.println(b.toString());
		
		Elvis elvis = Elvis.getInstance();
		System.out.println("\n");
		elvis.sing();
		
		Elvis elvis2 = Elvis.getInstance();
		System.out.println(elvis==elvis2);
		
		ElvisV2 elvisV2 = ElvisV2.INSTANCE;
		elvisV2.sing();
		
		Bank bank = Bank.getInstance();
		
		Person adult = new Person("Donald Trump");
		adult.setEmail("donald@trump.com");
		adult.setMobile("072223664");
		adult.setAge(23);
		adult.setNotificationType(Person.NotificationType.EMAIL);
		
		Person child = new Person("Copilul");
		child.setEmail("copil@yahoo.com");
		child.setMobile("072223664");
		child.setAge(14);
		child.setNotificationType(Person.NotificationType.SMS);
		
		DebitBankAccount debit1 = bank.openDebitAccount(adult);
		DebitBankAccount debit2 = bank.openDebitAccount(child);
		
		debit1.deposit(20);
		debit2.deposit(5);
		try {
			debit1.withdraw(15);
			debit2.withdraw(3);
		} catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}
		

		
		System.out.println(debit1);
		System.out.println(debit2);
	}

}
