import java.lang.*;

public class SelectionSort {
    public static void main(String args[]) {

        int arr[] = {5, 3, 6, 7, 2, 1, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int k = 0; k < arr.length - 1; k++) {
            System.out.println(arr[k]);
        }
    }
}
