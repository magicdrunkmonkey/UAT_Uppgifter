package uppgift_2_02;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setKön("Man");
        person.setLängd(173);
        person.setNamn("Albert Einstein");
        person.setSysselsättning("Professor");
        person.setÅlder(73);

        System.out.println("Han är en " + person.getKön());
        System.out.println("Han är " + person.getLängd() + " cm lång.");
        System.out.println("Han heter " + person.getNamn());
        System.out.println("Han jobbar som " + person.getSysselsättning());
        System.out.println("Han är " + person.getÅlder() + " år gammal.");

    }
}
