package Ch1_Arrays_and_Strings.Q3_URLify;

/*Write a method to replace all spaces in a string with '%20'. 
You may assume that the string has sufficient space at the end 
to hold the additional characters, and that you are given the 
"true" length of the string.

Use a character array to perform in place.

Input: "Mr John Smith      ", 13
Output: "Mr%20John%20Smith"
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith    ", 13));
    }

    public static String urlify(String s, int trueLength) {
        char[] query = s.toCharArray();
        int endPointer = query.length;

        for (int stringPointer = trueLength - 1; stringPointer >= 0; stringPointer--) {
            char curr = query[stringPointer];

            if (curr == ' ') {
                query[--endPointer] = '0';
                query[--endPointer] = '2';
                query[--endPointer] = '%';
            } else {
                query[--endPointer] = query[stringPointer];
            }
        }

        String result = String.valueOf(query);
        return result;
    }
}
