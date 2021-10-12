import java.util.*;
import java.io.*;
public class minAndMax {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n, l, t;
        t = sc.nextInt();
        while (t-- != 0) {
            n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                l = sc.nextInt();
                a[i] = l;
            }
            int min = a[0];
            for (int i = 0; i < n; i++) {
                if (min > a[i]) {
                    min = a[i];
                }
            }
            System.out.print(min + " ");
            int max = a[0];
            for (int i = 0; i < n; i++) {
                if (max < a[i]) {
                    max = a[i];
                }
            }
            System.out.print(max);
            System.out.println();
        }

    }
}
