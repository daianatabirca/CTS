package ro.ase.csie.cts.seminar2;

public class CalendarUtil {
	public  String weekDay(int day) {
		if(day==1)
			return "Sunday";
		else if(day==2)
			return "Monday";
		else if(day==3)
			return "Tuesday";
		else if(day==4)
			return "Wednesday";
		else if(day==5)
			return "Thursday";
		else if(day==6)
			return "Friday";
		else if(day==7)
			return "Saturday";
		
		return null;
	}

}
