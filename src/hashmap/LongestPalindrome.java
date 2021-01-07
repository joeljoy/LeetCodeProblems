package hashmap;

import java.util.Arrays;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] charFrequency = new int[256];
        Arrays.fill(charFrequency, 0);
        int longestLength = 0;
        for (int i = 0; i < s.length(); i++) {
            charFrequency[s.charAt(i)]++;
            int freq = charFrequency[s.charAt(i)];
            if (freq > 1 && freq % 2 == 0) {
                longestLength += 2;
            }
        }
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] == 1) {
                longestLength += 1;
                break;
            }
        }
        return longestLength;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        String s1 = "aA";
        String s2 = "a";
        String s3 = "bb";
        String s4 = "ccc";

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome(s));
        System.out.println(longestPalindrome.longestPalindrome(s1));
        System.out.println(longestPalindrome.longestPalindrome(s2));
        System.out.println(longestPalindrome.longestPalindrome(s3));
        System.out.println(longestPalindrome.longestPalindrome(s4));
    }
}
