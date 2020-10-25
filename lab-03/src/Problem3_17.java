import java.util.Scanner;

public class Problem3_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" scissor (0), rock (1), paper (2): ");
        int Player = scan.nextInt();

        int computer = (int) (Math.random() * 3);

        if ( Player == 0 && computer == 0){
            System.out.println("The computer is scissors. You are scissors too. It is a draw ");
        }else if (Player == 0 && computer == 1){
            System.out.println("Computer is rock.You are Scissors. Computer wins ");
        }else if(Player == 0 && computer == 2){
            System.out.println("Computer is paper. You are Scissors. You won ");
        }else if (Player == 1 && computer == 0){
            System.out.println("Computer is Scissors. You are rock. You won ");
        }else if (Player == 1 && computer == 2){
            System.out.println("Computer is paper. You are rock. Computer wins ");
        }else if (Player == 1 && computer == 1){
            System.out.println("The computer is rock. You are rock too. It is a draw ");
        }else if ( Player == 2 && computer == 2) {
            System.out.println("The computer is paper. You are paper too. It is a draw ");
        }else if ( Player == 2 && computer == 0) {
            System.out.println("The computer is paper. You are scissors. You won ");
        }else if ( Player == 2 && computer == 1) {
            System.out.println("The computer is rock. You are scissors. Computer wins ");
        }



    }
}

