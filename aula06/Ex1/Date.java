package aula06.Ex1;

public class Date {

	private int day, month, year;

    // Constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

		if (!valid(day, month, year)) {
			throw new IllegalArgumentException("Invalid date");
		}
	}

    //check if the month is valid
	public boolean validMonth(int month) {
		
        if (month < 1 || month > 12) {
            return false;
        }
        
        return true;
    }

    //check how many days are in the month
	public static int monthDays(int month, int year) {
		if (month == 2) {
			if (leapYear(year))
				return 29;
			return 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}

		return 31;
	}

    //check if the year is a leap year
	public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        
		return false; 
	}

    //check if the date is valid
	public boolean valid(int day, int month, int year) {
        if (validMonth(month) && day >= 1 && day <= monthDays(month, year)) {
            return true;
        }

		return false;
	}

    //set a date
	public void set(int day, int month, int year) {
		if (valid(day, month, year)) {

			this.day = day;
			this.month = month;
			this.year = year;
            
		} else {
			System.out.println("The date is invalid");
		}
	}

    //get the date Day
	public int getDay() {
		return this.day;
	}

    //get the date Month
	public int getMonth() {
		return this.month;
	}

    //get the date Year
	public int getYear() {
		return this.year;
	}

    //increment the date
	public void increment() {
        // check if its the last day of the month
		if (this.day == monthDays(this.month, this.year)) {
			this.day = 1;
            // check if its the last month of the year
			if (this.month == 12) {
				this.month = 1;
				this.year++;
			} else {
				this.month++;
			}
		} else {
			this.day++;
		}
	}

    //decrement the date
	public void decrement() {
        // check if its the first day of the month
		if (this.day == 1) {
            // check if its the first month of the year
			if (this.month == 1) {
				this.month = 12;
				this.year--;
			} else {
				this.month--;
			}
			this.day = monthDays(this.month, this.year);
		} else {
			this.day--;
		}
	}

    //return the date with the format yyyy/mm/dd with the toString method
	public String toString() {
		return String.format("%04d-%02d-%02d", this.year, this.month, this.day);
	}
}