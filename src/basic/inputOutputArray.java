import java.util.*;
import java.io.*;

public class inputOutputArray{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t,n,m,b;
        t=sc.nextInt();
        while(t--!=0){
            m=sc.nextInt();
            int a[] = new int[m];
            for(int i=0;i<m;i++){
                b=sc.nextInt();
                a[i]=b;
            }
            for(int i=0;i<m;i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();

        }
    }
}
