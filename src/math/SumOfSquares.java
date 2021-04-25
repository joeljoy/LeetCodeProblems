package math;

public class SumOfSquares {

    public boolean judgeSquareSum(int c) {
        int low = 0;
        int high = sqrt(c);

        while (low <= high) {
            int squareSum = square(low) + square(high);
            if (squareSum == c) {
                return true;
            } else if (squareSum > c) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }

    private int square(int num) {
        return num * num;
    }

    private int sqrt(int num) {
        return Math.toIntExact(Math.round(Math.sqrt(num)));
    }

    public static void main(String[] args) {
        SumOfSquares sumOfSquares = new SumOfSquares();
        System.out.println(sumOfSquares.judgeSquareSum(5));
        System.out.println(sumOfSquares.judgeSquareSum(3));
        System.out.println(sumOfSquares.judgeSquareSum(4));
        System.out.println(sumOfSquares.judgeSquareSum(2));
        System.out.println(sumOfSquares.judgeSquareSum(1));
    }
}
