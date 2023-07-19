import java.util.Scanner;
public class MinRowMaxCol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                k=a[i][j];
                check(k);
            }
        }
    }
    static int check(int k){

    }
}
