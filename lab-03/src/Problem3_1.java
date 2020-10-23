import java.util.Scanner;

public class Problem3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double discriminant = Math.pow(b,2.0) - 4 * (a * c );
        double root1 ;
        double root2;

        if  ( discriminant >= 1){
            root1 = (-b + (Math.pow(Math.pow(b,2.0) - 4 * (a * c ),0.5)))/ 2 * a;
            root2 = (-b - (Math.pow(Math.pow(b,2.0) - 4 * (a * c ),0.5)))/ 2 * a;

            System.out.printf("The equation has two roots %f and %f%n", root1, root2);

        } else if (discriminant == 0 ){
            root1 = (-b - (Math.pow(Math.pow(b,2.0) - 4 * (a * c ),0.5)))/ 2 * a;

            System.out.printf("The equation has one root %f%n", root1);
        } else
            System.out.println("The equation has no real roots");

    }
}
