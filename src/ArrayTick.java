public class ArrayTick {
    public static void main(String[] args) {
        int[] b = {1,5,8,3,6};
        shift(b);

        printArray(b);
    }

    public static void printArray(int a[]){
        for (int x:a){
            System.out.print(x);
        }
    }

    public static void invertElement(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void shift(int a[]){
        invertElement(a,0,1);
        invertElement(a,4,3);
    }
}
