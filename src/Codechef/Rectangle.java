package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0;i<t;i++){
            String a[] = reader.readLine().split(" ");
            int b[] = new int[4];
            for (int j = 0;j<4;j++){
                b[j] = Integer.parseInt(a[j]);
            }

            rect(b);
        }
    }

    public static void rect(int a[]){
        if (sum(a)%2==0){
            int i;
            for (i = 1;i<=3;i++){
                if (a[i]==a[0]) break;
            }
            int x,y;
            switch (i){
                case 1:
                    x = 2;y = 3;
                    break;
                case 2:
                    x = 1;y = 3;
                    break;
                case 3:
                    x = 1;y = 2;
                    break;
                default:
                    System.out.println("NO");
                    return;
            }
            if (a[x]!=a[y]) System.out.println("NO");
            else System.out.println("YES");

            return;

        }else {
            System.out.println("NO");
        }
    }

    public static int sum(int a[]){
        int total = 0;
        for (int i = 0;i<a.length;i++){
            total += a[i];
        }
        return total;
    }
}
