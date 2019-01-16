package oop;

public class Matematik {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("George", "123456");

        Course matematik = new Course(10, 92, "Matematik",  teacher);

        System.out.println("Pupils: " + matematik.getPupils() );
        System.out.println("Hours: " + matematik.getHours() );
        System.out.println("Kurs: " + matematik.getKurs() );

        //Course.getTeacher().getName();

        System.out.println(matematik.getTeacher().getName().charAt(0));

    }
}
