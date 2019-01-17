package oop;

import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class Course {

    private int students;
    private int hours;
    private String kurs;
    private Teacher teacher; // Från Teacher class
    private Adress adress;  // Från Adress class
    private ArrayList<Student> studentsList;

    //Constructor
    public Course(int students, int hours, String kurs, Teacher teacher, Adress adress){
        this.students = students;
        this. hours = hours;
        this. kurs = kurs;
        this.teacher = teacher;
        this.adress = adress;
        studentsList = new ArrayList<>(); ///Behöver ej this. då det är ensamt variabel
    }

    public void addStudent(Student student){

        studentsList.add(student);

    }
    //GETTERS


    public int getStudents() {
        return students;
    }
    public int getHours() {
        return hours;
    }
    public String getKurs() {
        return kurs;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Adress getAdress() {
        return adress;
    }

    //SETTERS
    public void setStudents(int students) {
        this.students = students;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        String s = kurs + "\n" + teacher + "\n" +adress + "\n";

        StringBuilder stringBuilder = new StringBuilder();

        int size = studentsList.size();
        for(int i = 0 ; i<size ; i++){
            stringBuilder.append( studentsList.get(i) + "\n");
        }

        return s + stringBuilder.toString();
    }
}
