import java.util.Scanner;

/**
 * Exercice3
 */
public class Exercice3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in your array:");
        int nbElements = sc.nextInt();
        int[] tabArray = new int[nbElements];
        for (int i = 0; i < nbElements; i++) {
            System.out.println("Entre element: " + (i + 1));
            tabArray[i] = sc.nextInt();
        }
        int[] invArray = new int[nbElements];
        for (int i = 0; i < nbElements; i++) {
            invArray[i] = tabArray[nbElements - 1 - i];
        }
        System.out.println("Your Array: ");
        for (int i = 0; i < tabArray.length; i++) {
            System.out.println("Number-" + (i + 1) + " : " + tabArray[i]);
        }
        System.out.println("Your inverse Array: ");
        for (int i = 0; i < invArray.length; i++) {
            System.out.println("Number-" + (i + 1) + ":" + invArray[i]);
        }
        sc.close();
    }
}