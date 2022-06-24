package aula04;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        
        //user input
        System.out.println("Introduza uma frase: ");
        String s = sc.nextLine();
        
        //print out acronym
        System.out.println("Acrónimo: " + Acronym(s));

        sc.close();
    }

    //create and return acronym
    public static String Acronym(String s) {

        //split the words of the string into an array
        String[] words = s.split(" ");

        //initiate the acronym (empty)
        String ac = "";

        //get the first character of each words with length greater than 3
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 3) {
                ac += words[i].charAt(0);
            }
        }

        return ac.toUpperCase();
    }
}