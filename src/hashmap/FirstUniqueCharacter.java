package hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIndexMap.containsKey(c)) {
                charIndexMap.put(c, -1);
            } else {
                charIndexMap.put(c, i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIndexMap.get(c) != -1) {
                return charIndexMap.get(c);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter character = new FirstUniqueCharacter();
        System.out.println(character.firstUniqChar("leetcode"));
        System.out.println(character.firstUniqChar("loveleetcode"));
    }
}
