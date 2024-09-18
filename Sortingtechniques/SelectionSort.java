package Sortingtechniques;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 9, 11, 12, 25, 27, 58};
        int n = arr.length; 
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current index as the minimum
            
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update the index of the minimum element
                }
            }
            
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
