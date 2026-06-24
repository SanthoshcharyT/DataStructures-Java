package STAR_PATTERNS;

public class InvertedNumberedTriangle {
    public static void main(String[] args) {
        int count =1;
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
        }
    }
}
