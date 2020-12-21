import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = scan.nextInt(), maxIndex = 1;

        for (int i = 2 ; i <= 10; i++) {
            int number = scan.nextInt();
            if (number >= max) {
                max = number;
                maxIndex = i;
            }
        }

        System.out.printf("%d%n %d%n", max, maxIndex);
    }

}
