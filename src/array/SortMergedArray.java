package array;

public class SortMergedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int index1 = 0;
        int index2 = 0;
        int resultIndex = 0;
        while (index1 < m && index2 < n) {
            if (nums1[index1] <= nums2[index2]) {
                result[resultIndex] = nums1[index1];
                resultIndex++;
                index1++;
            } else {
                result[resultIndex] = nums2[index2];
                resultIndex++;
                index2++;
            }
        }

        while (index1 < m) {
            result[resultIndex] = nums1[index1];
            resultIndex++;
            index1++;
        }

        while (index2 < n) {
            result[resultIndex] = nums2[index2];
            resultIndex++;
            index2++;
        }
        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        SortMergedArray array = new SortMergedArray();
        array.merge(nums1, 3, nums2, 3);
    }
}
