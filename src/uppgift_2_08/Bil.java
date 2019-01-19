package uppgift_2_08;

public class Bil {
    private String model;
    private double value;
    private int kmUsed;
    private double nextValue;



    public double valueLoss(double value) {
        nextValue = value - (value * 0.20);
        setValue(nextValue);
        nextValue = Math.round(nextValue*100.0)/100.0;
        return nextValue;
    }


    //Constructor
    public Bil(String model, int value, int kmUsed) {
        this.model = model;
        this.value = value;
        this.kmUsed = kmUsed;
    }

    //Setter and Getter
    public double getNextValue() {
        return nextValue;
    }

    public void setNextValue(double nextValue) {
        this.nextValue = nextValue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getKmUsed() {
        return kmUsed;
    }

    public void setKmUsed(int kmUsed) {
        this.kmUsed = kmUsed;
    }

    @Override
    public String toString() {
        return "Car model: " + model+
                ", Car value: " + value +
                ", km-count: " + kmUsed +
                ", Yearly 20% valueloss: " + valueLoss(value);
    }
}
