import java.util.Scanner;

public class Fibonacci {
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        long[] x = new long[n+1];
        x[0] = 0;
        x[1] = 1;
        for (int i = 2;i<=n;i++){
            x[i] = x[i-1] + x[i-2];
        }

        return x[n];

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
