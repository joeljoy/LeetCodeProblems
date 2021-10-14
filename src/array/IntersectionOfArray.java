package array;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfArray {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int j : nums1) {
            if (frequencyMap.containsKey(j)) {
                int frequency = frequencyMap.get(j) + 1;
                frequencyMap.put(j, frequency);
            } else {
                frequencyMap.put(j, 1);
            }
        }
        for (int j : nums2) {
            if (frequencyMap.containsKey(j)) {
                result.add(j);
                int frequency = frequencyMap.get(j) - 1;
                if (frequency <= 0) {
                    frequencyMap.remove(j);
                } else {
                    frequencyMap.put(j, frequency);
                }
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
