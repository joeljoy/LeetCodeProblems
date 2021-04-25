package twopointer;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args) {
        String s0 = "pwwkew";
        String s1 = "abcabcbb";
        String s2 = "bbbbbb";
        String s3 = "a";
        String s4 = "autyio";
        String s5 = "";
        String s6 = "dvdf";
        String s7 = "cddddd";
        LongestSubString subString = new LongestSubString();
        System.out.println(subString.lengthOfLongestSubstring(s0));
        System.out.println(subString.lengthOfLongestSubstring(s1));
        System.out.println(subString.lengthOfLongestSubstring(s2));
        System.out.println(subString.lengthOfLongestSubstring(s3));
        System.out.println(subString.lengthOfLongestSubstring(s4));
        System.out.println(subString.lengthOfLongestSubstring(s5));
        System.out.println(subString.lengthOfLongestSubstring(s6));
        System.out.println(subString.lengthOfLongestSubstring(s7));
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLengthSoFar = 0;
        Set<Character> characterSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (characterSet.contains(s.charAt(right))) {
                characterSet.remove(s.charAt(left));
                left++;
            }
            characterSet.add(s.charAt(right));
            maxLengthSoFar = Math.max(maxLengthSoFar, right - left + 1);
        }
        return maxLengthSoFar;
    }
}
