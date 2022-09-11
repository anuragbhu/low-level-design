import java.math.BigInteger;

public class SumOfDifference {
    public static void main(String[] args) {
        int n = 100000000; // n will always be even number.
        long start = System.currentTimeMillis();
        BigInteger evenSum = evenSquares(n);
        BigInteger oddSum = oddSquares(n);
        System.out.println(evenSum.subtract(oddSum));
        System.out.println("Time in milli seconds : " + (System.currentTimeMillis() - start));
    }

    public static BigInteger evenSquares(int n) {
        BigInteger evenResult = BigInteger.ZERO;
        for(int i = 2; i <= n; i += 2) {
            BigInteger val = BigInteger.valueOf(i);
            evenResult = evenResult.add(val.multiply(val));
//            System.out.print(i + " ");
        }
//        System.out.println();
        return evenResult;
    }

    public static BigInteger oddSquares(int n) {
        BigInteger oddResult = BigInteger.ZERO;
        for(int i = 1; i <= n; i += 2) {
            BigInteger val = BigInteger.valueOf(i);
            oddResult = oddResult.add(val.multiply(val));
//            System.out.print(i + " ");
        }
//        System.out.println();
        return oddResult;
    }
}
