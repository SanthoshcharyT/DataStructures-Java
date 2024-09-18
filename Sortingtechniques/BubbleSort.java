package Sortingtechniques;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {12, 9, 25, 11, 27, 58, 3};
        int n = arr.length;
        
        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
