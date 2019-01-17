package uppgift_2_02;

public class Person {
    private String namn;
    private String sysselsättning;
    private int ålder;
    private String kön;
    private int längd;

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
}
