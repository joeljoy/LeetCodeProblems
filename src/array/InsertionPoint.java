package array;

public class InsertionPoint {

    public static int point(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        int mid = (min + max) / 2;
        while (min <= max) {
            if (nums[mid] > target)
                max = mid - 1;
            else if (nums[mid] < target)
                min = mid + 1;
            else
                return mid;
            mid = (min + max) / 2;
        }
        return min;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 3, 8, 12, 19, 45, 49, 52, 66, 75};
        int[] arr = {1,3,5,6};
        System.out.println(point(arr, 2));
    }

}
