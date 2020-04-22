package Ch1_Arrays_and_Strings.Q1_is_Unique;

import java.util.*;
/*Implement an algorithm to determine if a string has all 
unique characters.*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(is_unique("lll"));
    }

    public static boolean is_unique(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (set.contains(curr)) {
                return false;
            }
            set.add(curr);
        }
        return true;
    }
}