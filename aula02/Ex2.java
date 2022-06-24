package aula02;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        double celcius, fahrenheit;
        Scanner value_input = new Scanner(System.in);

        // Value input
        System.out.print("Graus celcius: ");
        celcius = value_input.nextDouble();
        value_input.close();

        // Celsius to Fahrenheit conversion
        fahrenheit = 1.8*celcius+32;

        System.out.printf("Temperatura em fahrenheit: %.2f", fahrenheit);
    }
}