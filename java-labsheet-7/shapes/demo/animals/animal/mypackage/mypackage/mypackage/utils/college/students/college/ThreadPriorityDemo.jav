public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread low = new Thread(
            () -> printWork(), "Low"
        );

        Thread normal = new Thread(
            () -> printWork(), "Normal"
        );

        Thread high = new Thread(
            () -> printWork(), "High"
        );

        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();
    }

    static void printWork() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                Thread.currentThread().getName()
                + " priority="
                + Thread.currentThread().getPriority()
            );
        }
    }
}