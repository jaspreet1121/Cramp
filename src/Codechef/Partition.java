package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Partition {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0;i<t;i++){
            String line =reader.readLine();
            int x = Integer.parseInt(line.split(" ")[0]);
            int n = Integer.parseInt(line.split(" ")[1]);
            int a = (x-1)-(((x-1)/4)*4);
            int b = (n-x)-(((n-x)/4)*4);
            if (x==1){
                if ((n-1)%4==0){
                    int[] numbers = new int[n+1];
                    fill(numbers,2,n);
                    printArray(numbers);
                }else {
                    System.out.println("impossible");
                }
            }
            /*else if (){

            }*/
            else if (a==b){
                int[] numbers = new int[n+1];
                int k = x - 1 - a;
                int l = n - x - b;
                fill(numbers,1,k);
                numbers[x] = 2;
                fill(numbers,n-l+1,n);
                if (a==1){
                    numbers[x-1]=0;
                    numbers[x+1]=1;
                    numbers[2]=0;
                    numbers[1]=1;
                }else if (a==2){
                    numbers[x-2]=0;
                    numbers[x-1]=1;
                    numbers[x+1]=1;
                    numbers[x+2]=0;
                }else if (a==3){
                    numbers[x-3]=0;
                    numbers[x-2]=1;
                    numbers[x-1]=0;
                    numbers[x+1]=1;
                    numbers[x+2]=1;
                    numbers[x+3]=0;
                    numbers[3]=0;
                    numbers[1]=1;
                }else;
                System.out.println(k + " " +(n-l));
                printArray(numbers);
                //System.out.println("possible");
            }else {
                System.out.println("impossible");
            }
        }
    }

    public static void fill(int a[],int start, int stop){
        int half = (start + stop - 1)/2;
        int on = 0;
        for (int i = start;i<=half;i++){
            a[i] = on;
            if (on == 0) on = 1;
            else on = 0;
        }
        if (on == 0) on = 1;
        else on = 0;
        for (int i = half+1;i<=stop;i++){
            a[i] = on;
            if (on == 0) on = 1;
            else on = 0;
        }
    }

    public static void printArray(int a[]){
        for (int i = 1;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }

}
