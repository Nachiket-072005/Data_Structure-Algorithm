class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Thread 1 is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Thread 2 is good");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class Thread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.run();
        t2.run();
    }
}