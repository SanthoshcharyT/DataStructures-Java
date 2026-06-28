package SLIDING_WINDOW_ALGORITHM;

public class MaxsumSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int k = 3;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        for(int  i = k;i<n;i++){
            sum += arr[i];
            sum -= arr[i-k];
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
    }
}
