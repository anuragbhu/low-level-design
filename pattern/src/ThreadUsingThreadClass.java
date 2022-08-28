public class ThreadUsingThreadClass {
    public static void main(String[] args) {
        System.out.println("I'm in ThreadUsingThreadClass Class!");
        MyThread thread = new MyThread();

//         Two ways to start or run thread
//        thread.run(); // This will not help in achieving multi-threading. As no new call stack
//        is created for new thread. So, always use start method
        thread.start();
        thread.calculateSum();
        System.out.println("I'm in thread : " + Thread.currentThread().getName()
                +  ", thread-id : " + Thread.currentThread().getId() + " in main method");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // Whatever written here will be run on the separate thread
        // or calling from this function
        System.out.println("I'm in thread : " + currentThread().getName()
                +  ", thread-id : " + currentThread().getId() + " in run method");
        // Thread.sleep() method can be used to pause the execution of current thread for specified time
        // in milliseconds.
        // Any other thread can interrupt the current thread in sleep, in that case InterruptedException is thrown.
        try {
            Thread.sleep(10000); // 10 seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        calculateSum();
    }

    // If we call calculateSum() from run() (calling function) then it will run on the separate
    // thread. That is if you want to run anything in a thread then call using the run() function.
    // Always, calling function will be the deciding parameter on which thread it will run.
    public void calculateSum() {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("I'm in thread : " + currentThread().getName()
                +  ", thread-id : " + currentThread().getId() + " for Calculate Sum");
        System.out.println(sum + " using " + currentThread().getName());
    }
}
