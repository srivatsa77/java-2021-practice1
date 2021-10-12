import java.io.IOException;
import java.util.Scanner;

public class biggestIndex {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int k, l, t;
        t = sc.nextInt();
        while (t-- != 0) {
            k = sc.nextInt();
            int a[] = new int[k];
            int b[] = new int[k];
            for (int i = 0; i < k; i++) {
                l = sc.nextInt();
                a[i] = l;
            }
            for (int i = 0; i < k; i++) {
                if (a[i] == 1)
                    b[i] = 1;
            }
            for (int i = k - 1; i < k; i--) {
                if (b[i] == 1)
                    System.out.print(i);
            }
        }
    }
}