import java.util.HashMap;

public class NumberOfWords {
    public static void main(String[] args) {
        String arr[] = { "santhosh", "santhu", "santhosh", "santhu" };
        HashMap<String, Integer> s1 = new HashMap<>();
        for (String num : arr) {
            int prev = s1.getOrDefault(num, 0);
            s1.put(num,prev+1);

        }
        System.out.println(s1);

    }
}
