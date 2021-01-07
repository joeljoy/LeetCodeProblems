package twopointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args) {
//        String s = "pwwkew";
        String s = "abcabcbb";
//        String s = "bbbbbb";
//        String s = "a";
//        String s = "autyio";
//        String s = "dvdf";
//        String s = "cdddd";
        LongestSubString subString = new LongestSubString();
        System.out.println(subString.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        int sumSoFar = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        while (left <= right && right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                int currentLength = right - left;
                if (sumSoFar < currentLength) {
                    sumSoFar = currentLength;
                }
                left = map.get(c) + 1;
            }
            map.put(c, right);
            right++;
        }
        int currentLength = right - left;
        if (sumSoFar < currentLength) {
            sumSoFar = currentLength;
        }
        return sumSoFar;
    }
}
