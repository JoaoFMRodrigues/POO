package aula05.Ex3;

public class Triangle {
    private double sideA, sideB, sideC;

    // Constructor
    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA < 0 || sideB < 0 || sideC < 0) {
            throw new IllegalArgumentException("All triangle sides must be greater than zero.");
        }
        if (!validTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Triangle sides must be greater than the sum of the other two.");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    //return the side A
    public double getSideA() {
        return this.sideA;
    }

    //return the side B
    public double getSideB() {
        return this.sideB;
    }

    //return the side C
    public double getSideC() {
        return this.sideC;
    }

    //set sideA
    public void setSideA(){
        if (sideA < 0) {
            throw new IllegalArgumentException("All triangle sides must be greater than zero.");
        }
        if (!validTriangle(sideA, this.sideB, this.sideC)) {
            throw new IllegalArgumentException("Triangle sides must be greater than the sum of the other two.");
        }

        this.sideA = sideA;
    }

    //set sideB
    public void setSideB(){
        if (sideB < 0) {
            throw new IllegalArgumentException("All triangle sides must be greater than zero.");
        }
        if (!validTriangle(this.sideA, sideB, this.sideC)) {
            throw new IllegalArgumentException("Triangle sides must be greater than the sum of the other two.");
        }

        this.sideB = sideB;
    }

    //set sideC
    public void setSideC(){
        if (sideC < 0) {
            throw new IllegalArgumentException("All triangle sides must be greater than zero.");
        }
        if (!validTriangle(this.sideA, this.sideB, sideC)) {
            throw new IllegalArgumentException("Triangle sides must be greater than the sum of the other two.");
        }

        this.sideC = sideC;
    }

    //Compare Triangles
    public boolean equals(Triangle triangle ) {
        return this.sideA == triangle.getSideA() && this.sideB == triangle.getSideB() && this.sideC == triangle.getSideC();
    }

    //return the area of the triangle
    public double area() {
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }

    //return the perimeter of the triangle
    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
    
    private boolean validTriangle(double side1, double side2, double side3) {
		return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
	}

    public String toString() {
        return "Triangle (sideA= " + this.sideA + ", sideB= " + this.sideB + ", sideC= " + this.sideC + ")";
    }
}
