import java.util.Scanner;

public class URI1041 {
    public static void main(String[] args) {
        float x, y;
        Scanner input = new Scanner(System.in);
        x= input.nextFloat();
        y = input.nextFloat();

        if (x == 0 && y == 0){
            System.out.println("Origem\n");
        }else if (x == 0){
            System.out.print("Eixo Y");
        }else if (y == 0){
            System.out.print("Eixo X");
        }
        else if (x > 0 && y > 0){
            System.out.print("Q1");
        }else if (x > 0 && y < 0){
            System.out.print("Q4");
        }else if(x < 0 && y > 0){
            System.out.print("Q2");
        }else{
            System.out.print("Q3");
        }

    }
}
