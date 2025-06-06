class NumberPrinter {
    private int number = 1;
    private final int MAX = 5;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try {
                    wait(); // wait for even to print
                } catch (InterruptedException e) {
                 }} else {
                System.out.println("Odd Thread: " + number);
                number++;
                notify(); // notify even thread
            }
        }
    }
 public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                try {
                    wait(); // wait for odd to print
                } catch (InterruptedException e) {
                }
            } else {
                System.out.println("Even Thread: " + number);
                number++;
                notify(); // notify odd thread
            }
        }
    }
}

public class MultiThread6 {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread t1 = new Thread(() -> printer.printOdd());
        Thread t2 = new Thread(() -> printer.printEven());

        t1.start();
        t2.start();
    }
}


