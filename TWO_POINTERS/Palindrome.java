package TWO_POINTERS;

public class Palindrome {
    public static void main(String[] args) {
        String a = "madam";
        int n = a.length();
        int l = 0;
        int r = n - 1;
        boolean palindrome = true;
        while (l < r) {
            if (a.charAt(l) != a.charAt(r)) {
                palindrome = false;
                break;
            }
            l++;
            r--;
        }
            if (palindrome) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }

