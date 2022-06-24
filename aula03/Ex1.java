package aula03;
import java.util.Scanner;

public class Ex1 {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double notaP = Math.round(getDouble("Nota prática: ", sc, 0, 20) * 10) / 10.0;
		double notaT = Math.round(getDouble("Nota teórica: ", sc, 0, 20) * 10) / 10.0;

		if (notaP < 7 || notaT < 7) {
			System.out.println("66");
		} else {
			double notaFinal = Math.round(0.4 * notaT + 0.6 * notaP);
			System.out.println("A nota final é: " + notaFinal);
		}

		sc.close();
	}
}