public class ThreadLifeCycleDemo {
    public static void main(String[] args)
            throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(500);
                System.out.println("Thread task is running.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("After creation: " + t.getState());

        t.start();
        System.out.println("After start: " + t.getState());

        Thread.sleep(100);
        System.out.println("During sleep: " + t.getState());

        t.join();
        System.out.println("After completion: " + t.getState());
    }
}