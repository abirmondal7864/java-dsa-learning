import java.util.*;

public class Sorting {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        //take inputs

//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter size: ");
//        int size=sc.nextInt();
//        int [] arr=new int[size];
//        System.out.println("Enter elements: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }


        //or, given array below
        int[] arr = {7, 8, 3, 1, 2};

        //bubble sort   //TC: O(n^2)
        for (int i = 0; i < arr.length - 1; i++) { //Imp** //n-1 times
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        printArray(arr);

    }
}

