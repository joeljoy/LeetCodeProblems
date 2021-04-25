package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < len1 && j < len2) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] resultArray = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            resultArray[k] = result.get(k);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        IntersectArrays2 arrays2 = new IntersectArrays2();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(arrays2.intersect(nums1, nums2)));
        System.out.println(Arrays.toString(arrays2.intersect(nums3, nums4)));
    }
}
