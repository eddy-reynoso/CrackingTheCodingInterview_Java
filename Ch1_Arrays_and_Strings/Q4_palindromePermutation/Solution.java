package Ch1_Arrays_and_Strings.Q4_PalindromePermutation;

/*
Given a string, write a function to check if it is a permutation of a palindrome. 
Example
Input: Tact Coa
Output: True (permutations: "taco cat", "atco cta")
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(palindromePermutation("atcooot cta"));
    }

    public static boolean palindromePermutation(String s) {
        s = s.toLowerCase();
        int lengthWithoutSpaces = s.replaceAll("\\s+", "").length();
        int[] characterCount = new int[128];
        int numberOfOddCounts = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr != ' ')
                characterCount[curr]++;
        }

        for (int j = 0; j < characterCount.length; j++) {
            int curr = characterCount[j];
            if (curr % 2 != 0) {
                numberOfOddCounts++;
            }
        }
        System.out.println("Oddcount:" + numberOfOddCounts);
        if (lengthWithoutSpaces % 2 == 0) {
            return numberOfOddCounts == 0 ? true : false;
        } else {
            return numberOfOddCounts == 1 ? true : false;
        }

    }
}
