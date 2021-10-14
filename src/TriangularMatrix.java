import java.io.IOException;
import java.util.Scanner;

public class TriangularMatrix {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, m, l, t;
        n = sc.nextInt();
        m = sc.nextInt();
        if (n == m) {
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    l = sc.nextInt();
                    a[i][j] = l;
                }
            }
            for (int i = 0; i < n; i++) {  //lower triangular matrix
                for (int j = 0; j < m; j++) {
                    if (j > i) {

                        System.out.print(0 + " ");
                    } else {
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < n; i++) {  //upper triangular matrix
                for (int j = 0; j < m; j++) {
                    if (j < i) {

                        System.out.print(0 + " ");
                    } else {
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}