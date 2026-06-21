public class BinarySearch {
    public static int binarySearch(int[] arr, int tar) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == tar) {
                return mid;
            } 
            else if (arr[mid] < tar) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4};
        int tar = 3;

        int res = binarySearch(arr, tar);
        System.out.println(res);
    }
}