package aula05.Ex2;
import aula05.Ex1.Date;

public class Calendar {

    private int year, weekDay;

    // Constructor
    public Calendar(int year, int weekDay) {
		this.year = year;
		this.weekDay = weekDay;
	}

    // Get year
    public int year() {
        return this.year;
    }

    // Get first week day of the year
    public int firstWeekdayOfYear() {
        return this.weekDay;
    }

    // Get first week day of the month
    public int firstWeekdayOfMonth(int month) {
        int firstWeekdayMonth = this.weekDay;

        for (int i = 1; i < month; i++) {
            firstWeekdayMonth += Date.monthDays(i, this.year);
        }

        if (firstWeekdayMonth % 7 == 0) {
            return 7;
        }

        return firstWeekdayMonth % 7;
    }

    // Print a certain month calendar
    public void printMonth(int month){
        int firstWeekdayMonth = this.firstWeekdayOfMonth(month);
        int monthDays = Date.monthDays(month, this.year);
        String monthName = getMonthName(month);

        int monthNameLength = monthName.length();
		int yearLength = String.valueOf(year).length();
		int padding = (20 - monthNameLength - yearLength) / 2;
		String paddingString = "";
		for (int i = 0; i < padding; i++){
            paddingString += " ";
        } 

        System.out.println(paddingString + monthName + " " + year + paddingString);
		System.out.println("Su Mo Tu We Th Fr Sa");
		

        for (int i = 1; i < firstWeekdayMonth; i++) System.out.print("   ");

		for (int i = 1; i <= monthDays; i++) {
			System.out.printf("%2d ", i);
			if ((i + firstWeekdayMonth - 1) % 7 == 0 || i == monthDays) System.out.println();
		}

        System.out.println();
    }

    // Print the calendar for a year
    public String toString() {
		for (int i = 1; i <= 12; i++) {
			printMonth(i);
			if (i != 12) System.out.println();
		}

		return this.year + " - Calendar";
	}

    // get the month name based on int input
    public String getMonthName(int month){
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }
}
