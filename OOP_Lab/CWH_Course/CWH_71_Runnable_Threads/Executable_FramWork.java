import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private String name;
    public Task(String s) {
        name = s;
    }

    public void run() {
        try {
            for(int i = 1; i  <= 5; i++) {
                System.out.println(name + " - task number - " + i);
                Thread.sleep(1000);
            }
            System.out.println(name + " completed!");
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Executable_FramWork {
    public static void main(String[] args) {
        Runnable r1 = new Task("task1");
        Runnable r2 = new Task("task2");
        Runnable r3 = new Task("task3");
        Runnable r4 = new Task("task4");
        Runnable r5 = new Task("task5");

        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.shutdown();
    }
}

