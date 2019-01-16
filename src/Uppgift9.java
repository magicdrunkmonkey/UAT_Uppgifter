import java.util.*;

public class Uppgift9 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();                 //Creating arrayList
        String compareWord = "";

        System.out.print("Mata in en data-sträng: ");
        String firstWord = Metoder.getString();

        while(firstWord.length() > compareWord.length()){
            list.add(firstWord);                                        //Adding object in arrayList
            compareWord = firstWord;
            System.out.print("Mata in en data-sträng längre än den förra: ");
            firstWord = Metoder.getString();
        }

        Iterator itr=list.iterator();                                   //Traversing list through Iterator
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
