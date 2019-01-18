package uppgift_2_06;

public class Bil {
    private String model;
    private int value;
    private int kmUsed;
    private double nextValue;



    public double valueLoss(int value) {
        nextValue = value - (value * 0.20);
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
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
                ", Value loss 20%: " + valueLoss(value);
    }
}
