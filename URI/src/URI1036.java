import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();


        double discriminant = Math.pow(B,2.0) - 4 * (A * C );
        double root1 ;
        double root2;

        if  ( discriminant >= 1){
            root1 = (-B + (Math.pow(Math.pow(B,2.0) - 4 * (A * C ),0.5)))/ 2 * A;
            root2 = (-B - (Math.pow(Math.pow(B,2.0) - 4 * (A * C ),0.5)))/ 2 * A;

            System.out.printf("R1 = %f%n R2 = %f", root1, root2);

        } else if (discriminant == 0 ){
            root1 = (-B - (Math.pow(Math.pow(B,2.0) - 4 * (A * C ),0.5)))/ 2 * A;

            System.out.printf("R1 = %f%n ", root1);
        } else
            System.out.println("Impossivel calcular");

    }
}
