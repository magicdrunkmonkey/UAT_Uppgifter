package uppgift_2_05;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();  // Skapar en Arraylist med namnet persons
        ArrayList<Hus> husen = new ArrayList<>();       // Skapar en Arraylist med namnet husen

        husen.add(new Hus(130,3,2500, 1983, "Skolspåret 25"));
        husen.add(new Hus(60, 6, 5000, 1984, "Skolspåret 29"));

        persons.add(new Person("George Sydby", "Student",44, "Man", 169, husen.get(0)));
        persons.add(new Person("Kerim","Pensionär", 68,"Man", 164, husen.get(1)));
        persons.add(new Person("Janette","Förskolelärare", 63,"Kvinna", 164, husen.get(1)));
        persons.add(new Person("Marie","Arbetslös",33,"Kvinna", 165, husen.get(1)));

        for(int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}
