package aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double massa, temp_inicial, temp_final, energia;
        Scanner value_input = new Scanner(System.in);

        // Value input
        System.out.print("Quantidade de agua (Kg): ");
        massa = value_input.nextDouble();
        System.out.print("Temperatura inicial da água (ºC): ");
        temp_inicial = value_input.nextDouble();
        System.out.print("Temperatura final da água (ºC): ");
        temp_final = value_input.nextDouble();
        value_input.close();

        // Energy in Joules
        energia = massa*(temp_final-temp_inicial)*4184;

        System.out.println(String.format("Energia necessária (J) para aquecer a água: %.2f" , energia));
    }
}