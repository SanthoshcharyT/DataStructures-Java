package Sortingtechniques;

class QuickSort {

    // Method to perform the QuickSort algorithm
    public static void quicksort(int arr[], int low, int high) {
        // Base condition: If the lower index is less than the higher index
        if (low < high) {
            // Find the partition index (pi), where the pivot element is in its correct position
            int pi = partition(arr, low, high);

            // Recursively sort the elements before and after the partition
            quicksort(arr, low, pi - 1);  // Sort elements before the pivot
            quicksort(arr, pi + 1, high); // Sort elements after the pivot
        }
    }

    // Method to partition the array, returning the pivot index
    public static int partition(int arr[], int low, int high) {
        // Set the last element as the pivot
        int pivot = arr[high];

        // Initialize i to track the smaller elements
        int i = low - 1;

        // Iterate over the array from low to high - 1
        for (int j = low; j < high; j++) {
            // If the current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++; // Increment the index of the smaller element

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct position by swapping it with arr[i+1]
        int swap = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = swap;

        // Return the index where the pivot element is placed
        return i + 1;
    }

    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        int arr[] = {8, 4, 6, 36, 2, 5, 61};
        int n = arr.length;  // Get the length of the array

        // Call the quicksort method on the entire array
        quicksort(arr, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
