package uppgift_2_Getters_Setters_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>(); //Create arraylist named persons

        persons.add(new Person("George", "Sydby", 44));
        persons.add(new Person("Marie","Sydby", 32));
        persons.add(new Person("Janette","Sydby",62));

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }


    }
}
