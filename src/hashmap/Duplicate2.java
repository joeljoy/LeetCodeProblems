package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Duplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(nums[j])) {
                int i = map.get(nums[j]);
                if (j - i <= k) {
                    return true;
                } else {
                    map.put(nums[j],j);
                }
            } else {
                map.put(nums[j], j);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 2, 3};
        int[] b = {1, 0, 1, 1};
        int[] c = {1, 2, 3, 1};
        Duplicate2 duplicate2 = new Duplicate2();
        System.out.println(duplicate2.containsNearbyDuplicate(b, 1));
    }
}
