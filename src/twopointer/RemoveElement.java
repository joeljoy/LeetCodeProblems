package twopointer;

public class RemoveElement {

    public static void main(String[] args) {
//        int[] a = {3,2,2,3};
        int[] a = {0,1,2,2,3,0,4,2};
        RemoveElement elements = new RemoveElement();
        System.out.print(elements.removeElement(a,2));
    }
    public int removeElement(int[] nums, int val) {
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[currentIndex++] = nums[i];
            }
        }
        return currentIndex;
    }
}
