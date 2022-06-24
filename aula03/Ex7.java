package aula03;
import java.util.Scanner;

public class Ex7 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        
        String answer;
        boolean running = true;

        do {
            int value = -1;
            int random = (int) Math.ceil(Math.random()*100);
            int tries = 0;
            
            while (value != random){
                System.out.print("guess: ");
                
                tries +=1;
                
                if (sc.hasNextInt()){
                    value = sc.nextInt();
                    if (value > 0 && value < 100) {
                        if (value > random){
                            System.out.println("Demasiado ALTO!\n");
                        }
                        else if (value < random){
                            System.out.println("Demasiado Baixo!\n");
                        }
                    }
                    else {
                        System.out.println("O número (inteiro) é entre 0-100");
                    }
                }
                else {
                    System.out.println("ERRO: Introduza um número válido!");
                    sc.next();
                }
            }
            System.out.printf("\nCerto o número é %d. Tentativas: %d", random, tries);
            
            sc.nextLine();
            System.out.println("\nPretende continuar? Prima (S)im");
            answer = sc.nextLine().toLowerCase();
    
            if (!(answer.equals("s")) && !(answer.equals("sim"))) {
                running = false;
            };
        }while(running);
    }
}
