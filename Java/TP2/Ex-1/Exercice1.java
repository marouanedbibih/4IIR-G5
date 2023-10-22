
/**
 * Exercice1
 */
import java.util.Scanner;

public class Exercice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me taille of Table : ");
        int tailleTable = sc.nextInt();
        double[] table = new double[tailleTable];
        double som = 0;
        for (int i = 0; i < tailleTable; i++) {
            System.out.println("Give me number " + (i+1));
            table[i] = sc.nextDouble();
            som +=table[i];
        }
        double moy = som / tailleTable;
        System.out.println("Somme of table numbers is: " + som);
        System.out.println("Moyenne of table numbers is: " + moy);

        sc.close();

    }
}