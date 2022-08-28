public class ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        System.out.println("I'm in ThreadUsingRunnableInterface Class!");
        MyThread1 o = new MyThread1();
        Thread thread = new Thread(o);

        thread.start();
        o.calculateSum();
        System.out.println("I'm in thread : " + Thread.currentThread().getName()
                +  ", thread-id : " + Thread.currentThread().getId() + " in main method");
    }
}

class MyThread1 extends Animal implements Runnable {
    // Only this method is present in Runnable
    @Override
    public void run() {
        System.out.println("I'm in thread : " + Thread.currentThread().getName()
                +  ", thread-id : " + Thread.currentThread().getId() + " in run method");
        calculateSum();
    }

    public void calculateSum() {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("I'm in thread : " + Thread.currentThread().getName()
                +  ", thread-id : " + Thread.currentThread().getId() + " for Calculate Sum");
        System.out.println(sum + " using " + Thread.currentThread().getName());
    }
}