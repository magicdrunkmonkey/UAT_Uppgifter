public class Uppgift6 {

    public static void main(String[] args) {
        /*
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        */

        boolean resultat = anylsTrue(true, true, true, true);
        System.out.println(resultat);
    }

    private static boolean anylsTrue(boolean a, boolean b, boolean c, boolean d) {
        if(a || b || c || d){
            return true;
        }else{
            return false;
        }
    }
}