package aula05;
import java.util.Scanner;

public class Input {

    // Get int and check if value is valid
    public static int getInt(String message, Scanner sc, int min, int max) {
		while (true) {
			System.out.print(message);

			if (sc.hasNextInt()) {
				int value = sc.nextInt();

				if (value >= min && value <= max)
					return value;
				else if (min != Integer.MIN_VALUE && max != Integer.MAX_VALUE)
					System.out.println("ERROR: (invalid) Enter a value between " + min + " and " + max + ".");
				else if (min != Integer.MIN_VALUE)
					System.out.println("ERROR: (invalid) Enter a value greater than " + min + ".");
				else
					System.out.println("ERROR: Value is invalid!");

			} else {
				System.out.println("ERROR: Enter a valid value!");
				sc.next();
			}
		}
	}

    // Get int and check if value is valid (no min or max)
    public static int getInt(String message, Scanner sc) {
		return getInt(message, sc, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	// Get int and check if value is valid (no max)
	public static int getInt(String message, Scanner sc, int min) {
		return getInt(message, sc, min, Integer.MAX_VALUE);
	}


	// Get double and check if value is valid
	public static double getDouble(String message, Scanner sc, double min, double max) {
		while (true) {
			System.out.print(message);

			if (sc.hasNextDouble()) {
				double value = sc.nextDouble();

				if (value >= min && value <= max)
					return value;
				else if (min != Double.MIN_VALUE && max != Double.MAX_VALUE) {
					System.out.println("ERROR: (invalid) Enter a value between " + min + " and " + max + ".");
				} else if (min != Double.MIN_VALUE) {
					System.out.println("ERROR: (invalid) Enter a value greater than " + min + ".");
				} else {
					System.out.println("ERROR: Value is invalid!");
				}
			} else {
				System.out.println("ERROR: Enter a valid value!");
				sc.next();
			}
		}
	}

	// Get double and check if value is valid (no max)
	public static double getDouble(String message, Scanner sc, double min) {
		return getDouble(message, sc, min, Double.MAX_VALUE);
	}

	// Get double and check if value is valid (no min or max)
	public static double getDouble(String message, Scanner sc) {
		return getDouble(message, sc, Double.MIN_VALUE, Double.MAX_VALUE);
	}

	// Get string
	public static String getString(String message, Scanner sc) {
		System.out.print(message);
		return sc.nextLine();
	}
}
