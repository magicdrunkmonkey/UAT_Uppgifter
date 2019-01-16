public class Uppgift11 {



    public static void main(String[] args)
    {
        Uppgift11 acces = new Uppgift11();

        //Skapa en array med osorterade siffror
        int[] arrayToSort = { 124, 45, 86, 0, 3241, -4, 0, 9, 28};

        //Kalla på metoden arrayToSort
        acces.SortArray(arrayToSort);

        System.out.println("sorted array");

        //Skriv ut innehållet i array från första till sista position
        for (int i1 : arrayToSort) System.out.print(i1 + " ");
    }


    private int FindGap(int gap)
    {
        gap = (gap * 10) / 13;
        if (gap < 1)
            return 1;
        return gap;
    }
    private void SortArray(int[] arrayToSort)
    {
        //Variabel initiering
        int gap =arrayToSort.length;
        boolean swapped = true;

        while (gap != 1 || swapped) {
            gap = FindGap(gap);
            swapped = false;
            for (int i = 0; i < arrayToSort.length - gap; i++) {
                if (arrayToSort[i] > arrayToSort[i + gap]) {
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + gap];
                    arrayToSort[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }
}
