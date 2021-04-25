package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        Map<Character, Integer> keyboardRowMap = new HashMap<>();
        String row0 = "qwertyuiop";
        String row1 = "asdfghjkl";
        String row2 = "zxcvbnm";

        for (int i = 0; i < row0.length(); i++) {
            keyboardRowMap.put(row0.charAt(i), 0);
        }
        for (int i = 0; i < row1.length(); i++) {
            keyboardRowMap.put(row1.charAt(i), 1);
        }
        for (int i = 0; i < row2.length(); i++) {
            keyboardRowMap.put(row2.charAt(i), 2);
        }

        for (String s : words) {
            int currentRow = -1;
            boolean isToBeAdded = true;
            for (int i = 0; i < s.length(); i++) {
                Character c = s.toLowerCase().charAt(i);
                if (i == 0) {
                    currentRow = keyboardRowMap.get(c);
                } else if (currentRow != keyboardRowMap.get(c)) {
                    isToBeAdded = false;
                    break;
                }
            }
            if (isToBeAdded)
                result.add(s);
        }
        String[] strings = new String[result.size()];
        return result.toArray(strings);
    }

    public static void main(String[] args) {
        String[] strings1 = {"Hello", "Alaska", "Dad", "Peace"};
        String[] strings2 = {"omk"};
        String[] strings3 = {"adsdf", "sfd"};
        KeyboardRow row = new KeyboardRow();
        for (String s : row.findWords(strings1)) {
            System.out.print(s + ",");
        }
        System.out.println();
        for (String s : row.findWords(strings2)) {
            System.out.print(s + ",");
        }
        System.out.println();
        for (String s : row.findWords(strings3)) {
            System.out.print(s + ",");
        }
    }
}
