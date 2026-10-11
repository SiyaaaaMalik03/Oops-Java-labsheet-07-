public class RunnableDemo implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableDemo());
        t.start();
    }
}