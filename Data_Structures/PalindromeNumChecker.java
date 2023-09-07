package Data_Structures;

public class PalindromeNumChecker {
    // Check palindrome for numbers
    public static boolean isNumPalindrome(int num) {
        String strNum = String.valueOf(num);
        String reversedNum = new StringBuilder(strNum).reverse().toString();
        return strNum.equals(reversedNum);
    }
    public static void main(String[] args) {
        // Test number palindrome
        System.out.println(isNumPalindrome(121)); // true
        System.out.println(isNumPalindrome(12345)); // false
    }

}