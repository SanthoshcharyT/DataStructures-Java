public class LinearSearch {
    public static int linearSearch(int[] arr, int tar) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4};
        int tar = 3;

        int res = linearSearch(arr, tar);
        System.out.println(res);
    }   
}
