package Data_Structures;

public class PalindromeStrChecker {
    // Check palindrome for strings
    public static boolean isStrPalindrome(String str) {
        // Convert to lowercase and remove non-alphanumeric characters
        String cleanedStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
    public static void main(String[] args) {
        // Test string palindrome
        System.out.println(isStrPalindrome("A man, a plan, a canal, Panama!")); // true
        System.out.println(isStrPalindrome("hello")); // false
    }
}