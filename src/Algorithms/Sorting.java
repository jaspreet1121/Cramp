package Algorithms;

public class Sorting {


    public void enhancedBubbleSort(int a[]){
        int pass,i,temp;
        Boolean swapped = true;
        for (pass = a.length;pass>=0 && swapped;pass --){
            swapped = false;
            for (i = 0;i<=pass-1;i++){
                if (a[i]>a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;

                    swapped = true;
                }
            }
        }
    }

    public void selectionSort(int a[]){
        int i,j,min,temp;
        for (i = 0;i<a.length;i++){
            min = i;
            for (j = i+1;j<a.length;j++){
                if (a[j]<a[min])
                    min = j;
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public void insertionSort(int[] a){
        int i,j,v;
        for (i = 1;i<a.length;i++){
            v = a[i];
            for (j = i;a[j-1]>v&&j>=1;j--){
                a[j-1]=a[j];
            }
            a[j]=v;
        }
    }



}
