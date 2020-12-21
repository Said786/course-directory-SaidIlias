import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();
        System.out.print("B = ");
        int b =scan.nextInt();



        long gcd = gcdEuclidIterative(a,b);

        System.out.printf("GCD(%d, %d) = %d%n", a, b, gcd);


    }
    public static long gcdEuclidIterative (long a, long  b){

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return  a;
    }
    public static long gcdEuclidRecrusive (long a, long b){
        if (b == 0){
            return a;
        }else {
            return gcdEuclidRecrusive(b, a % b);
        }
    }
    public static long gcdEuclidRecursive2 (long a, long b){
        return b == 0 ? a : gcdEuclidRecursive2(b,a %b);
    }

}
