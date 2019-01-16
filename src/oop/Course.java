package oop;

public class Course {

    private int pupils;
    private int hours;
    private String kurs;
    private Teacher teacher; // Från Teacher class
    private Adress adress;  // Från Adress class

    //Constructor
    public Course(int pupils, int hours, String kurs, Teacher teacher, Adress adress){
        this.pupils = pupils;
        this. hours = hours;
        this. kurs = kurs;
        this.teacher = teacher;
        this.adress = adress;
    }

    //GETTERS
    public int getPupils() {
        return pupils;
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
    public void setPupils(int pupils) {
        this.pupils = pupils;
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
        return kurs + "\n" + teacher + "\n" +adress;
    }
}
