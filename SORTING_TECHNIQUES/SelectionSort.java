package SORTING_TECHNIQUES;

import java.util.Arrays;

//Selection Sort – Repeatedly selects the smallest (or largest) element and puts it in its correct position.


public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {8,6,4,2,3,9,45};
        int n = arr.length;

     for(int i=0;i<n-1;i++){
         int min = i;
         for(int j=i+1;j<n;j++){
             if(arr[j]<arr[min]){
                 min = j;
             }
         }
         int temp = arr[i];
         arr[i] = arr[min];
         arr[min] = temp;
     }
        System.out.println(Arrays.toString(arr));
    }
}
