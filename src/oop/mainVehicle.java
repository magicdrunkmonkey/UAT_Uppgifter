package oop;

public class mainVehicle {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();

        minivan.setFuelcap(50);
        minivan.setMph(30);
        minivan.setPassangers(5);
        minivan.setWorking(true);

        float range = minivan.getRange();
        System.out.println(range);

        //Call constructor with arguments
        Vehicle sportscar = new Vehicle(2, 30, 1, false);
        sportscar.setPassangers(2);

        System.out.println(sportscar.getRange());

    }
}
