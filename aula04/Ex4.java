package aula04;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        int[] values = readValues();
        drawCalendar(values[0], values[1], values[2]);
    }

    public static int getInt(String message, Scanner sc, int min, int max) {
		while (true) {
			System.out.print(message);

			if (sc.hasNextInt()) {
				int value = sc.nextInt();

				if (value >= min && value <= max)
					return value;
				else if (min != Integer.MIN_VALUE && max != Integer.MAX_VALUE)
					System.out.println("ERRO: (inválido) Introduza um valor entre " + min + " e " + max + ".");
				else if (min != Integer.MIN_VALUE)
					System.out.println("ERRO: (inválido) Introduza um valor superior a " + min + ".");
				else
					System.out.println("Valor inválido!");

			} else {
				System.out.println("Introduza um número válido!");
				sc.next();
			}
		}
	}

    public static int getInt(String message, Scanner sc) {
		return getInt(message, sc, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

    public static int[] readValues() {
        Scanner sc = new Scanner(System.in);
        int month = getInt("Mês: ", sc);
        int year = getInt("Ano: ", sc);
        int weekDay = getInt("Dia da semana: ", sc, 1, 7);
		if (weekDay == 7) weekDay = 0;
        sc.close();
        return new int[] {month, year, weekDay};
    }

    public static int numberOfDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) return 29;
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        return 31;
    }
	public static String getMonthName(int month) {
		switch (month) {
			case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
			default: return "";
		}
	}

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void drawCalendar(int month, int year, int weekDay) {
		int days = numberOfDaysInMonth(month, year);
		String monthName = getMonthName(month);

		int monthNameLength = monthName.length();
		int yearLength = String.valueOf(year).length();
		int padding = (20 - monthNameLength - yearLength) / 2;
		String paddingString = "";
		for (int i = 0; i < padding; i++) paddingString += " ";
		
		System.out.println("\n" + paddingString + monthName + " " + year + paddingString);
		System.out.println("Su Mo Tu We Th Fr Sa");

		for (int i = 0; i < weekDay; i++) System.out.print("   ");

		for (int i = 1; i <= days; i++) {
			System.out.printf("%2d ", i);
			if ((i + weekDay) % 7 == 0 || i == days) System.out.println();
		}
    }
}