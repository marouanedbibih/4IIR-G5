/**
 * Exercice5
 */
import java.util.Scanner;
public class Exercice5 {

    public static void main(String [] args){
        System.out.println("Donnez un entier n :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 0){
            int f = 1;
            for (int i=1 ; i<=n ; i++){
                f = f * i;
            }
            System.out.println("Factorielle de " + n + " est " + f);
        }
        scanner.close();
    }
}