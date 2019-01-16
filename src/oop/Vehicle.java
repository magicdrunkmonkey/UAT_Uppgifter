package oop;

public class Vehicle {

    private int passangers;
    private float fuelcap;
    private float mph;
    private boolean working;

    //Default Constructor
    public Vehicle ( ) {
        passangers = 5;
        fuelcap = 50;
        mph = 2;
        working = true;
    }

    //Constructor with parameters
    public Vehicle( int passengers, float fuelcap, float mph, boolean working){
        this.passangers = passengers;
        this.fuelcap = fuelcap;
        this.mph = mph;
        this.working = working;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    //<editor-fold desc="Setters">
    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public void setMph(float mph) {
        this.mph = mph;
    }
    //</editor-fold>

    //<editor-fold desc="Getter">
    public int getPassangers() {
        return passangers;
    }

    public float getFuelcap() {
        return fuelcap;
    }

    public float getMph() {
        return mph;
    }

    public float getRange() {
        return fuelcap * mph;
    }
    //</editor-fold>



}
