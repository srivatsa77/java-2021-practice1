import java.io.IOException;
import java.util.Scanner;

public class greaterRent {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int k, l, t;
        t = sc.nextInt();
        while (t-- != 0) {
            k = sc.nextInt();
            int a[] = new int[k];
            for (int i = 0; i < k; i++) {
                l = sc.nextInt();
                a[i] = l;
            }
            for (int i = 0; i < k; i++) {
                if (i == 0) {
                    if (a[i] > a[i + 1])
                        System.out.print(i + " ");
                } else if (i == k - 1) {
                    if (a[i] > a[i - 1])
                        System.out.print(i + " ");
                } else if (a[i] > a[i + 1] & a[i] > a[i - 1]) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}