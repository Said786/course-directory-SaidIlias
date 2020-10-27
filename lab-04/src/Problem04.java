import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Complexity level: ");
        int level = scan.nextInt();

        switch (level){
            case 4:
            case 5:
                System.out.print("You are a pro gamer");
                break;
            case 3:
            case 2:
                System.out.print("You are an You are an experienced gamer. ");
                break;
            case 1:
                System.out.print("You are a beginner");
                break;
            case 0:
                System.out.print("You are a total newbie");
                break;
        }
    }
}
