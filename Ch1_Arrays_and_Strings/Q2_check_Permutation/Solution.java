package Ch1_Arrays_and_Strings.Q2_check_Permutation;

//Given two strings, write a method to determine if one string is a permutation of another.

public class Solution {
    public static void main(String[] args) {
        System.out.println(checkPermutation("Hello", "olelH"));
    }

    public static boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] characterCount = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            char curr = s1.charAt(i);
            characterCount[curr]++;
        }

        for (int j = 0; j < s2.length(); j++) {
            char curr = s2.charAt(j);
            characterCount[curr]--;
            if (characterCount[curr] < 0) {
                return false;
            }
        }

        return true;
    }
}
