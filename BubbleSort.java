
import java.lang.*;

public class BubbleSort {
    public static void main(String args[]) {
        System.out.println("Hello, World!");
        int arr[] = {5, 3, 6, 7, 2, 1, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length - 1; k++) {
            System.out.println(arr[k]);
        }
    }
}

