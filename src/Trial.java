import java.util.Random;

public class Trial {

    public static void main(String [] args){
        /*
        double[][] x = {{2,3},
                        {1,4}};
        double[][] y = {{1,7},
                        {2,8},
                        {3,4}};

        Random rn = new Random();


        //System.out.println(x[0].length);

        Matrix a = new Matrix(x);
        Matrix b = new Matrix(y);

        Matrix c = Matrix.multiply(b,(double)9);

        //c.printMatrix();

        //System.out.println(rn.nextGaussian());

        KalmanFilter.Kalman(1.0,0,0,9.8);
        KalmanFilter.Kalman(1.0,0,1,9.4);
        KalmanFilter.Kalman(1.0,0,2,9.2);
        KalmanFilter.Kalman(1.0,0,3,8.8);
        */

        int a[] ={8};
        int b[] ={7};
        int c[] = HugeMultiply.multiply(a,b);
        System.out.print(c[0]+""+c[1]);

    } }
