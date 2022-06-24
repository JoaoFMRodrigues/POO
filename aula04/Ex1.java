package aula04;
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {

        //variables
        Scanner sc = new Scanner(System.in);
        String  stringInput = new String();

        //user input
        System.out.print("Introduza uma string (frase, palavra ou parágrafo): ");
        stringInput = sc.nextLine();

        System.out.println("\nResultado:\n");
        //lowercase | last char | 3 first chars 
        System.out.println("Minúsculas: " + stringInput.toLowerCase());
        System.out.println("Último caracter da string: " + stringInput.charAt(stringInput.length()-1));
        System.out.println("Primeiros 3 caracteres: " + stringInput.substring(0, 3));
        
        //other String class methods
        System.out.println("Maiúsculas: " + stringInput.toUpperCase());
        System.out.println("Tamanho da String: " + stringInput.length());
        System.out.println("String Repetida 2x: " + stringInput.repeat(2));

        sc.close();
    }

}