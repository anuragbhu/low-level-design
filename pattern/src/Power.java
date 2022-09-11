import java.math.BigInteger;

public class Power {
    public static void main(String[] args) {
        int[] a = {199909, 10000};
        int[] b = {234342, 422320};

        long start = System.currentTimeMillis();
        for(int i = 0; i < a.length; i++) {
            pow(a[i], b[i]);
        }
        System.out.println("Time in milli seconds : " + (System.currentTimeMillis() - start));
    }

    public static void pow(int a, int b) {
        BigInteger result = BigInteger.valueOf(a);
        BigInteger val = BigInteger.valueOf(a);
        for(int i = 2; i <= b; i++) {
            result = result.multiply(val);
        }
//        System.out.println(result);
    }
}
