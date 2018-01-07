import java.util.*;
import java.io.*;

class Max {
    static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int max =0;int max2 = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            if(numbers[i]>max){
                max2 = max;
                max = numbers[i];
                continue;
            }
            if (numbers[i]>max2){
                max2 = numbers[i];
            }
            //System.out.println(max +" "+max2);
        }
        result = ((long)max) * ((long)max2);
        return result;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}