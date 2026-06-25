public class Duplicates {

    public static boolean containDuplicate(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return true;
                }

            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 4, 4, 5, 5, 7};

        boolean result = containDuplicate(arr);

        System.out.println(result);
    }
}