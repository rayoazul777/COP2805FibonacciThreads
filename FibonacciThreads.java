package cop2805;

public class FibonacciThreads {
    public static void main(String[] args) {
        int n = 40; // Fibonacci index to calculate

        RecursiveFibonacciThread recursiveThread = new RecursiveFibonacciThread(n);
        DynamicFibonacciThread dynamicThread = new DynamicFibonacciThread(n);

        recursiveThread.start();
        dynamicThread.start();
    }
}
