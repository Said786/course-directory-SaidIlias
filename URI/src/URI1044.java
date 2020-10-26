import java.util.Scanner;

public class URI1044 {
    public static void main(String[] args) {
        int A, B;
        Scanner scan = new Scanner(System.in);

        A = scan.nextInt();
        B = scan.nextInt();
        if ( B % A == 0 || A % B == 0){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }



    }
}
