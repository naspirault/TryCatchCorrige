import java.util.Scanner;

public class Main {

    static int [] tableau = { 17, 12, 15, 38, 29, 157, 89, -22, 0, 5 };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Entrez l'indice de l'entier à diviser: ");

        x = sc.nextInt();

        System.out.println("Entrez le diviseur");

        y = sc.nextInt();

        System.out.println("Le résultat de la division est : " + Division(x,y));

    }



    static int Division(int indice, int diviseur)

    {

        return tableau[indice] / diviseur;

    }
}