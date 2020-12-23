import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {

        int [][] m = getArray();

        System.out.println("\nsum of all elements is " + sum(m));

    }
    public static int[][] getArray() {
        Scanner scan = new Scanner(System.in);

        int [][] m = new int [5] [4];
        System.out.println("Enter " + m.length + "rows and " + m[0].length + "columns: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = scan.nextInt();
            return m;
    }
    public static int sum (int[][] m){
        int total = 0;
        for (int row = 0; row < m.length; row++ ) {
            for (int column = 0; column < m[row].length; column++) {
                total += m[row][column];
            }
        }
        return total;
    }
}
