package oop;

public class Course {

    private int pupils;
    private int hours;
    private String kurs;
    private Teacher teacher;

    //Constructor
    public Course(int pupils, int hours, String kurs, Teacher teacher){
        this.pupils = pupils;
        this. hours = hours;
        this. kurs = kurs;
        this.teacher = teacher;
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
}
