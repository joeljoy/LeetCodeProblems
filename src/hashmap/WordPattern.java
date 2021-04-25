package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        int patternLength = pattern.length();
        int sLength = calculateSLength(s);
        if (patternLength != sLength) return false;
        int patternIndex = 0;
        int sIndex = 0;
        String[] sWords = getSWords(s);
        Set<Character> patternSet = new HashSet<>();
        Set<String> sSet = new HashSet<>();
        Map<Character, String> patternToSMap = new HashMap<>();

        while (patternIndex < patternLength && sIndex < sLength) {
            Character p = pattern.charAt(patternIndex);
            String sWord = sWords[sIndex];

            if (!patternSet.contains(p)) {
                patternSet.add(p);
                if (!sSet.contains(sWord)) {
                    sSet.add(sWord);
                    patternToSMap.put(p, sWord);
                } else {
                    return false;
                }
            } else {
                if (!patternToSMap.get(p).equals(sWord)) {
                    return false;
                }
            }
            patternIndex++;
            sIndex++;
        }
        return true;
    }

    private int calculateSLength(String s) {
        String[] words = s.split(" ");
        return words.length;
    }

    private String[] getSWords(String s) {
        return s.split(" ");
    }

    public static void main(String[] args) {
        WordPattern pattern = new WordPattern();
        System.out.println(pattern.wordPattern("abba", "dog cat cat dog"));
        System.out.println(pattern.wordPattern("abba", "dog cat cat fish"));
        System.out.println(pattern.wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(pattern.wordPattern("abba", "dog dog dog dog"));
    }
}
