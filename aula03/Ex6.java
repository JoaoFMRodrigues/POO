package aula03;
import java.util.Scanner;

public class Ex6 {
    
    public static int getInt(String message, Scanner sc, int min, int max) {
		while (true) {
			System.out.print(message);

			if (sc.hasNextInt()) {
				int value = sc.nextInt();

				if (value >= min && value <= max) return value;
				else if (min != Integer.MIN_VALUE && max != Integer.MAX_VALUE) {
					System.out.println("ERRO: Introduza um valor entre " + min + " e " + max);
                }
				else if (min != Integer.MIN_VALUE) {
                    System.out.println("ERRO: Introduza um valor superior a " + min);
                }
				else {
					System.out.println("ERRO");
                }
			} else {
				System.out.println("ERRO: Introduza um número válido!");
				sc.next();
			}
		}
	}

	public static int getInt(String message, Scanner sc, int min) {
		return getInt(message, sc, min, Integer.MAX_VALUE);
	}

    public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);

		int days = 31;
		int month = getInt("Mês: ", sc, 0, 12);
		int year = getInt("Ano: ", sc, 0);

		if (month == 2) {

			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				days = 29;

			else days = 28;

		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		}

		System.out.println("O mês " + month + " do ano " + year + " tem " + days + " dias.");
		sc.close();
	}
}