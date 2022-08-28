import java.math.BigInteger;

public class FactorialUsingMultithreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = {110000, 120000, 100000, 90000, 110000, 120000, 100000, 90000};
//        int[] arr = {6, 7, 5, 2};
        MyThread[] threads = new MyThread[arr.length];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(arr[i]);
            threads[i].start();
            // if we write thread.join() here then main thread will wait till thread[i] will complete,
            // then only it will create thread[i+1] here.
        }

        for (int i = 0; i < threads.length; i++) {
            // Suppose, t1 -> 2sec, t2 -> 3sec, t3 -> 1sec, t4 -> 4sec (Condition we have 4 cores available
            // and all threads are running in parallel). Then max execution time will be
            // max(t1, t2, t3, t4)
            try {
                // join used -> stop until all threads is completed
                // join will only happen if thread is currently executing
                // If all threads are completed then it moves to the next statement
                threads[i].join();
                // This will wait for max 4 sec
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//        for (int i = 0; i < threads.length; i++) {
//            System.out.println(threads[i].result);
//        }
        // 1000 ms = 1 second
        System.out.println("Time in milli seconds : " + (System.currentTimeMillis() - start));
    }

    private static class MyThread extends Thread {
        private int num;
        private BigInteger result;

        public MyThread(int num) {
            this.num = num;
            this.result = BigInteger.ONE;
        }

        @Override
        public void run() {
            factorial();
        }

        public void factorial() {
            for(int i = 2; i <= this.num; i++) {
                BigInteger val = BigInteger.valueOf(i);
                this.result = result.multiply(val);
            }
        }
    }
}