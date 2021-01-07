package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Set<Character> set = new HashSet<>();
        Map<Character, Character> map = new HashMap<>();
        int sI = 0;
        int tI = 0;
        while (sI < s.length() & tI < t.length()) {
            if (map.containsKey(s.charAt(sI))) {
                if (map.get(s.charAt(sI)) != t.charAt(tI)) {
                    return false;
                } else {
                    sI++;
                    tI++;
                }
            } else {
                if (set.contains(t.charAt(tI))) {
                    return false;
                } else {
                    map.put(s.charAt(sI), t.charAt(tI));
                    set.add(t.charAt(tI));
                    sI++;
                    tI++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ab";
        String t = "aa";
        IsomorphicString string = new IsomorphicString();
        boolean result = string.isIsomorphic(s, t);
        System.out.println(result);
    }
}
