package cop2805;

public class DynamicFibonacciThread extends Thread {
    private int n;

    public DynamicFibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int result = fibonacci(n);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Dynamic Fibonacci");
        System.out.println("Fibonacci number at index " + n + ": " + result);
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
    }

    private int fibonacci(int n) {
        int v1 = 0, v2 = 1, v3 = 0;
        for (int i = 2; i <= n; i++) {
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
        }
        return v3;
    }
}

