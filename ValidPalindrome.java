

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                s1.append(Character.toLowerCase(c));
            }
        }
        return s1.toString().equals(s1.reverse().toString());
    }

    public static void main(String[] args) {
        String s = "Malayalam";
        boolean res = isPalindrome(s);
        if (res) {
            System.out.println("It is Plaindrome");
        } else {
            System.out.println("its not a palindrome");
        }
    }
}
