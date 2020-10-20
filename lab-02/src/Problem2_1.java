import java.util.Scanner;

public class Problem2_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");

        double tempInDegC = scan.nextDouble();

        double tempInDegFahr = (tempInDegC * 9 / 5) + 32 ;


        System.out.printf("%.0f Celsius is %.1f Fahrenheit", tempInDegC, tempInDegFahr);
    }
}

