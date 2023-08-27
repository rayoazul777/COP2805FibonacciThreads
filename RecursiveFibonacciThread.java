package cop2805;

public class RecursiveFibonacciThread extends Thread {
    private int n;

    public RecursiveFibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int result = fibonacci(n);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Recursive Fibonacci");
        System.out.println("Fibonacci number at index " + n + ": " + result);
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
    }

    private int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
