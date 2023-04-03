import java.io.StringBufferInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int [] tableau = { 17, 12, 15, 38, 29, 157, 89, -22, 0, 5 };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int x, y;
        String message = "";
        //System.out.println("Entrez l'indice de l'entier à diviser: ");
        while (true) {
            try {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Entrez l'indice de l'entier à diviser: ");
                 //String msgX = "Entrez l'indice de l'entier à diviser: ";

            int x = sc2.nextInt();
            //x = ReadInteger(msgX, 0, 9);

            System.out.println("Entrez le diviseur");
            int y = sc2.nextInt();

                System.out.println("Le résultat de la division est : " + Division(x, y));
                //break;
            } catch (ArithmeticException  | InputMismatchException | ArrayIndexOutOfBoundsException e ){
                System.out.println(e);
            } /*catch (InputMismatchException e ){
                System.err.println(e);
            } catch (ArrayIndexOutOfBoundsException e){
                System.err.println(e);
            }*/
        }
    }

    public static int ReadInteger(String message, int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (true){
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result >= min && result <=max){
                    return result;
                }
                else throw new IllegalStateException("La valeur doit être comprise entre "+min+" et "+max + " : " +result);
            }
            catch (NumberFormatException e) {
                System.err.println("Erreur survenue, la valeur entrée doit être un entier.");
                System.out.println(message);
            }
            catch(RuntimeException e ){
                System.err.println("Une erreur est survenue: " + e);
                System.out.println(message);
            }
        }

    }

    static int Division(int indice, int diviseur)
    {
        return tableau[indice] / diviseur;
    }
}
