package uppgift_2_08;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();  // Skapar en Arraylist med namnet persons
        ArrayList<Hus> husen = new ArrayList<>();       // Skapar en Arraylist med namnet husen
        ArrayList<Bil> bilar = new ArrayList<>();       // Skapar en Arraylist med namnet bilar

        husen.add(new Hus(130, 3, 1000000, 1983, "Skolspåret 25"));
        husen.add(new Hus(60, 6, 2000000, 1984, "Skolspåret 29"));

        bilar.add(new Bil("Volvo", 230000, 16450));
        bilar.add(new Bil("Prius", 201600, 12000));

        persons.add(new Person("George Sydby", "Student", 44, "Man", 169, husen.get(0), bilar.get(1)));
        persons.add(new Person("Kerim", "Pensionär", 68, "Man", 164, husen.get(1), bilar.get(0)));
        persons.add(new Person("Janette", "Förskolelärare", 63, "Kvinna", 164, husen.get(1), bilar.get(0)));
        persons.add(new Person("Marie", "Arbetslös", 33, "Kvinna", 165, husen.get(1), bilar.get(0)));

        for (int t = 1; t <= 20; t++) {
                System.out.println("Year: " + t);
            for (int i = 0; i < persons.size(); i++) {
                System.out.println(persons.get(i));
            }


            Scanner s = new Scanner(System.in);
            System.out.println("Press <ENTER> to continue");
            s.nextLine();

        }
    }
}
