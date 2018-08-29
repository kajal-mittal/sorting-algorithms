# sorting-algorithms

Implementation of various sorting algorithms in java.

### Bubble Sort:-

Bubble Sort is the simplest sorting algorithm that works by swapping the adjacent elements if they are in wrong order.

##### Example:
```
First Pass:
 ( 5 3 6 7 2 1 8 ) –> ( 3 5 6 7 2 1 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 3.
 ( 3 5 6 7 2 1 8 ) –>  ( 3 5 6 7 2 1 8  ), Swap if( 5 > 6) false sme as for 6>7
 ( 3 5 6 7 2 1 8) –>  ( 3 5 6 2 7 1 8 ), Swap since 7 > 2
 ( 3 5 6 2 7 1 8 ) –> ( 3 5 6 2 7 1 8 ), Now, since these elements are already in order (1 > 8), algorithm does not swap them.
  

Second Pass:
( 3 5 6 2 7 1 8) –> (3 5 6 2 7 1 8 )
( 3 5 6 2 7 1 8 ) –> ( 3 5 6 2 7 1 8 )
( 3 5 6 2 7 1 8 ) –> (3 5 2 6 7 1 8 )
( 3 5 2 6 7 1 8 ) –>  ( 3 5 2 6 7 1 8)
....so on.
```
```
  for(int i=0;i<arr.length-1;i++){
              for (int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        } 
```
 ##### Time Complexity:-
So you've noticed that the total number of comparisons done is n + (n - 1) + ... + 2 + 1. This sum is equal to n * (n + 1) / 2  which is equal to 0.5 n^2 + 0.5 n which is clearly ``O(n^2)``.

### Selection Sort:-

The Selection sort algorithm is based on the idea of finding the minimum or maximum element in an unsorted array and then putting it in its correct position in a sorted array.

```
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

```
##### Time Complexity:
To find the minimum element from the array of n elements, n comparisons are required. After putting the minimum element in its proper position, the size of an unsorted array reduces to n-1  and then n-2 comparisons are required to find the minimum in the unsorted array.

Therefore n + (n - 1) + ... + 2 + 1=n*(n+1)/2  comparisons and  swaps result in the overall complexity of  ``O(n^2)``.


### Insertion Sort:-

Insertion sort is a simple sorting algorithm suited for small data sets. During each iteration, the algorithm
removes an element from an array,compares it against the largest value in the array moves the element to its correct location.

 ```
 for (int j = 1; j < arr.length ; j++) {
            int i=j-1;
            int key = arr[j];

            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }
 ```
### Time complexity(worst case): O(n^2)


       
        

