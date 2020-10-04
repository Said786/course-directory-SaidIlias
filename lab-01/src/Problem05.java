import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first_number = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double second_number = scan.nextDouble();

        double sum = first_number + second_number;
        double difference = first_number - second_number;
        double multiplication = first_number * second_number;
        double division = first_number / second_number;
        double percentage = first_number % second_number;

        System.out.println(first_number + " + " + second_number + " = " + sum );
        System.out.println(first_number + " + " + second_number + " = " + difference );
        System.out.println(first_number + " + " + second_number + " = " + multiplication );
        System.out.println(first_number + " + " + second_number + " = " + division );
        System.out.println(first_number + " + " + second_number + " = " + percentage );
    }
}
