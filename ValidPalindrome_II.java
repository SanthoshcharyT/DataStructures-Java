package P2_Two_Pointers;

public class ValidPalindrome_II {
    public static boolean isValidPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            while (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Malayalam";
        boolean res = isValidPalindrome(s);
        if (res) {
            System.out.println("its palindrome");
        } else {
            System.out.println("its not a plaaindrome");
        }
    }
}
