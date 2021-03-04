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
	
	public String weekDay2(int day) {
		switch(day) {
			case 1:
				return "Sunday";
			case 2:
				return "Monday";
			case 3:
				return "Tuesday";
			case 4:
				return "Wednesday";
			case 5:
				return "Thursday";
			case 6:
				return "Friday";
			case 7:
				return "Saturday";
			default:
					return null;
		}
	}
	
	public String weekDay3(int day)
	{
		if (day < 0 || day > 7) {
            return null;
        }
		String[] zileSapt = new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Freiday","Saturday"};
		return zileSapt[day-1];
	}

}
