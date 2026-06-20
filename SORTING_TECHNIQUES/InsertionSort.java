package SORTING_TECHNIQUES;

//Insertion Sort – Builds the sorted array one element at a time by inserting each element into its correct place.

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 1, 25, 59};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
