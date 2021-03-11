package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
//		Person p = new Person("Daiana");
//		BankAccount account = new BankAccount("INGB34762872",p);
//		
//		account.deposit(100);
//		try {
//			account.withdraw(30);
//			account.withdraw(40);
//			account.withdraw(70);
//		} catch (InsuficientFundsException e) {
//			System.out.println(e.getMessage());
//		}
//		
		Map<Person, Receivable> employees = new HashMap<>();
		
		Person p1 = new Person("Chuck Norris");
		CreditBankAccount b1 = new CreditBankAccount("RFZ37842943872",p1,-500);
		
		Person p2 = new Person("Arnold");
		DebitBankAccount b2 = new FeeBankAccount("INGB3434894",p2);
		
		Person p3 = new Person("Donald Trump");
		DebitBankAccount b3 = new DebitBankAccount("BT74865387",p3);
		
		
		employees.put(p1, b1); //cheie,valoare 
		employees.put(p2, b2); //cheie = persoana; valoare = BankAccount
		employees.put(p3, b3);
		
		for(Receivable a : employees.values()) {
			a.deposit(1000);
		}
		
		Map<Person, Payable> union = new HashMap<>();//sindicatul
		
		union.put(p2, b2);
		union.put(p3, b3);
		
		
		for(Payable a : union.values()) {
			try {
				a.withdraw(10);
				
			}catch (InsuficientFundsException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		
		
		//System.out.println(account.getBalance());
		
//		System.out.println(account.getBalance());
//		
//		FeeBankAccount fb = new FeeBankAccount("INGB3476442872",p); 
//		//sau
//		//account = new FeeBankAccount("INGB3476442872",p); //polimorfism
//		
//		fb.deposit(500);
//		
//		try {
//			fb.withdraw(100);
//		} catch (InsuficientFundsException e) {
//			System.out.println(e.getMessage());
//		}
		
		//System.out.println(fb.getBalance());
		
//		CalendarUtil cu = new CalendarUtil();
//		
//		double d1=1.02;
//		double d2=0.43;
//		
//		BigDecimal bg1 = new BigDecimal("1.02");
//		BigDecimal bg2 = new BigDecimal("0.43");
//		
//		System.out.println(bg1.subtract(bg2)); //cu zecimale precise
//		
//		System.out.println(d1-d2); //cu multe zecimale (virgula mobila)
//		
//		try {
//			//System.out.println(cu.weekDay(9).toUpperCase()); //apare eroarea
//			System.out.println(cu.weekDay2(4));
//			System.out.println(cu.weekDay3(3));
//			System.out.println(cu.weekDay4(3));
//		} catch (IncorectDayException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		//SHORTCUTS
		
		//syso(+ctrl si spacebar + enter) -> shortcut pt System.out.println
		//sau ctrl+1 pt altele
		//ctrl+o gasire mai rapida metoda
		//ctrl+shift+t sa gasim clasa/exceptia etc in pachete
	}

}
