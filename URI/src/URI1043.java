import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {

        float A, B, C, Perimetro, Area;
        Scanner sc = new Scanner(System.in);

        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        if ((A < (float)(B + C)) && (B < (float)(A+C)) && (C < (float)(A+B))){
            Perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", Perimetro);
        }else {
            Area = ((A + B) * C ) / 2;
            System.out.printf("Area = %.1f%n", Area);
        }


    }
}
