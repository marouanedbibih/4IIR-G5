/**
 * Exercice2
 */
import java.util.Scanner;
public class Exercice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer taille of table ");
        int tailleTable = sc.nextInt();
        double[] table = new double[tailleTable];
        double max = 0.0;
        for(int i=0;i<tailleTable;i++){
            System.out.println("Enter element "+ (i+1));
            table[i] = sc.nextDouble();
            if(table[i] > max){
                max = table[i];
            }
        }    
        System.out.println("Maximum value is : " +max);
        sc.close();
    }
}