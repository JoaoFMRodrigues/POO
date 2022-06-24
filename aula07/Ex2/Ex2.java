package aula07.Ex2;
import java.util.Scanner;
import aula07.Input;

public class Ex2 {
	public static void main(String[] args) {
		int input;
		DateYMD date = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Date operations:");
			System.out.println("1 - create new date");
			System.out.println("2 - show current date");
			System.out.println("3 - increment date");
			System.out.println("4 - decrement date");
			System.out.println("0 - exit");

			input = Input.getInt("Select Option: ", sc, 0, 4);

			switch (input) {
				case 1:
					int day = Input.getInt("Day: ", sc, 1, 31);
					int month = Input.getInt("Month: ", sc, 1, 12);
					int year = Input.getInt("Year: ", sc);

					date = new DateYMD(day, month, year);
					System.out.println("Date was created: " + date);
					break;

				case 2:
					if (date == null) {
						System.out.println("No date created");
						break;
					}
					
					System.out.println("Date: " + date.toString());
					break;

				case 3:
					if (date == null) {
						System.out.println("No date created");
						break;
					}

					int daysIn = Input.getInt("Number of days: ", sc);
					date.increment(daysIn);
					System.out.println("Date incremented: " + date);
					break;

				case 4:
					if (date == null) {
						System.out.println("No date created");
						break;
					}

					int daysDe = Input.getInt("Number of days: ", sc);
					date.decrement(daysDe);
					System.out.println("Date decremented: " + date);
					break;

				case 0:
					break;
			}

			System.out.println();
		} while (input != 0);
	}
}