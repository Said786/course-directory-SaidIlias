import java.util.Scanner;

public class Problem2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double weightInPounds = scan.nextDouble();

        double weightInKilograms = weightInPounds * 0.454;

        System.out.printf("%.1f pounds is %.3f kilograms", weightInPounds, weightInKilograms);


    }
}
