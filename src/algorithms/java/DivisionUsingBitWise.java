package algorithms.java;

public class DivisionUsingBitWise {
	public static void main(String[] args) {
        System.out.println("Division: " + divide(100, 9));
    }

    public static int divide(int num, int divisor) {
        int sign = 1;
        if((num > 0 && divisor < 0) || (num < 0 && divisor > 0))
            sign = -1;

        return divide(Math.abs(num), Math.abs(divisor), Math.abs(divisor)) * sign;
    }

    public static int divide(int num, int divisor, int sum) {
        if (sum > num) {
            return 0;
        }

        return 1 + divide(num, divisor, sum + divisor);
    }
}
