package oop;

public class Matematik {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("George", "123456");

        Course matematik = new Course(10, 92, "Matematik",  teacher);

        Adress plats = new Adress("Sandspåret 23", "424 31", "ANGERED");

        System.out.println("Pupils: " + matematik.getPupils() );
        System.out.println("Hours: " + matematik.getHours() );
        System.out.println("Kurs: " + matematik.getKurs() );
        System.out.println();

        System.out.println(matematik.getTeacher().getName().charAt(0));

        System.out.println(matematik.getTeacher().getName());
        System.out.println(plats.getGata());
        System.out.print(plats.getPostnummer()+" ");
        System.out.println(plats.getOrt());

    }
}
