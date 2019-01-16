import java.util.InputMismatchException;
import java.util.Scanner;

public class Metoder {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    //HÄMTAR ETT TAL
    public static int getInt() {
        int tal = 0;
        try {
            tal = scanner.nextInt();
            //System.out.println(tal);
        }catch(InputMismatchException e){
            System.out.println("Felaktig inmatning!");
        }
        return tal;
    }

    //HÄMTAR EN STRÄNG
    public static String getString() {
        String ord = "0";
        try {
            ord = scanner.nextLine();
            //System.out.println(tal);
        }catch(InputMismatchException e){
            System.out.println("Felaktig inmatning!");
        }
        return ord;
    }
    //BERÄKNA MEDELTAL av två INT
    public static double meanValue(int tal1, int tal2) {
        //int tal1 = ;

        double medel = (tal1 + tal2)/2d;
        return medel;
    }

    //FRÅGA EFTER 3 LÖSENORD
    //private static void isAuthorised() {
   // }
}
