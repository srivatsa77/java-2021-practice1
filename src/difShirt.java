import java.io.IOException;
import java.util.Scanner;

public class difShirt {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int k, l;
        k = sc.nextInt();
        int a[] = new int[k];
        for (int i = 0; i < k; i++) {
            l = sc.nextInt();
            a[i] = l;
        }
        int finalCount = 0;
        for (int i = 0; i < k; i++) {
            int val = a[i];
            int count = 0;
            for (int j = 0; j < k; j++) {           //a=[3, 2, 4, 1, 2, 3]
                if (val == a[j]) {
                    count = count + 1;
                }
            }
            if (count == 1) {
                finalCount = finalCount + 1;
            }
        }
        System.out.print(finalCount + " ");
    }
}