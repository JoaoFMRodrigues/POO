package aula02;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        double saldo, juros;
        final int num_meses = 3;
        Scanner value_input = new Scanner(System.in);

        // value input
        System.out.print("Montante Investido (EUR): ");
        saldo = value_input.nextDouble();
        System.out.print("Taxa de 500juro mensal (%): ");
        juros = value_input.nextDouble();
        value_input.close();

        // calculo do saldo ao fim dos meses
        for (int i=1; i<= num_meses; i++) {
            saldo += saldo*(juros/100);
        }

        System.out.println(String.format("Balanço ao fim de %d meses (EUR): %.3f", num_meses , saldo));
    }
}