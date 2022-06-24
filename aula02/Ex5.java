package aula02;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        double d1, d2, v1, v2, vmf;
        Scanner value_input = new Scanner(System.in);

        // value input
        System.out.println("Insira as velocidades em m/s e as distâncias em m");
        System.out.print("velocidade 1: ");
        v1 = value_input.nextDouble();
        System.out.print("distância 1: ");
        d1 = value_input.nextDouble();
        System.out.print("velocidade 2: ");
        v2 = value_input.nextDouble();
        System.out.print("distância 2: ");
        d2 = value_input.nextDouble();
        value_input.close();

        vmf = (d1+d2)/((d1/v1)+(d2/v2));

        System.out.println(String.format("Velocidade média final (m/s): %.2f", vmf));
    }
}