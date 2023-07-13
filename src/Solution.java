
import java.util.Scanner;

public class Solution {

        public static void main(String args[]) {
            Scanner inp = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            int m=inp.nextInt();
            int n=inp.nextInt();
            int sam[][]=new int[m][n];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++)
                {
                    sam[i][j]= sc.nextInt();

                }
            }
            int a[][]= new int[m][n];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++) {         //a=1all
               a[i][j]=1;
                }}
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){         //a=0forallSam=0
                    if(sam[i][j]==0){
                        a[i][j]=0;
                    }
                }}
            for(int x=0; x<m; x++){
                System.out.println();          //printmatrix
                for(int y=0; y<n; y++){
                    System.out.print(sam[x][y]);
                }
            }
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++) {
                    if (sam[i][j] == 0) {
                    for(int k=0;k<n;k++){            //travel row
                        a[i][k]=0;
                    }
                    }
                }
            }
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++) {
                    if (sam[i][j] == 0) {
                        for(int k=0;k<m;k++){            //travel col
                            a[k][j]=0;
                        }
                    }
                }
            }

            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){         //sam=0forall a=0
                    if(a[i][j]==0){
                        sam[i][j]=0;
                    }
                }}
            for(int x=0; x<m; x++){
                System.out.println();
                for(int y=0; y<n; y++){
                    System.out.print(sam[x][y]);
                }
            }
        }


}
