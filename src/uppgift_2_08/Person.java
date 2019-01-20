package uppgift_2_08;

public class Person {
    private String namn;
    private String sysselsättning;
    private int age;
    private String kön;
    private int längd;
    private int nextAge;
    Hus husen;
    Bil bilar;


    public int ageOlding(int age){
        nextAge = age + 1;
        setAge(nextAge);
        return nextAge;
    }

    //Constructor
    public Person(String namn, String sysselsättning, int ålder, String kön, int längd, Hus hus, Bil bil) {
        this.namn = namn;
        this.sysselsättning = sysselsättning;
        this.age = ålder;
        this.kön = kön;
        this.längd = längd;
        this.husen = hus;
        this.bilar = bil;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        return "Namn: "+ namn +
                " Sysselsättning: " + sysselsättning +
                " , Ålder: " + age +
                " , Kön: " + kön +
                " , Längd: " + längd +
                " , Ålder nästa år: " + ageOlding(age) +
                "\n" + husen +
                "\n" + bilar + "\n";
    }
}
