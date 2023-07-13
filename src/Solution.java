import java.io.*;
import java.util.* ;
import java.util.Scanner;

public class Solution {

        public static void setZeros(int matrix[][]) {
            Scanner inp = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            int m=inp.nextInt();
            int n=inp.nextInt();
            int sam[][]=new int[m][n];
            for(int i=0; i<=m; i++){
                for(int j=0; j<=n; j++)
                {
                    sam[i][j]= sc.nextInt();

                }
            }


        }


}
