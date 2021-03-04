package ro.ase.csie.cts.seminar2;

public class Main {

	public static void main(String[] args) {
		
		CalendarUtil cu = new CalendarUtil();
		
		try {
			//System.out.println(cu.weekDay(9).toUpperCase()); //apare eroarea
			System.out.println(cu.weekDay2(4));
			System.out.println(cu.weekDay3(3));
			System.out.println(cu.weekDay4(3));
		} catch (IncorectDayException e) {
			System.out.println(e.getMessage());
		}
	}

}
