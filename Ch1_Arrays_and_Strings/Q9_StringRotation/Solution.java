package Ch1_Arrays_and_Strings.Q9_StringRotation;

/*
Assume you have a method isSubstring which checks if one word is a substring of another. 
Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only
one call to isSubstring (ex. "waterbottle" is a rotation of "erbottlewat")
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(stringRotation("waterbottle", "erbottlewat"));
    }

    public static boolean stringRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }
        s1 = s1 + s1;

        return isSubstring(s1, s2);
    }

    public static boolean isSubstring(String big, String small) {
        if (big.indexOf(small) >= 0) {
            return true;
        } else {
            return false;
        }
    }
}