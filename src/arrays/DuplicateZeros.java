package arrays;

import java.util.Arrays;

public class DuplicateZeros {


    static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        int arr1[] = {0,0,2,0,3,1,4,5};//00002003
        duplicateZerosOptimised(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void duplicateZeros(int[] arr) {

       for (int i =0; i< arr.length;i++){
           if(arr[i]==0){
               for(int j =arr.length-1;j>i;j--){
                arr[j]=arr[j-1];
               }
               arr[i]=0;
               i++;
           }
       }
    }

    public static void duplicateZerosOptimised(int[] arr) {
        int zeroCount = 0;

        // 1. Count the zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        // 2. Start from the back
        int i = arr.length - 1;          // Pointer for original array
        int j = arr.length + zeroCount - 1; // Pointer for the new shifted array

        // 3. Iterate backwards
        while (i >= 0) {
            // Only write if it's within the bounds of the array
            if (j < arr.length) {
                arr[j] = arr[i];
            }

            // If the current element is zero, duplicate it
            if (arr[i] == 0) {
                j--; // Move the pointer back
                if (j < arr.length) {
                    arr[j] = 0; // Write the duplicate zero
                }
            }

            // Move both pointers back
            i--;
            j--;
        }
    }
}
