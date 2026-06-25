
public class ArrayProduct {
    public static int[] arrayProduct(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    result[i] *= arr[j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int[] result = arrayProduct(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
