public class HugeMultiply {

    public static int[] multiply(int a[],int b[]){
        int c[] = new int[a.length+b.length];
        printArray(a);
        System.out.println();
        printArray(b);
        System.out.println();
        for (int i = a.length-1;i>=0;i--){
            for (int j = b.length-1;j>=0;j--){
                c[i+j+1]+=a[i]*b[j];
            }
        }

        for (int i = c.length-1;i>0;i--){
            c[i-1]=c[i-1]+(c[i]/10);
            c[i]=c[i]%10;
        }

        return c;
    }

    public static int[] add(int a[],int b[]){
        int c[] = new int[a.length+b.length];
        return c;
    }

    public static int[] stringToInt(String a){
        char[] chars = a.toCharArray();
        int b[] = new int[chars.length];
        for (int i = 0;i<b.length;i++){
            b[i] = Character.getNumericValue(chars[i]);
        }
        return b;
    }

    public static void printArray(int a[]){
        for (int x:a){
            System.out.print(x);
        }
    }

    public static void main(String[] args) {
        String x = "3141592653589793238462643383279502884197169399375105820974944592";
        String y = "2718281828459045235360287471352662497757247093699959574966967627";

        int[] a = stringToInt(x);
        int[] b = stringToInt(y);

        int[] c = multiply(a,b);

        printArray(c);
    }
}
