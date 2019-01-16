
package oop;

public class Main {

    public static void main(String[] args) {

        //Skapa objekt
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect.setHeight(10);
        rect2.setHeight(20);

        int i = rect.getHeight();

        System.out.println(i);
        System.out.println(rect2.getHeight());

        System.out.println( rect.getWidth() ); // Skriver ut "noll" om ej definierad men initierad.


    }
}
