/**
 * Exercice6
 */
import java.util.Scanner;
public class Exercice6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notes = new double[3];
        int i;
        for(i = 0 ; i < 3 ; i++){
            do {
                System.out.println("Enter note " + (i + 1) + ": ");
                notes[i] = scanner.nextDouble();
                if (notes[i] < 0 || notes[i] > 20) {
                    System.out.println("entrer note entre 0 et 20");
                }
            } while (notes[i] < 0 || notes[i] > 20);
        }      

        double sum = 0.0;
        for(i = 0 ; i < 3 ; i++){
            sum += notes[i];
        }

        double moy = sum / 3;

        System.out.println("La somme des notes est : " + sum);
        System.out.println("La Moyenne des notes est : " + moy);


        scanner.close();
    }
}