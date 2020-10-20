import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length in inches: ");

        double Inches = scan.nextDouble();

        double Centimeter = Inches * 2.54;

        System.out.printf("%.2f in = %.2f cm.", Inches, Centimeter);

    
    }
}
