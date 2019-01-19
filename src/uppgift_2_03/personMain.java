package uppgift_2_03;

public class personMain {

    public static void main(String[] args) {

        Person person = new Person("Albert Einstein", "Professor", 73, "Man", 168);

        /*
        person.setKön("Man");
        person.setLängd(173);
        person.setNamn("Albert Einstein");
        person.setSysselsättning("Professor");
        person.setAge(73);
        */

        System.out.println("Han är en " + person.getKön());
        System.out.println("Han är " + person.getLängd() + " cm lång.");
        System.out.println("Han heter " + person.getNamn());
        System.out.println("Han jobbar som " + person.getSysselsättning());
        System.out.println("Han är " + person.getÅlder() + " år gammal.");

    }
}
