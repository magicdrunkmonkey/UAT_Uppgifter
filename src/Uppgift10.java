public class Uppgift10 {

    public static void main(String[] args) {

        int arrNumbers[] = {1,5,7,2,0,2,6,4,0};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arrNumbers.length; i++){
            System.out.print(arrNumbers[i] + " ");
        }
        System.out.println();
        //System.out.println();

        bubbleSort(arrNumbers);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arrNumbers.length; i++){
            System.out.print(arrNumbers[i] + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){         ///Check if neighbour-element to the left is higher in array
                    //swap elements, place highest neighbouring number to the right.
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
}
