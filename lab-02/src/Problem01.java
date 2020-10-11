import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1st value: ");
        int a = scan.nextInt();

        System.out.print("Enter the 2nd value: ");
        int b = scan.nextInt();

        int c = 0;

        System.out.println("Before swapping: a = " + a + ";" + " b = " + b + ";");

        c = a;
        a = b;
        b = c;


        System.out.println("After swapping: a = " + a + ";" + " b = " + b+";" );

    }
}
