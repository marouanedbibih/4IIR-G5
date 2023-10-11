import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Exercise 2");
        // System.out.println("Enter the first number: ");
        // int n = scanner.nextInt();
        // System.out.println("Enter the second number: ");
        // int m = scanner.nextInt();

        // int rslt = m * n;
        // System.out.println("Result of multiply " + n + " and " + m + " is: " + rslt);

        // Cercle
        
        System.out.println("Donnez le rayon d un cercle");
        Float rayon = scanner.nextFloat();
        // Math.PI is double
        double perimetre = (2 * rayon )* Math.PI;
        double surface = (rayon*rayon)*Math.PI;
        System.out.println("Perimetre of your cercle is : " + perimetre);
        System.out.println("Surface of your cercle is : " + surface);
        scanner.close();

    }
}