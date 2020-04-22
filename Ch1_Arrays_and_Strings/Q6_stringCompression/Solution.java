package Ch1_Arrays_and_Strings.Q6_StringCompression;

/*
Implement a method to perform basic string compression using the counts
of repeated characters. For example the string aabcccccaaa would become a2b1c5a3. If the "compressed"
string would not become smaller than the original string, your method should return the original string.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
    }

    public static String compress(String s) {
        if (s.length() == 0 || s == null) {
            return s;
        }
        String compressed = "";
        char currentCharacter = s.charAt(0);
        int currentCharacterCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char next = ' ';
            if (i != s.length() - 1) {
                next = s.charAt(i + 1);
            }

            currentCharacterCount++;
            if (currentCharacter != next) {
                compressed += currentCharacter + "" + currentCharacterCount;
                currentCharacterCount = 0;
                currentCharacter = next;
            }

        }

        return compressed.length() < s.length() ? compressed : s;
    }
}
