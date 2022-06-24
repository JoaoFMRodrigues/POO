package aula03;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        int value;
        boolean running = true;
        boolean prime = true;
        Scanner sc= new Scanner(System.in);

        while (running) {

            System.out.print("Insire o número inteiro positivo: ");
            value = sc.nextInt();

            // check if input number is positive
            if (value > 0 ) {
                running = false;
                      
                prime = isPrime(value);

                // print the result
                if (prime) {
                    System.out.println(String.format("%d é um número primo.", value));
                }
                else {
                    System.out.println(String.format("%d não é um número primo.", value));
                }
            }
            else {
                System.out.println("ERRO: Insere um número positivo!");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
		if (n < 2) return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
}