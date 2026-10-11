public class SleepDemo {
    public static void main(String[] args) {
        Thread sleeper = new Thread(() -> {
            try {
                System.out.println("Sleeper: going to sleep.");
                Thread.sleep(2000);
                System.out.println("Sleeper: awake after 2 seconds.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread worker = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Worker: " + i);
            }
        });

        sleeper.start();
        worker.start();
    }
}