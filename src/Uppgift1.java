import java.util.Scanner;

public class Uppgift1 {

    //static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean answer = isEven(100);
        System.out.println(answer);

        answer = isEven(97);
        System.out.println(answer);
    }
    public static boolean isEven(int talet){
        if(talet%2==0){
            //Jämnt tal
            return true;
        }else{
            //Udda tal
            return false;
        }
    }
/*
    public static int getInt(){
        int tal = 0;

        try {
            tal = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Felatkig inmatning!");
        }

        /*
        int number = 7; //Datatype int --> from -231 to 231-1
        if (number%2==0){ //Check if even number
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }*/

}