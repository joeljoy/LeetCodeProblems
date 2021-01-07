package hashmap;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Duplicate duplicate = new Duplicate();
        System.out.println(duplicate.containsDuplicate(a));
    }
}
