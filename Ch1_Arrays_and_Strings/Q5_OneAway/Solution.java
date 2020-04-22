package Ch1_Arrays_and_Strings.Q5_OneAway;

/*
There are three types of edits that can be performed on strings: 
insert a character, remove a character or replace a character.
Given two strings, write a function to check if they are one edit (or zero edits away)

*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(oneAway("pale", "pales"));
    }

    public static boolean oneAway(String s1, String s2) {
        if (edgeCases(s1, s2)) {
            return true;
        }
        // int[] charCount = new int[128];

        if (s1.length() == s2.length()) {
            return replacement(s1, s2);
        } else if (s1.length() < s2.length()) {
            return insertion(s2, s1);
        } else {
            return insertion(s1, s2);
        }
    }

    public static boolean insertion(String longer, String shorter) {
        if (longer.length() - 1 != shorter.length()) {
            return false;
        }
        int similar = 0;
        int longerStringPointer = 0;

        for (int i = 0; i < shorter.length(); i++) {
            char currShorter = shorter.charAt(i);
            if (longerStringPointer >= longer.length()) {
                return false;
            }
            char currLonger = longer.charAt(longerStringPointer);

            if (currShorter != currLonger) {
                i--;
            } else {
                similar++;
            }
            longerStringPointer++;

        }

        return similar == shorter.length();
    }

    public static boolean replacement(String s1, String s2) {
        int edit = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                edit++;
            }
        }
        return edit <= 1;
    }

    public static boolean edgeCases(String s1, String s2) {
        if ((s1.length() == 0 && s2.length() == 0) || (s1.length() == 0 && s2.length() == 1)
                || (s1.length() == 1 && s2.length() == 0) || (s1.length() == 1 && s2.length() == 1) || s1.equals(s2)) {
            return true;
        }
        return false;
    }
}
