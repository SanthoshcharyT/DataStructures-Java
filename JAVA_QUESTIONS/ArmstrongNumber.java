public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

        // Count the number of digits
        while (number > 0) {
            number /= 10;
            digits++;
        }

        // Reset number to original value
        number = originalNumber;

        // Calculate sum of cubes
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        // Check if sum is equal to original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}