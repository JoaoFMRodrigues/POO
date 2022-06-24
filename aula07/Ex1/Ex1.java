package aula07.Ex1;

import java.util.Scanner;

import java.util.ArrayList;
import aula07.Input;

public class Ex1 {
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);

		ArrayList<Circle> circles = new ArrayList<Circle>();
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();

		do {
			System.out.println("Geometric shapes operations:");
			System.out.println("1 - create new Circle");
			System.out.println("2 - create new Rectangle");
			System.out.println("3 - create new Triangle");
			System.out.println("4 - show current Circle");
			System.out.println("5 - show current Rectangle");
			System.out.println("6 - show current Triangle");
			System.out.println("7 - change Circle radius");
			System.out.println("8 - change Rectangle width and height");
			System.out.println("9 - change Triangle side1, side2 and side3");
			System.out.println("10 - show Circle area");
			System.out.println("11 - show Rectangle area");
			System.out.println("12 - show Triangle area");
			System.out.println("13 - show Circle perimeter");
			System.out.println("14 - show Rectangle perimeter");
			System.out.println("15 - show Triangle perimeter");
			System.out.println("16 - compare all circles");
			System.out.println("17 - compare all rectangles");
			System.out.println("18 - compare all triangles");
			System.out.println("0 - exit");

			input = Input.getInt("Select Option: ", sc, 0, 18);

			switch (input) {
				case 1:
					double radius = Input.getDouble("Raio: ", sc);
					String circleColour = Input.getString("Cor: ", sc);
					Circle newCircle = new Circle(radius, circleColour);
					circles.add(newCircle);
					System.out.println("Círculo: " + newCircle);
					break;

				case 2:
					double width = Input.getDouble("Comprimento: ", sc);
					double height = Input.getDouble("Altura: ", sc);
					String rectColour = Input.getString("Cor: ", sc);
					Rectangle newRectangle = new Rectangle(width, height, rectColour);
					rectangles.add(newRectangle);
					System.out.println("Retângulo criado: " + newRectangle);
					break;

				case 3:
					double side1 = Input.getDouble("Lado 1: ", sc);
					double side2 = Input.getDouble("Lado 2: ", sc);
					double side3 = Input.getDouble("Lado 3: ", sc);
					String triangleColour = Input.getString("Cor: ", sc);
					Triangle newTriangle = new Triangle(side1, side2, side3, triangleColour);
					triangles.add(newTriangle);
					System.out.println("Triângulo: " + newTriangle);
					break;

				case 4:
					if (circles.size() <= 0) {
						System.out.println("No circles created yet.");
						break;
					}

					System.out.println("Círculo: " + circles.get(circles.size() - 1));
					break;

				case 5:
					if (rectangles.size() <= 0) {
						System.out.println("No rectangles created yet.");
						break;
					}

					System.out.println("Retângulo: " + rectangles.get(rectangles.size() - 1));
					break;

				case 6:
					if (triangles.size() <= 0) {
						System.out.println("No triangles created yet.");
						break;
					}

					System.out.println("Triângulo: " + triangles.get(triangles.size() - 1));
					break;

				case 7:
					if (circles.size() <= 0) {
						System.out.println("No circles created yet.");
						break;
					}

					double radius2 = Input.getDouble("Raio: ", sc);
					circles.get(circles.size() - 1).setRadius(radius2);
					System.out.println("Círculo: " + circles.get(circles.size() - 1));
					break;

				case 8:
					if (rectangles.size() <= 0) {
						System.out.println("No rectangles created yet.");
						break;
					}

					double width2 = Input.getDouble("Comprimento: ", sc);
					double height2 = Input.getDouble("Altura: ", sc);
					rectangles.get(rectangles.size() - 1).setWidth(width2);
					rectangles.get(rectangles.size() - 1).setHeight(height2);
					System.out.println("Retângulo: " + rectangles.get(rectangles.size() - 1));
					break;

				case 9:
					if (triangles.size() <= 0) {
						System.out.println("No triangles created yet.");
						break;
					}

					double side11 = Input.getDouble("Lado 1: ", sc);
					double side22 = Input.getDouble("Lado 2: ", sc);
					double side33 = Input.getDouble("Lado 3: ", sc);
					triangles.get(triangles.size() - 1).setSides(side11, side22, side33);
					System.out.println("Triângulo: " + triangles.get(triangles.size() - 1));
					break;

				case 10:
					if (circles.size() <= 0) {
						System.out.println("No circles created yet.");
						break;
					}

					System.out.println("Área do Círculo: " + circles.get(circles.size() - 1).getArea());
					break;

				case 11:
					if (rectangles.size() <= 0) {
						System.out.println("No rectangles created yet.");
						break;
					}

					System.out.println("Área do Retângulo: " + rectangles.get(rectangles.size() - 1).getArea());
					break;

				case 12:
					if (triangles.size() <= 0) {
						System.out.println("No triangles created yet.");
						break;
					}

					System.out.println("Área do Triângulo: " + triangles.get(triangles.size() - 1).getArea());
					break;

				case 13:
					if (circles.size() <= 0) {
						System.out.println("No circles created yet.");
						break;
					}

					System.out.println("Perímetro do Círculo: " + circles.get(circles.size() - 1).getPerimeter());
					break;

				case 14:
					if (rectangles.size() <= 0) {
						System.out.println("No rectangles created yet.");
						break;
					}

					System.out.println("Perímetro do Retângulo: " + rectangles.get(rectangles.size() - 1).getPerimeter());
					break;

				case 15:
					if (triangles.size() <= 0) {
						System.out.println("No triangles created yet.");
						break;
					}
					
					System.out.println("Perímetro do Triângulo: " + triangles.get(triangles.size() - 1).getPerimeter());
					break;

				case 16:
					if (circles.size() <= 0) {
						System.out.println("No circles created yet.");
						break;
					}

					for (int i = 0; i < circles.size() - 1; i++) {
						for (int j = i + 1; j < circles.size(); j++) {
							if (circles.get(i).equals(circles.get(j))) {
								System.out.println("círculos " + circles.get(i) + " e " + circles.get(j) + " = iguais.");
							} else {
								System.out.println("círculos " + circles.get(i) + " e " + circles.get(j) + " = diferentes.");
							}
						}
					}

					break;

				case 17:
					if (rectangles.size() <= 0) {
						System.out.println("No rectangles created yet.");
						break;
					}

					for (int i = 0; i < rectangles.size() - 1; i++) {
						for (int j = i + 1; j < rectangles.size(); j++) {
							if (rectangles.get(i).equals(rectangles.get(j))) {
								System.out.println("retângulos " + rectangles.get(i) + " e " + rectangles.get(j) + " = iguais.");
							} else {
								System.out.println("retângulos " + rectangles.get(i) + " e " + rectangles.get(j) + " = diferentes.");
							}
						}
					}

					break;

				case 18:
					if (triangles.size() <= 0) {
						System.out.println("No triangles created yet.");
						break;
					}

					for (int i = 0; i < triangles.size() - 1; i++) {
						for (int j = i + 1; j < triangles.size(); j++) {
							if (triangles.get(i).equals(triangles.get(j))) {
								System.out.println("triângulos " + triangles.get(i) + " e " + triangles.get(j) + " = iguais.");
							} else {
								System.out.println("triângulos " + triangles.get(i) + " e " + triangles.get(j) + " = diferentes.");
							}
						}
					}

					break;

				case 0:
					break;
			}

			System.out.println();
		} while (input != 0);
	}
}