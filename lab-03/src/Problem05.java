import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of points? ");
        int points = scan.nextInt();

        if (points < 0 || points > 100){
            System.out.printf("%d is not in the permitted range.", points);
        }else if (points <= 100 && points >= 90){
            System.out.println("Grade: A");
        }else if (points < 90 && points >= 80) {
            System.out.println("Grade: B");
        }else if (points < 80 && points >= 70 ) {
            System.out.println("Grade: C");
        }else if (points < 70 && points >= 60) {
            System.out.println("Grade: D");
        }else
        {
            System.out.println("Grade: F");
        }
    }
}
