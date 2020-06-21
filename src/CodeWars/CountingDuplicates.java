package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    /*
    Write a function that will return the count of distinct case-insensitive alphabetic characters
    and numeric digits that occur more than once in the input string. The input string can be assumed
    to contain only alphabets (both uppercase and lowercase) and numeric digits.
     */

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int count = 0;
        Map<Character, Boolean> charMap = new HashMap();
        for (int character = 0; character < text.length(); character++) {
            boolean foundChar = charMap.containsKey(text.charAt(character));
            if (foundChar) count++;
            charMap.put(text.charAt(character), true);
        }
        return count;
    }

    public static void main(String[] args) {
        int output = duplicateCount("abcde");
        System.out.println(output);
        output = duplicateCount("abcdea");
        System.out.println(output);
        output = duplicateCount("indivisibility");
        System.out.println(output);
    }
}
