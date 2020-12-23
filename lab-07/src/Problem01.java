import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of throws: ");
        int throwCount = scan.nextInt();

  int [] outcomeCounts = new int[11];

        for (int i = 0; i < throwCount; i++) {

            int die1 = random(1,6);
            int die2 = random(1,6);
            int sum = die1 + die2;


                outcomeCounts[sum - 2]++;

        }

        for (int i = 0; i < outcomeCounts.length; i++){
            System.out.printf("%d: %d%n", i +2, outcomeCounts[i]);

        }


    }
    public static int random(int min, int max){
        return (int) (min + Math.random() * (max - min + 1));
    }
}
