package aula04;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        
        //user input
        System.out.println("Introduza uma frase: ");
        String frase = sc.nextLine();

        //operations
        System.out.println("\nA frase Introduzida\n");
        System.out.println("Tem " + countDigits(frase) + " characteres numéricos.");
        System.out.println("Tem " + countSpaces(frase) + " espaços.");
        System.out.println("Só contém minúsculas? " + isLowercase(frase));
        System.out.println("Frase com espaços duplicados removidos: " + removeDuplicateSpace(frase));
        System.out.println("É um palíndromo? " + isPalindrome(frase));
    
        sc.close();
    }

    //count digits in a string
    public static int countDigits(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) count++;
        }

        return count;
    }

    //count spaces in a string
    public static int countSpaces(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) count++;
        }

        return count;
    }

    //check if a string is only lowercase
    public static String isLowercase(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) return "Não"; // if character is digit returns false
            if (Character.isWhitespace(s.charAt(i))) { //if character is a white space, jump to next character
                i++;
                continue;
            }
            if (!Character.isLowerCase(s.charAt(i))) return "Não"; // if character not lower case returns false
        }
        return "Sim";
    }

    //remove duplicate spaces in a string
    public static String removeDuplicateSpace(String s) {
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i)) && Character.isWhitespace(newString.charAt(newString.length() - 1)))
                continue;
            newString += s.charAt(i);
        }
        return newString;
    }

    //check if a string is a palindrome
    public static String isPalindrome(String s) {
        String newString = "";
        s = s.toUpperCase();
    
        //remove spaces
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) continue;

            newString += s.charAt(i);
        }
        //check if palindrome
        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) != newString.charAt(newString.length() - 1 - i))
                return "Não";
        }

        return "Sim";
    }
    
}