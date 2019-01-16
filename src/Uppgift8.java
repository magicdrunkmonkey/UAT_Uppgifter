import java.util.Arrays;

public class Uppgift8 {

    public static void main(String[] args) {


        double sumArray = 0;
        double minArray[] = {1,2,3,4,5};

        sumArray = arrayAverage(minArray);
        System.out.println(sumArray/minArray.length);
    }

    private static double arrayAverage(double minArr[]) {
        double sumArr = 0;

        for(int i=0; i < minArr.length ; i++){

            sumArr += minArr[i];
        }
        return sumArr;

    }
}
