package aula05.Ex2;
import java.util.Scanner;
import aula05.Input;

public class Ex2 {
    public static void main(String[] args) {

        //initiate values and Scanner
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new Calendar(1, 1);
        int option = 1;

        while (option != 0) {

            //print the menu
            System.out.println("Calendar operations:");
			System.out.println("1 - create new calendar");
			System.out.println("2 - print calendar month");
			System.out.println("3 - print calendar");
			System.out.println("0 - exit");

            //get the input for the menu option
            option = (Input.getInt("Choose an option: ", sc, 0, 4));
            System.out.print("\n");

            switch (option) {
                //create new Calendar
                case 1:
                    int year = Input.getInt("Enter the year: ", sc, 0);
                    int weekDay = Input.getInt("Enter the week day for the start of the year (Sunday: 1 to Saturday: 7): ", sc, 1, 7);

                    //create a calendar
                    calendar = new Calendar(year, weekDay);
                    System.out.println(" > Calendar created");
                    break;

                //print calendar month
                case 2:
                    int month = Input.getInt("Enter the month: ", sc, 1, 12);
                    calendar.printMonth(month);
                    break;

                //print calendar for year
                case 3:
                    calendar.toString();
                    break;
                
                //exit
                case 0:
                    break;
            }
            System.out.print("\n");
        }

    }
}
