import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = scan.nextInt();

        int sum = 0;
        while (num != 0 ){
            sum += num % 10;
            num /= 10;
        }

        System.out.printf("The sum of all digits is %d%n",sum);
    }
}
