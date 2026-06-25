
public class NaturalNumberUsingRecursion {

    public static int sumNaturalNumbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumNaturalNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sumNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}