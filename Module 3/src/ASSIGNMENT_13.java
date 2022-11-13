class ThreadingDemo implements Runnable {
    public void run() {
        try {
            System.out.println("Thread " +
                    Thread.currentThread().getName() + " is running");
        } catch (Exception e) {
            System.out.println("Threading exception");}
    }
}
public class ASSIGNMENT_13 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            ThreadingDemo t0 = new ThreadingDemo();
            Thread t = new Thread(t0);
            t.start();
        }
    }
}


