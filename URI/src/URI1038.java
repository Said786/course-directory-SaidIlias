import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {

        int x,y;
        float price = 0;

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();

        if (x == 1){
            price = (float)  (4.00 * y) ;
        } else if (x == 2)
        {
            price = (float)(4.50 * y);
        } else if (x == 3)
        {
            price = (float)(5.00 * y);
        } else if (x == 4)
        {
            price = (float)(2.00 * y);
        } else if (x == 5)
        {
            price = (float)(1.50 * y);
        }
        System.out.printf("Total: R$ %.2f%n", price);

    }
}
