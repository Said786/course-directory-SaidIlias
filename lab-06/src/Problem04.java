import java.util.Scanner;

public class Problem04 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();
        System.out.print("B = ");
        int b =scan.nextInt();



        int gcd = gcdNaive(a,b);

        System.out.printf("GCD(%d, %d) = %d%n", a, b, gcd);


    }
    public static int gcdNaive(int a, int b) {
        int min = Math.min(a, b);

        int gcd = 1;
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;

            }
        }
        return gcd;
    }

}
