package string;

import java.util.ArrayList;
import java.util.List;

public class PrintVertical {
    public List<String> printVertically(String s) {
        ArrayList<String> result = new ArrayList<>();
        String[] splitWords = s.split(" ");
        int maxIndex = findMaxIndex(splitWords);
        for (int i = 0; i < maxIndex; i++) {
            String vertical = getVerticalString(splitWords, i);
            result.add(vertical);
        }
        return result;
    }

    private String getVerticalString(String[] words, int index) {
        StringBuilder builder = new StringBuilder();
        for (String s : words) {
            if (index < s.length()) {
                builder.append(s.charAt(index));
            } else {
                builder.append(" ");
            }
        }
        return builder.toString().replaceFirst("\\s++$", "");
    }

    private int findMaxIndex(String[] splitWords) {
        int maxIndex = 0;
        for (String s : splitWords) {
            maxIndex = Math.max(maxIndex, s.length());
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        String s1 = "HOW ARE YOU";
        String s2 = "TO BE OR NOT TO BE";
        String s3 = "CONTEXT IS COMING";

        PrintVertical printVertical = new PrintVertical();
        System.out.println(printVertical.printVertically(s1));
        System.out.println(printVertical.printVertically(s2));
        System.out.println(printVertical.printVertically(s3));
    }
}
