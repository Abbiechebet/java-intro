package Data_Structures;

public class ShortestWordFinder {

    public static String findShortestWord(String[] words) {
        if (words == null || words.length == 0) {
            return null;  // or throw an exception
        }

        String shortest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        return shortest;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "kiwi", "grape", "mango"};
        System.out.println(findShortestWord(words));  // Outputs: kiwi
    }
}
