class MessagePrinter extends Thread {
    private String message;

    public MessagePrinter(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new MessagePrinter("Thread 1");
        Thread t2 = new MessagePrinter("Thread 2");

        t1.start();
        t2.start();
    }
}
