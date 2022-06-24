package aula03;
import java.util.Scanner;

public class Ex5 {

    public static double getDouble(String message, Scanner sc, double min, double max) {
		
        while (true) {
			System.out.print(message);

			if (sc.hasNextDouble()) {
				double value = sc.nextDouble();

				if (value >= min && value <= max)
					return value;
				else if (min != Double.MIN_VALUE && max != Double.MAX_VALUE)
					System.out.println("ERRO: (inválido) Introduza um valor entre " + min + " e " + max + ".");
				else if (min != Double.MIN_VALUE)
					System.out.println("ERRO: (inválido) Introduza um valor superior a " + min + ".");
				else
					System.out.println("ERRO: Valor inválido");

			} else {
				System.out.println("Introduza um valor válido!");
				sc.next();
			}
		}
	}

	public static double getDouble(String message, Scanner sc, double min) {
		return getDouble(message, sc, min, Double.MAX_VALUE);
	}
	public static void main(String[] args) {
        int months = 12;
		double value, tax;

		Scanner sc = new Scanner(System.in);

		do {

			value = getDouble("Saldo inicial: ", sc, 0);

			if (value % 1000 != 0) System.out.println("Montante investido (valor múltiplo de 1000)");

		} while (value % 1000 != 0);

		tax = getDouble("Taxa de juro mensal (entre 0% e 5%): ", sc, 0, 5);

		for (int i = 1; i <= months; i++) {
			value += value * (tax / 100);
			System.out.printf("Valor final do mês %02d (EUR): %.2f\n", i, value);
		}
		
		sc.close();
	}
}