public class Uppgift4 {

    public static void main(String[] args) {
        int tal1;
        int tal2;

        System.out.print("Skriv första talet: ");
        tal1 = Metoder.getInt();

        System.out.print("Skriv andra talet: ");
        tal2 = Metoder.getInt();

        double medeltal = Metoder.meanValue(tal1, tal2);

        System.out.println("Medelvärdet av "+tal1+" och "+tal2+" är "+medeltal+".");
    }
}
