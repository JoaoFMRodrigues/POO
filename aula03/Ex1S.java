package aula03;
import java.util.Scanner;

public class Ex1S {

    private static Scanner sc = new Scanner(System.in);

    private static double userInput(String message, double minValue, double maxValue) {
        double in = minValue - 1;
        do {
            System.out.print(message);
            while (!sc.hasNextDouble()){
                System.out.format("O valor introduzido não é válido. " + message);
                sc.next();
            }
            if (in < minValue || in > maxValue) {
                System.out.format("Introduz valor entre %.0f e %.0f.", minValue, maxValue);
            }
        }while (in < minValue || in > maxValue);
    
        return in;
    }   

    public static void main(String[] args){
        userInput("Introduz um valor", 10, 50);
    }
}
