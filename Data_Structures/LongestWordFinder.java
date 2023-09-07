package Data_Structures;

public class LongestWordFinder {
    public static String findLongestWord(String[] words) {
        if (words == null || words.length == 0) {
            return null; // or an appropriate default value
        }
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pineapple", "strawberry", "blueberry"};
        System.out.println(findLongestWord(words));  // Outputs: "strawberry"
    }
}

