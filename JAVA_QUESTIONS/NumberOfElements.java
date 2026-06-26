import java.util.HashMap;

public class NumberOfElements {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 7, 7 };
        HashMap<Integer, Integer> s1 = new HashMap<>();
        for (int num : arr) {
            int prev = s1.getOrDefault(num, 0);
            s1.put(num, prev + 1);
        }
        System.out.println(s1);
    }
}
