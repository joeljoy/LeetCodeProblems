package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Character, Integer> lastMap = generateLastIndex(s);
        Integer right = -1 ;
        Integer left = -1;
        for (int index = 0; index < s.length(); index++) {
            Integer last = lastMap.get(s.charAt(index));
            if (last > right) {
                right = last;
            }
            if (index == right) {
                result.add(right - left);
                left = right;
                right = 0;
            }
        }
        return result;
    }

    private Map<Character, Integer> generateLastIndex(String s) {
        HashMap<Character, Integer> lastMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastMap.put(s.charAt(i), i);
        }
        return lastMap;
    }

    public static void main(String[] args) {
        String s1 = "ababcbacadefegdehijhklij";
        String s2 = "eccbbbbdec";
        String s3 = "eaaaabaaec";
        String s4 = "abcdefgh";
        PartitionLabels labels = new PartitionLabels();
        System.out.println(labels.partitionLabels(s1));
        System.out.println(labels.partitionLabels(s2));
        System.out.println(labels.partitionLabels(s3));
        System.out.println(labels.partitionLabels(s4));
    }
}
