import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        int a, b, c, min, mid = 0, max = 0 ;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        min = Math.min(a, Math.min(b, c));

        if (min == a){
            mid = Math.min(b, c);
            max = Math.max(b,c);

        }
        if (min == b){
            mid = Math.min(a, c);
            max = Math.max(a,c);

        }
        if (min == c){
            mid = Math.min(a, b);
            max = Math.max(a,b);

        }
        System.out.print(min + "\n" + mid + "\n" + max+ "\n\n");
        System.out.print(a + "\n" + b + "\n" + c + "\n");

    }
}
