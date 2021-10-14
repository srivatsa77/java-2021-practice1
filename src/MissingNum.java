import java.io.IOException;
import java.util.Scanner;

public class MissingNum {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int k, l, sum1 = 0, sum2 = 0;
        k = sc.nextInt();
        int a[] = new int[k];
        int b[] = new int[k];
        for (int i = 0; i < k - 1; i++) {                  //a  //1 6 5 4 2 7 = 25
            l = sc.nextInt();                                              //b  //1 2 3 4 5 6 7 =28
            a[i] = l;
            sum1 = sum1 + l;
        }
        for (int i = 0; i < k; i++) {
            b[i] = i + 1;
            sum2 = sum2 + i + 1;
        }
        System.out.println(sum2 - sum1);
    }
}
