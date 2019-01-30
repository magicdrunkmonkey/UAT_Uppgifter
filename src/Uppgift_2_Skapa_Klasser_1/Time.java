package Uppgift_2_Skapa_Klasser_1;

public class Time {
    private int h;
    private int m;
    private int s;

    //Constructors
    public Time(int h) {
        this.h = h;
        if(h>12 || h<0){
            throw new IllegalArgumentException("Time: Bad Value: " + h);
        }
    }

    public Time(int h, int m) {
        this(h);
        this.m = m;
        if(m>=60 || m<0){
            throw new IllegalArgumentException("Time: Bad Value: " + h + ":" + m);
        }
    }

    public Time(int h, int m, int s) {
        this(h,m);
        this.s = s;
        if(s>=60 || s<0){
            throw new IllegalArgumentException("Time: Bad Value: " + h + ":" + m + ":" + s);
        }

    }

    //Getters ans Setters
    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
}