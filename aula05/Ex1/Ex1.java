package aula05.Ex1;
import java.util.Scanner;
import aula05.Input;

public class Ex1 {
    public static void main(String[] args) {

        //initiate values and Scanner
        Scanner sc = new Scanner(System.in);
        Date date = new Date(1, 1, 1900);
        int option = 1;

        while (option != 0) {

            //print the menu
            System.out.println("Date operations:");
			System.out.println("1 - create new date");
			System.out.println("2 - show current date");
			System.out.println("3 - increment date");
			System.out.println("4 - decrement date");
			System.out.println("0 - exit");

            //get the input for the menu option
            option = (Input.getInt("Choose an option: ", sc, 0, 4));
            System.out.print("\n");

            switch (option) {
                //create new date
                case 1:
                    int day = Input.getInt("Enter the day: ", sc, 1, 31);
                    int month = Input.getInt("Enter the month: ", sc, 1, 12);
                    int year = Input.getInt("Enter the year: ", sc, 0);

                    //create a date
                    date = new Date(day, month, year);
                    System.out.println(" > Date created");
                    break;

                //show current date
                case 2:
                    System.out.println(" > Current date: " + date.toString());
                    break;

                //increment date
                case 3:
                    date.increment();
                    System.out.println(" > Date incremented: " + date.toString());
                    break;

                //decrement date
                case 4:
                    date.decrement();
                    System.out.println(" > Date decremented: " + date.toString());
                    break;

                //exit
                case 0:
                    break;
            }
            System.out.print("\n");
        }

    }
}
