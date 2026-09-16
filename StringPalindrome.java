
public class StringPalindrome {

    public static boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) { 

            // Skip non-letter/digit from left
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            // Skip non-letter/digit from right
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            char startChar = s.charAt(start);
            char endChar = s.charAt(end);

            // Compare characters ignoring uppercase/lowercase
            if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "madam";

        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
