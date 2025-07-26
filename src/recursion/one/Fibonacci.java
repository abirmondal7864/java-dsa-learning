package recursion.one;

public class Fibonacci {
    public static int printFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return printFibonacci(n - 1) + printFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println("Print fibonacci series upto "+n+" terms");
        for (int i = 0; i < n; i++) {
            int fib = printFibonacci(i);
            System.out.print(fib+" ");
        }

    }
}
