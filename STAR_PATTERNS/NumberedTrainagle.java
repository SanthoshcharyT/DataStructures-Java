package STAR_PATTERNS;

public class NumberedTrainagle {
    public static void main(String[] args) {
        int count = 1;
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(count +  " ");
                count++;
            }
            System.out.println();
        }
    }
}
