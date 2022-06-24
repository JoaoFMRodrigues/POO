package aula03;
import java.lang.Math;

public class Ex8 {
    
    public static int checkGrade(double notaT, double notaP) {
        if (notaT < 7 || notaP < 7) {
            return 66;
        }
        return (int)Math.round(0.4 * notaT + 0.6 * notaP);
    }
    public static void main(String[] args) {

        double[] notaT = {11.3, 16.7, 7.8, 10.6, 16.9, 1.9, 17.6, 0.7, 8.7, 19.2, 17.5, 11.6, 7.2, 1.9, 19.3, 0};
        double[] notaP = {9.3, 5.1, 18.9, 15.9, 5.9, 12.7, 4.8, 12.1, 8.6, 1.4, 3.4, 11.4, 8.5, 1.4, 14.9, 12.1};

        System.out.println(" NotaT  NotaP  Pauta ");
        for (int i=0; i < notaT.length; i++) {
            System.out.println(String.format("%6.1f %6.1f %6d", notaT[i], notaP[i],checkGrade(notaT[i], notaP[i])));
        }
    }
}