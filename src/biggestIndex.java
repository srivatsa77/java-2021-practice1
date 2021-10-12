import java.io.IOException;
import java.util.Scanner;

public class biggestIndex {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int k, l, t, count = 0;
        t = sc.nextInt();
        while (t-- != 0) {
            k = sc.nextInt();
            int a[] = new int[k];
            int b[] = new int[k];
            for (int i = 0; i < k; i++) {
                l = sc.nextInt();
                a[i] = l;
            }
            for (int y = 0; y < k; y++) {
                if (a[y] == 0) {
                    count = count + 1;
                }
            }
            if (count != k) {
                for (int i = 0; i < k; i++) {
                    if (a[i] == 1)
                        b[i] = 1;
                }
                for (int i = k - 1; i >= 0; i--) {
                    if (b[i] == 1)
                        System.out.print(i);
                    break;
                }
            }else{
                System.out.print(-1);
            }
        }
    }
}
