package aula02;
import java.util.Scanner;
import java.lang.Math;

public class Ex8 {
    public static void main(String[] args) {

        double a, b, c, angle;
        Scanner value_input = new Scanner(System.in);

        // value input
        System.out.print("Cateto A: ");
        a = value_input.nextDouble();
        System.out.print("Cateto B: ");
        b = value_input.nextDouble();
        value_input.close();

        // Hipotenusa e angulo
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        angle = Math.toDegrees(Math.atan(b/a));
        
        System.out.println(String.format("Hipotenusa: %.2f" , c));
        System.out.println(String.format("Valor do ângulo entre cateto A e hipotenusa: %.2f" , angle));
    }
}