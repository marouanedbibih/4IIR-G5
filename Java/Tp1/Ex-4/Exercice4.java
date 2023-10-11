import java.util.Scanner;
public class Exercice4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier (0 à 10) : ");

        int n = scanner.nextInt();
        scanner.close();

        if (n >= 0 && n <= 10) {
            String[] nombresEnLettres = {
                    "Zéro", "Un", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf", "Dix"
            };
            System.out.println("En lettres : " + nombresEnLettres[n]);
        } else {
            System.out.println("Nombre trop grand");
        }
    }
}