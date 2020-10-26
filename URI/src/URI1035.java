import java.util.Scanner;

public class URI1035 {
    public static void main(String[] args) {
        int A, B, C, D;
        Scanner scan = new Scanner(System.in);
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        int g = C + D;
        int t = A + B;


        if (B > C && D > A && g > t && C > 0 && D > 0 &&  (A % 2 == 0) ){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }


    }
}
