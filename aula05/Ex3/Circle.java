package aula05.Ex3;

public class Circle {

    private double radius;

    // Constructor
    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }

        this.radius = radius;
    }
    
    //return the radius
    public double getRadius() {
        return this.radius;
    }

    //set the radius
    public void setRadius(){
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }

        this.radius = radius;
    }

    //Compare Circle with other Circle
    public boolean equals(Circle circle) {
        return this.radius == circle.getRadius();
    }

    //return the area of the circle
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    //return the perimeter of the circle
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    public String toString() {
        return "Circle (radius= " + this.radius + ")";
    }
}
