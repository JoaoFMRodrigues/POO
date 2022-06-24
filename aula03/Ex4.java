package aula03;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        double first, max, min, sum, media, temp;
        int count = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insere um nº real: ");
        first = sum = max = min = sc.nextDouble();

        while (true) { 
            System.out.print("Insere um nº real: ");
            temp = sc.nextDouble();
            if (temp < min) min = temp;
            if (temp > max) max = temp;
            sum += temp;
            count += 1;
            if (temp == first) break;
        }
        media = sum / count; 
        sc.close();

        System.out.println(String.format("\nValor Máximo: %.2f\nValor Mínimo: %.2f\nMédia: %.2f\nTotal de números lidos: %d", max, min, media, count));
    }
}

