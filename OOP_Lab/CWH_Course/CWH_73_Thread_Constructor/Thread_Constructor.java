class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am a Thread");
            i++;
        }
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Nachiket");
        MyThread t2 = new MyThread("Rudra");
        t1.start();
        t2.start();
        System.out.println("The id of the Thread t1 is : " + t1.getId());
        System.out.println("The name of the Thread t1 is : " + t1.getName());
        System.out.println("The id of the Thread t2 is : " + t2.getId());
        System.out.println("The name of the Thread t2 is : " + t2.getName());
    }
}