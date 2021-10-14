import java.util.*;
import java.io.*;

public class MatrixOps {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int  n,m,l,t;
        n = sc.nextInt();
        m = sc.nextInt();
        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        int add[][] = new int[n][m];
        int mul[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                l = sc.nextInt();
                a[i][j] = l;
            }
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                t = sc.nextInt();
                b[i][j] = t;
            }
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                add[i][j]=0;
                add[i][j]=a[i][j]+b[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mul[i][j]=0;
                for(int k=0;k<m;k++){
                    mul[i][j]=a[i][k]*b[k][j] + mul[i][j]; //first k is used for shifting through cols then rows
                }
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}