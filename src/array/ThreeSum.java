package array;

import java.util.*;
import java.util.function.Consumer;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            Set<Integer> set = new HashSet<>();
            Integer requiredSum = -nums[0];
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (set.contains(nums[j])) {
                        List<Integer> result = new ArrayList<>();
                        result.add(nums[i]);
                        result.add(requiredSum - nums[j]);
                        result.add(nums[j]);
                        resultSet.add(result);
                    } else {
                        set.add(requiredSum - nums[j]);
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        resultSet.forEach(new Consumer<List<Integer>>() {
            @Override
            public void accept(List<Integer> integers) {
                result.add(integers);
            }
        });
        return result;
    }

    public static void main(String[] args) {
        int val = 1/2;
        System.out.println(val);
//        int[] a = {-1, 0, 1, 2, -1, -4};
//        ThreeSum sum = new ThreeSum();
//        List<List<Integer>> result = sum.threeSum(a);
//        for (List<Integer> list : result) {
//            for (Integer integer : list) {
//                System.out.print(integer);
//            }
//            System.out.println();
//        }
    }
}
