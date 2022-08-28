public class BankSynchronization {
    public static void main(String[] args) {
        Bank account1 = new Bank(1, 100);
        Bank account2 = new Bank(2, 300);

        MyThread[] myThread = new MyThread[6];
        myThread[0] = new MyThread(account1, true, 50);
        myThread[1] = new MyThread(account1, false, 100);
        myThread[2] = new MyThread(account1, true, 250);
        // Account1 amount will be 300

        myThread[3] = new MyThread(account2, false, 100);
        myThread[4] = new MyThread(account2, true, 350);
        myThread[5] = new MyThread(account2, false, 150);
        // Account2 amount will be 400

        for (MyThread thread : myThread) {
            thread.start();
        }

        for (MyThread thread : myThread) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Amount in account1 is " + account1.getBalance());
        System.out.println("Amount in account2 is " + account2.getBalance());
    }

    public static class MyThread extends Thread {

        final private Bank obj;
        boolean isDeposit;
        final private int amount;

        public MyThread(Bank obj, boolean isDeposit, int amount) {
            this.obj = obj;
            this.isDeposit = isDeposit;
            this.amount = amount;
        }

        @Override
        public void run() {
            if(isDeposit) {
                deposit();
            } else {
                withdraw();
            }
        }

        public void deposit() {
            // lock can be applied based on class or object level (choice is on you)
            // synchronized (Bank.class) {
            // one thread of a class is allowed to run when we use class level lock
            // one thread of an object is allowed to run when we use object level lock
            synchronized (this.obj) {
                System.out.println("I'm in : " + currentThread().getName() + " for account " +
                        this.obj.getAccountNumber());
                this.obj.setBalance(this.obj.getBalance() + this.amount);
                // to understand the execution pattern or to make observation.
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public void withdraw() {
            synchronized (this.obj) {
                System.out.println("I'm in : " + currentThread().getName() + " for account " +
                        this.obj.getAccountNumber());
                this.obj.setBalance(this.obj.getBalance() - this.amount);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}


