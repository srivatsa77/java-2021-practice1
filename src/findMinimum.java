    import java.util.*;
  import java.io.*;

    public class findMinimum {
        public static void main(String args[]) throws IOException {

            Scanner sc = new Scanner(System.in);
            int  n,l;
            n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int even[] = new int[n];
            int odd[] = new int[n];
            for (int i = 0; i < n; i++) {
                l = sc.nextInt();
                a[i] = l;
            }
            for(int i=0;i<n;i++){
                b[i]=a[i];
            }
            for(int i=0;i<n;i++){
                int x;
                if(a[i]>a[i+1]){
                    x=a[i];
                    a[i]=a[i+1];
                    a[i+1]=x;
                }
                for(int j=0;j<n;j++){
                    if(b[j]==a[0]){
                        System.out.println(j);
                    }
                }
            }

        }
    }

