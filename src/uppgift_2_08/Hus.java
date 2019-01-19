package uppgift_2_08;

public class Hus {

    private int yta;
    private int våningar;
    private double value;
    private int byggnadsår;
    private String adress;
    private double husValue;

    public double valueLoss(double value) {
        husValue = value - (value * 0.05);
        setValue(husValue);
        husValue = Math.round(husValue*100.0)/100.0;
        return husValue;
    }

    //Constructor
    public Hus(int yta, int våningar, int värde, int byggnadsår, String adress) {
        this.yta = yta;
        this.våningar = våningar;
        this.value = värde;
        this.byggnadsår = byggnadsår;
        this.adress = adress;
    }

    //Getter and Setter
    public int getYta() {
        return yta;
    }

    public void setYta(int yta) {
        this.yta = yta;
    }

    public int getVåningar() {
        return våningar;
    }

    public void setVåningar(int våningar) {
        this.våningar = våningar;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getByggnadsår() {
        return byggnadsår;
    }

    public void setByggnadsår(int byggnadsår) {
        this.byggnadsår = byggnadsår;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "House: " +
                yta + " m², " +
                våningar + " floor(s), " +
                value + " kr, " + byggnadsår + ", " +
                adress + ", Yearly 5% valueloss: " + valueLoss(value);

    }
}