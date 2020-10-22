import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Number of points? ");
        int point = scan.nextInt();

        if (point >= 40 ){
            System.out.println("You passed “Structured Programming”!!!\n" +
                    "You should take “Object-Oriented Programming” in the next semester ");
        }
        else {
            System.out.println("You failed “Structured Programming”!!!\n" +
                    "You can take it again in the fall semester of 2021.");
        }
    }
}
