package oop;

public class Adress {

    private String gata;
    private String postnummer;
    private String ort;

    //Constructor
    public Adress(String gata, String postnummer, String ort) {
        this.gata = gata;
        this.postnummer = postnummer;
        this.ort = ort;
    }

    public String getGata() {
        return gata;
    }

    public void setGata(String gata) {
        this.gata = gata;
    }

    public String getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(String postnummer) {
        this.postnummer = postnummer;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        String s = gata + "\n"+ postnummer +" "+ort;
        return s;
    }
}
