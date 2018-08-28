# sorting-algorithms
### Bubble Sort:-

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

 ```   for (int j = 1; j < arr.length ; j++) {
            int i=j-1;
            int key = arr[j];

            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }```
       
        

