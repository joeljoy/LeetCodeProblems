package searching;

public class PerfectSquare {

    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                high = Math.toIntExact(mid - 1);
            } else {
                low = Math.toIntExact(mid + 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PerfectSquare square = new PerfectSquare();
        System.out.println(square.isPerfectSquare(16));
        System.out.println(square.isPerfectSquare(14));
        System.out.println(square.isPerfectSquare(12 * 12));
        System.out.println(square.isPerfectSquare(11 * 11));
        System.out.println(square.isPerfectSquare(2147483647));
    }
}
