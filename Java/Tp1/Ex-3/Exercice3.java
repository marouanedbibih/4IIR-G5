import java.util.Scanner;
public class Exercice3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez Temperature en celisius :");
        float celisius = scanner.nextFloat();
        float fahrenteit = ((9 * celisius) / 5) + 32;
        System.out.println("La temperature en Fahrenteit est : " + fahrenteit + " °F");
        scanner.close();
    }
}