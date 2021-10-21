import java.io.IOException;
import java.util.Scanner;

public class MissingNum {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- != 0) {
            int k, l, sum1 = 0, sum2 = 0, sum;
            k = sc.nextInt();
            int a[] = new int[k-1];
            int b[] = new int[k];
            for (int i = 0; i < k - 1; i++) {                                  //a  //1 3 4 = 8
                l = sc.nextInt();                                              //b  //1 2 3 4 =10
                a[i] = l;
                sum1 = sum1 + l;
            }
            for (int j = 0; j < k; j++) {
                b[j] = j+1;
                sum2 = sum2 + b[j];

            }

            System.out.println(sum2-sum1);
        }
    }
}
