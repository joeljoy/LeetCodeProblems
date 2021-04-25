package hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultList = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int j : nums2) {
            if (set.contains(j)) {
                resultList.add(j);
            }
        }
        int[] resultArray = new int[resultList.size()];
        int j = 0;
        for (Integer i: resultList) {
            resultArray[j] = i;
            j++;
        }
        return resultArray;
    }
}
