package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (characterFrequencyMap.containsKey(s.charAt(i))) {
                Integer value = characterFrequencyMap.get(s.charAt(i));
                characterFrequencyMap.put(s.charAt(i), value + 1);
            } else {
                characterFrequencyMap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (characterFrequencyMap.containsKey(t.charAt(i))) {
                Integer value = characterFrequencyMap.get(t.charAt(i)) - 1;
                if (value == 0) {
                    characterFrequencyMap.remove(t.charAt(i));
                } else {
                    characterFrequencyMap.put(t.charAt(i), value );
                }
            } else {
                return false;
            }
        }
        return characterFrequencyMap.isEmpty();
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        String s1 = "rat";
        String t1 = "car";
        String s2 = "aacc";
        String t2 = "ccac";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram(s, t));
        System.out.println(validAnagram.isAnagram(s1, t1));
        System.out.println(validAnagram.isAnagram(s2, t2));
    }
}
