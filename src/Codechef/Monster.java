package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Monster {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] health = new int[n];
        String temp1 = reader.readLine();
        String[] temp = temp1.split(" ");
        for (int i = 0;i<n;i++){
            health[i] = Integer.parseInt(temp[i]);
        }
        int actions = Integer.parseInt(reader.readLine());
        for (int i = 0;i<actions;i++){
            String[] kill = reader.readLine().split(" ");
            int x = Integer.parseInt(kill[0]);
            int y = Integer.parseInt(kill[1]);
            for (int j = 0;j<health.length;j++){
                if (((x&j)==j)&&(health[j]>0))
                    health[j] = health[j] - y;
            }
            printArray(health);
            calculate(health);
        }
    }

    public static void calculate(int a[]){
        int alive = 0;
        for (int i = 0;i<a.length;i++){
            if (a[i]>0) alive++;
        }
        System.out.println(alive);
    }

    public static void printArray(int a[]){
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
