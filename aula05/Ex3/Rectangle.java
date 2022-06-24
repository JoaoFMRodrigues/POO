package aula05.Ex3;

public class Rectangle {

    private double width, height;

    // Constructor
    public Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Both Width and Height must be greater than zero.");
        }

        this.width = width;
        this.height = height;
    }
    
    //return the width
    public double getWidth() {
        return this.width;
    }

    //return the height
    public double getHeight() {
        return this.height;
    }

    //set the width
    public void setWidth(){
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than zero.");
        }

        this.width = width;
    }

    //set the height
    public void setHeight(){
        if (height < 0) {
            throw new IllegalArgumentException("Height must be greater than zero.");
        }

        this.height = height;
    }

    //Compare Rectangles
    public boolean equals(Rectangle rectangle) {
        return this.width == rectangle.getWidth() && this.height == rectangle.getHeight();
    }

    //return the area of the rectangle
    public double area() {
        return this.width * this.height;
    }

    //return the perimeter of the rectangle
    public double perimeter() {
        return 2 * (this.width + this.height);
    }
    
    public String toString() {
        return "Rectangle (width= " + this.width + ", height= " + this.height + ")";
    }
}
