package searching;

public class Sqrt {

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(4));
        System.out.println(sqrt.mySqrt(8));
        System.out.println(sqrt.mySqrt(2));
        System.out.println(sqrt.mySqrt(12345));
        System.out.println(sqrt.mySqrt(1));
        System.out.println(sqrt.mySqrt(2147395599));
    }

    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == x) {
                return Math.toIntExact(mid);
            } else if (mid * mid > x) {
                high = Math.toIntExact((mid - 1));
            } else {
                low = Math.toIntExact(mid + 1);
            }
        }
        return low - 1;
    }
}
