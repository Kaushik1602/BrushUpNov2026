package arrays;

import java.util.Arrays;

public class DuplicateZeros {


    static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
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
}
