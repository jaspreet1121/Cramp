
public class MergeSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = {1,4,5,9,8,2,6,3,7,8};
        MergeSort ob = new MergeSort();
        ob.sort(a,0,a.length-1);
        for(int i = 0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }


    void sort(int a[],int start,int end) {

        if(start<end) {
            int middle = (start+end)/2;
            sort(a,start,middle);
            sort(a,1+middle,end);

            merge(a,start,middle,end);
        }
    }

    void merge(int[] a,int l,int m,int r) {
        int n1 = m-l+1;
        int n2 = r-m;


        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i=0; i<n1; ++i)
            L[i] = a[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = a[m + 1+ j];

        int i = 0, j = 0,k=l;

        while(i<n1&&j<n2) {
            if(L[i]<=R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            a[k] = R[j];
            j++;
            k++;
        }

    }

}
