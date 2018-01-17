package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumScore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for (int i =0 ;i<t;i++){
            long sum = 0;
            int n = Integer.parseInt(reader.readLine());
            String[] block = new String[n];
            for (int j = 0;j<n;j++){
                block[j] = reader.readLine();
            }
            int lastMax = Integer.MAX_VALUE;
            Boolean possible = true;
            for (int j = n-1;j>=0;j--){
                int a[] = new int[n];
                String[] line  = block[j].split(" ");
                for (int k = 0;k<n;k++){
                    a[k] = Integer.parseInt(line[k]);
                }
                lastMax = lessMax(a,lastMax);
                if (lastMax==Integer.MIN_VALUE){
                    possible = false;
                    break;
                }
                sum += lastMax;
            }
            if (possible==true){
                System.out.println(sum);
            }else {
                System.out.println(-1);
            }
        }
    }

    public static int lessMax(int a[], int x){
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<a.length;i++){
            if (a[i]>max&&a[i]<x){
                max = a[i];
            }
        }
        return max;
    }
}
