package ro.ase.csie.cts.seminar4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.seminar4.banking.BankAccount;
import ro.ase.csie.cts.seminar4.banking.CreditBankAccount;
import ro.ase.csie.cts.seminar4.banking.DebitBankAccount;
import ro.ase.csie.cts.seminar4.banking.EmailNotificationService;
import ro.ase.csie.cts.seminar4.banking.NotificationService;
import ro.ase.csie.cts.seminar4.banking.Person;

public class Main {

	public static void main(String[] args) {
		NotificationService emailService = new EmailNotificationService();
		
		Person p3 = new Person("Donald Trump");
		p3.setEmail("donald@trump.com");
		p3.setMobile("072223664");
		DebitBankAccount b3 = new DebitBankAccount(emailService,"BT74865387",p3);

		
		//static factory m.
		
		//BankAccount b = new CreditBankAccount(emailService, "ING78345289",p3,100);
		CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance
				(emailService, "ING78345289",p3,100);
		
		CreditBankAccount b1 = CreditBankAccount.createCreditBankAccount(emailService, "RFZ876457863", p3);
		
		BigInteger bi = new BigInteger(24,11,new Random());
		BigInteger bi2 = BigInteger.probablePrime(12, new Random());
		
		Boolean value = Boolean.valueOf(false);
		
		b.deposit(50);
		
		System.out.println(b.toString());
		
	}

}
