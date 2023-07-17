import com.rgl.singleton.Singleton;

public class Main implements Runnable {

    @Override
    public void run() {

        Singleton s = Singleton.getInstance();
        long threadId = Thread.currentThread().getId();
        System.out.println("Thread " + threadId + " com.rgl.singleton.Singleton " + s);
        System.out.println("Thread " + threadId + " " + s.singletonClassMethod());
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        Main m2 = new Main();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }


}