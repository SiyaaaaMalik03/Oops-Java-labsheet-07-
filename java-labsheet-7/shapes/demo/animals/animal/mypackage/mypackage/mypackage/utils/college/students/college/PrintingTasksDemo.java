public class PrintingTasksDemo {
    public static void main(String[] args) {
        Thread report = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                    "Report task: preparing page " + i
                );
            }
        }, "ReportThread");

        Thread invoice = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                    "Invoice task: processing item " + i
                );
            }
        }, "InvoiceThread");

        report.start();
        invoice.start();
    }
}