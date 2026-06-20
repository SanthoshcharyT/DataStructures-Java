package TWO_POINTERS;

import java.util.Arrays;

public class Two_Sum {

    public static int[] twosum(int arr[], int tar) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];

            if (sum == tar) {
                return new int[]{l, r}; // return indices
            } else if (sum < tar) {
                l++;
            } else {
                r--;
            }
        }

        return new int[]{-1, -1}; // not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6, 7};
        int tar = 9;

        int[] result = twosum(arr, tar);

        System.out.println(Arrays.toString(result));
    }
}