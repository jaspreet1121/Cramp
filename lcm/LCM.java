import java.util.*;

public class LCM {

  private static int gcd_naive(int a, int b) {
    if (a%b==0) return b;


    return gcd_naive(b,(a%b));
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = gcd_naive(a,b);
    long d = (((long) a) * b)/c;

    System.out.println(d);
  }
}
