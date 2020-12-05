import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int grade;

        do {
             grade = scan.nextInt();
            sum += grade;
            count++;
        } while (grade > 0 )
        ;

        count--;

        if (count != 0 ){
            double mean = (double) sum / count;
            System.out.printf("The arithmetic mean is %.1f%n", mean);
        }
        else
        {
                System.out.println("Nothing to calculate");
        }

    }
}
