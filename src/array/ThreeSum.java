package array;

import java.util.*;
import java.util.function.Consumer;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                if (left == i) {
                    left++;
                } else if (right == i) {
                    right--;
                } else {
                    int sum = nums[left] + nums[right];
                    if (target == sum) {
                        List<Integer> answer = new ArrayList<>();
                        answer.add(nums[left]);
                        answer.add(nums[right]);
                        answer.add(-target);
                        Collections.sort(answer);
                        resultSet.add(answer);
                        left++;
                        right--;
                    } else if (target > sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(resultSet);
    }

    public static void main(String[] args) {
//        int[] a = {-1, 0, 1, 2, -1, -4};
        int[] a = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        ThreeSum sum = new ThreeSum();
        List<List<Integer>> result = sum.threeSum(a);
        for (List<Integer> list : result) {
            for (Integer integer : list) {
                System.out.print(integer+",");
            }
            System.out.println();
        }
    }
}
