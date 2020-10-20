import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in degrees Fahrenheit: ");

        double tempInDegFahr = scan.nextDouble();

        double tempInDegC = (tempInDegFahr - 32) * 5 / 9 ;


        System.out.printf("The temperature in degrees Celsius is %.2f%n ", tempInDegC);
    }
}
