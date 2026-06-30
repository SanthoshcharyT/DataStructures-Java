public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

        while (number > 0) {
            number /= 10;
            digits++;
        }

        number = originalNumber;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}