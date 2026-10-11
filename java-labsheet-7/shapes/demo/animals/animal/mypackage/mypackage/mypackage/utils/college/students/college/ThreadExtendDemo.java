public class ThreadExtendDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message " + i);
        }
    }

    public static void main(String[] args) {
        ThreadExtendDemo t = new ThreadExtendDemo();
        t.start();
    }
}