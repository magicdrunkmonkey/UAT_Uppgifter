package uppgift_2_01;

public class Main {

    public static void main(String[] args) {
        Hus bostad = new Hus();

        bostad.setYta(60);
        bostad.setVärde(5000);
        bostad.setAdress("Skolspåret 29");
        bostad.setByggnadsår(1976);
        bostad.setVåningar(6);

        System.out.println("Jag bor på adressen " + bostad.getAdress() + ".");
        System.out.println("Jag har månadshyra på " + bostad.getVärde() +".");
        System.out.println("Bostadsytan är på " + bostad.getYta() + " kvm.");
        System.out.println("Huset jag bor i byggdes " + bostad.getByggnadsår());
        System.out.println("Huset har " + bostad.getVåningar() + " våningar.");
    }
}
