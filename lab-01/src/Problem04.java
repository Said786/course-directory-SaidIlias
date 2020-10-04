import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first_number = scan.nextInt();
        System.out.print("Enter the second number: ");
        int second_number = scan.nextInt();

        int sum = first_number + second_number;
        int difference = first_number - second_number;
        int multiplication = first_number * second_number;
        int division = first_number / second_number;
        int percentage = first_number % second_number;

        System.out.println(first_number + " + " + second_number + " = " + sum );
        System.out.println(first_number + " + " + second_number + " = " + difference );
        System.out.println(first_number + " + " + second_number + " = " + multiplication );
        System.out.println(first_number + " + " + second_number + " = " + division );
        System.out.println(first_number + " + " + second_number + " = " + percentage );


    }
}
