import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int[] arr = {110000, 120000, 100000, 90000, 110000, 120000, 100000, 90000};
        // int[] arr = {6, 7, 5, 2};
        long start = System.currentTimeMillis();
        for (int j : arr) {
//            System.out.println(factorial(j));
            factorial(j);
        }
        // 1000 ms = 1 second
        System.out.println("Time in milli seconds : " + (System.currentTimeMillis() - start));
    }

    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i <= num; i++) {
            BigInteger val = BigInteger.valueOf(i);
            result = result.multiply(val);
        }
        return result;
    }
}
