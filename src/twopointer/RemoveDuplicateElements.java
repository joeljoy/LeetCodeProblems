package twopointer;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicateElements elements = new RemoveDuplicateElements();
        System.out.print(elements.removeDuplicates(a));
    }

    public int removeDuplicates(int[] nums) {
        int currentIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[currentIndex] != nums[i]) {
                nums[++currentIndex] = nums[i];
            }
        }
        return currentIndex + 1;
    }
}
