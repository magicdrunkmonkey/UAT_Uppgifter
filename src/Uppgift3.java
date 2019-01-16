import java.util.InputMismatchException;
import java.util.Scanner;

public class Uppgift3 {

    //static Scanner scanner = new scanner(System.in);

    public static void main(String[] args){
        String inputText = "";
        String oldInputText = "";

        while(true){
            inputText = Metoder.getString(); //Hämta metoden från Metoder


            if( inputText.equals(oldInputText)){
                return;
            }
            oldInputText = inputText;
        }
    }

    /*
    public static void main(String[] args) {
        String rad1 = "A";
        String rad2 = "B";

        System.out.println("Skriv en rad: ");
        String rad1 = scanner.nextLine();

        if(rad1.equals(rad2)){
            return;
        }
        rad1 = rad2;
    }
    /*
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
    */
}
