package ro.ase.csie.cts.seminar2;

import java.math.BigDecimal;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar2.solid.Person;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("Daiana");
		BankAccount account = new BankAccount("INGB34762872",p);
		
		account.deposit(100);
		account.withdraw(50);
		
		account.withdraw(70);
		
		
		System.out.println(account.getBalance());
		
		
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
		

	}

}
