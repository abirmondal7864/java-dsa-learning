package sorting;

public class Sorting {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Given array below
        int[] arr = {7, 8, 3, 1, 2};
        int n = arr.length;

//        //Bubble sort   //TC: O(n^2)
//
//        boolean swapped;
//        for (int i = 0; i < n - 1; i++) {
//            swapped= false;
//            for (int j = 0; j < n - i - 1; j++) {//Imp**
//                if (arr[j] > arr[j + 1]) {
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped=true;
//                }
//
//            }
//            if(!swapped) break;
//        }
//        printArray(arr);


//     //Selection Sort
//
//        // Controls the boundary between the sorted and unsorted parts of the array.
//        for (int i = 0; i <= n-2; i++) {  // 0 to n-2
//            int minIndex=i;
//
//            //Searches the unsorted part of the array to find the minimum element.
//            for (int j = i+1; j <= n-1; j++) { //0 to n-1
//                if(arr[j]<arr[minIndex]){ //arr[j]***
//                    minIndex=j;
//                }
//            }
//            //swap
//            int temp=arr[minIndex];
//            arr[minIndex]=arr[i];
//            arr[i]=temp;
//        }
//        printArray(arr);


//        //Insertion Sort
//
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//            int j = i - 1;
//            // Move elements of arr[0..i-1] that are greater than key
//            // to one position ahead of their current position
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = key;
//        }
//        printArray(arr);


    }
}

