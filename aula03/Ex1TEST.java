package aula03;
import java.util.Scanner;

public class Ex1TEST {
    
    public static double getValue() {

        boolean running = true;
        double value_input = 0;
        Scanner sc = new Scanner(System.in);

        while (running) {            
             value_input = sc.nextDouble();
            
            if (value_input >= 0 && value_input <= 20) {
                running = false;      
            }
            else {
                System.out.println("Deves inserir um valor entre 0 e 20");
            } 
        }
        sc.close();

        return value_input;
    }
    public static void main(String[] args){

        double notaP = 0;
        double notaT = 0;

        System.out.print("Insere a nota da Componente Prática: ");
        notaT = getValue();
        System.out.println(notaT);

        System.out.print("Insere a nota da Componente Prática: ");
        notaP = getValue();
        System.out.println(notaP);
    }
}
