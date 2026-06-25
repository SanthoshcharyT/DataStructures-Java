package TWO_POINTERS;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 6, 7, 8, 9, 10 };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int merged[] = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(merged));
    }
}
