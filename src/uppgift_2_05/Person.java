package uppgift_2_05;

public class Person {
    private String namn;
    private String sysselsättning;
    private int ålder;
    private String kön;
    private int längd;
    Hus husen;

    //Constructor
    public Person(String namn, String sysselsättning, int ålder, String kön, int längd, Hus hus) {
        this.namn = namn;
        this.sysselsättning = sysselsättning;
        this.ålder = ålder;
        this.kön = kön;
        this.längd = längd;
        this.husen = hus;
    }

    //Getter och Setter
    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getSysselsättning() {
        return sysselsättning;
    }

    public void setSysselsättning(String sysselsättning) {
        this.sysselsättning = sysselsättning;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }

    public String getKön() {
        return kön;
    }

    public void setKön(String kön) {
        this.kön = kön;
    }

    public int getLängd() {
        return längd;
    }

    public void setLängd(int längd) {
        this.längd = längd;
    }

    @Override
    public String toString() {
        return "Namn: "+ namn + " Sysselsättning: " + sysselsättning + " Ålder: " + ålder + " Kön: " +
                kön + " Längd: " + längd + "\n" + husen + "\n";
    }
}
