import java.math.BigInteger;

public class PowerUsingMultithreading {
    public static void main(String[] args) {
        int[] a = {199909, 10000};
        int[] b = {234342, 422320};

        ThreadForCalculatingPower[] threads = new ThreadForCalculatingPower[a.length];

        long start = System.currentTimeMillis();
        for(int i = 0; i < a.length; i++) {
            threads[i] = new ThreadForCalculatingPower(a[i], b[i]);
            threads[i].start();
        }

        for(int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Time in milli seconds : " + (System.currentTimeMillis() - start));
    }

}

class ThreadForCalculatingPower extends Thread {
    private int a;
    private int b;

    public ThreadForCalculatingPower(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        pow();
    }

    public void pow() {
        BigInteger result = BigInteger.valueOf(this.a);
        BigInteger val = BigInteger.valueOf(this.a);
        for(int i = 2; i <= this.b; i++) {
            result = result.multiply(val);
        }
//        System.out.println(result);
    }
}
