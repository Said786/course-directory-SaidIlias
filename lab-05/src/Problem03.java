import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of tests? ");
        int n_tests = scan.nextInt();

        int n1, n2, count = 0, user_ans, answer;

        for (int i = 0; i < n_tests; i++){

            n1 = (int) (Math.random() * 10);
            n2 = (int) (Math.random() * 10);

            System.out.print(n1 + " + " + n2 + " = ");
            user_ans = scan.nextInt();

            answer = n1 + n2;

            if (answer == user_ans){
                count++;
            }


        }
        System.out.printf("Number of correct answers: %d%n", count);
        System.out.printf("Number of incorrect answers: %d", n_tests - count);
    }
}
