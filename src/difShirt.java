import java.io.IOException;
import java.util.Scanner;

public class difShirt {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int k, l, count = 0;
        k = sc.nextInt();
        int a[] = new int[k];
        for (int i = 0; i < k; i++) {
            l = sc.nextInt();
            a[i] = l;
        }
        for (int i = 0; i < k; i++) {
            int val = a[i];
            for (int j = i + 1; j < k; j++) {           // C=[3, 2, 4, 1, 2, 3]
                if (val == a[j]) {
                    a[i] = 0;
                    a[j] = 0;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            if (a[i] != 0) {
                count = count + 1;
            }
        }
        System.out.print(count);
    }
}