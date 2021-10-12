import java.util.*;
import java.io.*;

public class scalarMul {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int  n,m,l,t;
        n = sc.nextInt();
        m = sc.nextInt();
        t = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                l = sc.nextInt();
                a[i][j] = l;
            }
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                a[i][j]=a[i][j]*t;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}