package aula02;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        int seconds, hours, minutes;
        Scanner value_input = new Scanner(System.in);

        // value input
        System.out.print("Tempo em segundos: ");
        seconds = value_input.nextInt();
        value_input.close();

        // Conversion hh:mm:ss
        hours = seconds/3600;
        seconds -= hours*3600;
        minutes = seconds/60;
        seconds -= minutes*60;

        System.out.println(String.format("%02d:%02d:%02d",hours,minutes,seconds));
    }
}