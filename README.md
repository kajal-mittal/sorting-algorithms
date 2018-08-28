# sorting-algorithms
### Bubble Sort:-

Bubble Sort is the simplest sorting algorithm that works by swapping the adjacent elements if they are in wrong order.

Example:
First Pass:
``
  ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
  ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
  ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
  ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
  ``

Second Pass:
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
....so on.
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

### Selection Sort:-

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
       
        

