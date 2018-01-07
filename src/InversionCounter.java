import java.util.Scanner;

public class InversionCounter {
    public static void main(String[] args) {
        int[] a = new int[100000];

        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }


        System.out.println(invert(a));
    }

    static long invert(int a[]){
        long inv = 0;
        for (int i = 0;i<a.length;i++){
            for (int j = i;j<a.length;j++){
                if (a[i]>a[j]) inv++;
            }
        }
        return inv;
    }
}
