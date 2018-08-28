import java.lang.*;
public class InsertionSort {
    public static void main(String args[]) {
        int arr[] = {5, 3, 6, 7, 2, 1, 8};
        for (int j = 1; j < arr.length ; j++) {
            int i=j-1;
            int key = arr[j];

            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }
        for (int k = 0; k < arr.length - 1; k++) {
            System.out.println(arr[k]);
        }
    }
}

