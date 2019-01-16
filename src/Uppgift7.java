public class Uppgift7 {

    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;

        boolean resultat = allAreFalse(a, b, c, d);
        System.out.println(resultat);
    }

    private static boolean allAreFalse(boolean a, boolean b, boolean c, boolean d) {
        if(!a && !b && !c && !d){
            return true;
        }else{
            return false;
        }
    }
}
