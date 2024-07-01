class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am a Thread");
            System.out.println("Thank You " + this.getName());
            i++;
        }
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Nachiket(Most VIP Person)");
        MyThread t2 = new MyThread("Rudra");
        MyThread t3 = new MyThread("Akshay");
        MyThread t4 = new MyThread("Karan");
        MyThread t5 = new MyThread("Het");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}