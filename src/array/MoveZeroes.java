package array;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes1(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[nonZeroIndex] == 0)
                nonZeroIndex++;

            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nums[i] = 0;
                nonZeroIndex++;
            }
        }
    }
}
