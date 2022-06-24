package aula02;
import java.util.Scanner;
import java.lang.Math;

public class Ex7 {
    public static void main(String[] args) {

        double[] p1 = new double[2];
        double[] p2 = new double[2];
        double[] v  = new double[2];
        double distance = 0;
        Scanner value_input = new Scanner(System.in);

        // value input
        System.out.print("Coordenadas (x y) do ponto P1: ");
        p1[0] = value_input.nextDouble();
        p1[1] = value_input.nextDouble();
        System.out.print("Coordenadas (x y) do ponto P2: ");
        p2[0] = value_input.nextDouble();
        p2[1] = value_input.nextDouble();
        value_input.close();

        // Distance
        v[0] = p1[0]-p2[0];
        v[1] = p1[1]-p2[1];
        distance= Math.sqrt(Math.pow(v[0],2)+Math.pow(v[1],2));

        System.out.println(String.format("A distância entre o Ponto P1 e o Ponto P2 é: %.2f",distance));
    }
}