class MyNewThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am a Thread 1");
            // System.out.println("Thank You " + this.getName());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am a Thread 2");
            // System.out.println("Thank You " + this.getName());
            i++;
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        t1.start();
        // try {
        // t1.join();
        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println(e);
        // }
        t2.start();
    }
}