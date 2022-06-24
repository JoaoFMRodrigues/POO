package aula03;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

        int N;
        boolean running = true;
		Scanner sc = new Scanner(System.in);

        while (running) {

            System.out.print("Insere um número (positivo):");
            N = sc.nextInt();

            if (N > 0 ) {
                running = false;

                for (int i = N; i >= 0; i--) {
                    System.out.println(i);
                } 
            }
            else {
                System.out.println("ERRO: Insere um número positivo!");
            }

        }
        
        sc.close();

	}
}