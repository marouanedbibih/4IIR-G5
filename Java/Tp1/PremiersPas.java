import java.util.Scanner;

public class PremiersPas {
    public static void main(String[] args) {
        // System.out.println("Hello,world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fait-il beau..?");
        String reponse = scanner.nextLine();
        String message = "";
        System.out.println(reponse);
        if (reponse.equals("Oui") || reponse.equals("oui") || reponse.equals("OUI")) {
            message = "Tant mieux";
        } else if (reponse.equals("Non") || reponse.equals("non") || reponse.equals("NON")) {
            message = "Esperont que ce soit mieux demain";
        } else {
            message = "je ne comprends pas !!";
        }
        System.out.println(message);
        scanner.close();
    }
}