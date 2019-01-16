import java.util.InputMismatchException;
import java.util.Scanner;

public class Uppgift2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            int tal = getInt();
            if (tal >= 0 && tal < 10) {
                System.out.println("Grattis, i intervallet");
                return;
            }else{
                System.out.println("Ej inom intervallet försök igen.");
            }
        }
    }

    public static int getInt() {
        int tal = 0;
        try {
            tal = scanner.nextInt();
            //System.out.println(tal);
        } catch (InputMismatchException e) {
            System.out.println("Felaktig inmatning!");
        }
        return tal;
    }
}