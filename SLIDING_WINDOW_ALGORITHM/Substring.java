package SLIDING_WINDOW_ALGORITHM;
import java.util.*;
public class Substring {
    public static void main(String[] args) {
        String s = "Santhu";
        int n = s.length();
        ArrayList<String> s1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String temp = s.substring( i,j+1);
                s1.add(temp);
            }
        }
        System.out.println(s1);
    }
}
