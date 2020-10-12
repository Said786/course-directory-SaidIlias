import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {

        int sum = 0, digit;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a four-digit integer: ");

        digit = scan.nextInt();

        do {
            sum += digit % 10;
            digit /= 10;
        } while (digit > 0);

        System.out.printf("The sum of all digits is %d", sum);



    }

}
