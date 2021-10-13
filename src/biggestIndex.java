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
            int lastIndex = -1;
            for (int y = a.length - 1; y >= 0; y--) {       //0 0 0 1 0 1 1 0
                if (a[y] == 1) {
                    lastIndex = y;
                    break;
                }
            }
            System.out.println(lastIndex);
        }
    }
}
