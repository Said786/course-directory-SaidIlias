import java.util.Scanner;

public class Problem3_8 {
    public static void main(String[] args) {
        int small = 0, medium = 0, large = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int int_1 = scan.nextInt();
        int int_2 = scan.nextInt();
        int int_3 = scan.nextInt();

        if (int_1 < int_2 && int_1 < int_3){
            small = int_1;
            if (int_2 < int_3){
                medium = int_2 ;
                large = int_3;
            } else if (int_3 < int_2){
                medium = int_3;
                large = int_2 ;
            }
        }else if (int_2 < int_1 && int_2 < int_3){
            small = int_2;
            if (int_1 < int_3){
                medium = int_1;
                large = int_3;
            }else if (int_3 < int_1){
                medium = int_3;
                large = int_1;
            }
        }else if (int_3 < int_1 && int_3 < int_2){
            small = int_3;
            if (int_1 < int_2){
                medium = int_1;
                large = int_2;
            }else if (int_2 < int_1){
                medium = int_2;
                large = int_1;
            }
        }
        System.out.println("The integers in non-decreasing order will be: " + small + " " + medium + " " + large);

    }
}
