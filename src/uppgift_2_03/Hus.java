package uppgift_2_03;

public class Hus {

    private int yta;
    private int våningar;
    private int värde;
    private int byggnadsår;
    private String adress;

    //Constructor
    public Hus(int yta, int våningar, int värde, int byggnadsår, String adress) {
        this.yta = yta;
        this.våningar = våningar;
        this.värde = värde;
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

    public int getVärde() {
        return värde;
    }

    public void setVärde(int värde) {
        this.värde = värde;
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
}
