
/**
 * Exercice4
 */
import java.util.Scanner;

public class Exercice4 {
    public static boolean isRegular(int[][] array) {
        if (array.length == 0) {
            return true;
        } else {
            int firstRowSize = array[0].length;
            for (int[] row : array) {
                if (row.length != firstRowSize) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] regularArray = {
                { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 }
        };
        int[][] inregularArray = {
                { 1, 2, 3 },
                { 1, 2},
                { 1, 2, 3 }
        };
        System.out.println("First array is regular..? : " + isRegular(regularArray));
        System.out.println("First array is regular..? : " + isRegular(inregularArray));
        sc.close();
    }
}