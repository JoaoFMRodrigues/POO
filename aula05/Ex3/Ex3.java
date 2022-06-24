package aula05.Ex3;
import java.util.Scanner;
import aula05.Input;

public class Ex3 {
    public static void main(String[] args) {

        //initiate values and Scanner
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(1, 1, 1);
        Rectangle rectangle = new Rectangle(1, 1);
        int option = 1;

        while (option != 0) {

            //print the menu
            System.out.println("Geometric Shapes:");
			System.out.println("1 - create a new circle");
            System.out.println("2 - create a new triangle");
            System.out.println("3 - create a new rectangle");
            System.out.println("4 - List all geometric shapes");
            System.out.println("--------------------------------");
            System.out.println("5 - Compare two Circles");
            System.out.println("6 - Compare two Triangles");
            System.out.println("7 - Compare two Rectangles");
			System.out.println("--------------------------------");
			System.out.println("8 - Calculate the Area and Perimeter of the Circle");
            System.out.println("9 - Calculate the Area and Perimeter of the Triangle");
            System.out.println("10 - Calculate the Area and Perimeter of the Rectangle");
            System.out.println("--------------------------------");
            System.out.println("0 - exit");


            //get the input for the menu option
            option = (Input.getInt("Choose an option: ", sc, 0, 10));
            System.out.print("\n");

            switch (option) {
                //create new Circle
                case 1:
                    System.out.println("\n > Create a new circle");
                    double radius = Input.getDouble("Enter the radius: ", sc, 0);

                    //create a circle
                    circle = new Circle(radius);
                    System.out.println(" > " + circle.toString() + " created!");
                    break;
            
                //create new Triangle
                case 2:
                    System.out.println("\n > Create a new triangle");
                    double sideA = Input.getDouble("Enter the side 1: ", sc, 0);
                    double sideB = Input.getDouble("Enter the side 2: ", sc, 0);
                    double sideC = Input.getDouble("Enter the side 3: ", sc, 0);

                    //create a triangle
                    triangle = new Triangle(sideA, sideB, sideC);
                    System.out.println(" > " + triangle.toString() + " created!");
                    break;

                //create new Rectangle
                case 3:
                    System.out.println("\n > Create a new rectangle");
                    double width = Input.getDouble("Enter the width: ", sc, 0);
                    double height = Input.getDouble("Enter the height: ", sc, 0);

                    //create a rectangle
                    rectangle = new Rectangle(width, height);
                    System.out.println(" > " + rectangle.toString() + " created!");
                    break;

                //list all geometric shapes
                case 4:
                    System.out.println("\n > List of all geometric shapes");
                    System.out.println(circle.toString());
                    System.out.println(triangle.toString());
                    System.out.println(rectangle.toString());
                    break;

                //compare two circles
                case 5:
                    System.out.println("\n > Compare two circles");
                    //create new Circle to compare
                    double radius2 = Input.getInt("Enter the radius for a second circle: ", sc, 0);
                    Circle circle2 = new Circle(radius2);

                    //compare two circles
                    System.out.println(circle.toString() + " and " + circle2.toString() + " Equals? " + circle.equals(circle2));
                    break;
                
                //compare two triangles
                case 6:
                    System.out.println("\n > Compare two triangles");
                    //create new Triangle to compare
                    double sideA2 = Input.getInt("Enter the side 1 for a second triangle: ", sc, 0);
                    double sideB2 = Input.getInt("Enter the side 2 for a second triangle: ", sc, 0);
                    double sideC2 = Input.getInt("Enter the side 3 for a second triangle: ", sc, 0);
                    Triangle triangle2 = new Triangle(sideA2, sideB2, sideC2);

                    //compare two triangles
                    System.out.println(triangle.toString() + " and " + triangle2.toString() + " Equals? " + triangle.equals(triangle2));
                    break;

                //compare two rectangles
                case 7:
                    System.out.println("\n > Compare two rectangles");
                    //create new Rectangle to compare
                    double width2 = Input.getInt("Enter the width for a second rectangle: ", sc, 0);
                    double height2 = Input.getInt("Enter the height for a second rectangle: ", sc, 0);
                    Rectangle rectangle2 = new Rectangle(width2, height2);

                    //compare two rectangles
                    System.out.println(rectangle.toString() + " and " + rectangle2.toString() + " Equals? " + rectangle.equals(rectangle2));
                    break;

                //calculate the area and perimeter of the circle
                case 8:
                    System.out.println("\n > Area and Perimeter of the " + circle.toString());
                    System.out.println("Area: " + circle.area());
                    System.out.println("Perimeter: " + circle.perimeter());
                    break;
                
                //calculate the area and perimeter of the triangle
                case 9:
                    System.out.println("\n > Area and Perimeter of the " + triangle.toString());
                    System.out.println("Area: " + triangle.area());
                    System.out.println("Perimeter: " + triangle.perimeter());
                    break;

                //calculate the area and perimeter of the rectangle
                case 10:
                    System.out.println("\n > Area and Perimeter of the " + rectangle.toString());
                    System.out.println("Area: " + rectangle.area());
                    System.out.println("Perimeter: " + rectangle.perimeter());
                    break;
                //exit
                case 0:
                    break;
            }
            System.out.print("\n");
        }

    }
}