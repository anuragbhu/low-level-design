import java.math.BigInteger;

public class SumOfDifferenceUsingMultithreading {
    public static void main(String[] args) {
        int n = 100000000; // n will always be even number.
        long start = System.currentTimeMillis();
        ThreadForSumOfDifference thread = new ThreadForSumOfDifference(n);
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time in milli seconds : " + (System.currentTimeMillis() - start));
    }
}

class ThreadForSumOfDifference extends Thread {
    private int n;

    public ThreadForSumOfDifference(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println(evenSquares().subtract(oddSquares()));
    }

    public BigInteger evenSquares() {
        BigInteger evenResult = BigInteger.ZERO;
        for(int i = 2; i <= this.n; i += 2) {
            BigInteger val = BigInteger.valueOf(i);
            evenResult = evenResult.add(val.multiply(val));
//            System.out.print(i + " ");
        }
//        System.out.println();
        return evenResult;
    }

    public BigInteger oddSquares() {
        BigInteger oddResult = BigInteger.ZERO;
        for(int i = 1; i <= this.n; i += 2) {
            BigInteger val = BigInteger.valueOf(i);
            oddResult = oddResult.add(val.multiply(val));
//            System.out.print(i + " ");
        }
//        System.out.println();
        return oddResult;
    }
}
