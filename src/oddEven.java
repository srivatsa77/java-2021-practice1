
    import java.util.*;
  import java.io.*;

    public class oddEven {
        public static void main(String args[]) throws IOException {
            Scanner sc = new Scanner(System.in);
            int  n, k, l;
                n = sc.nextInt();
                int a[] = new int[n];
                int even[] = new int[n];
                int odd[] = new int[n];
                for (int i = 0; i < n; i++) {
                    l = sc.nextInt();
                    a[i] = l;
                }
                for(int i = 0; i < n; i++) {
                    if (a[i] % 2 == 0)
                        even[i]=a[i];
                }
                for(int i = 0; i < n; i++) {
                    if (a[i] % 2 != 0)
                        odd[i]=a[i];
                }
                for(int i=0;i<n;i++){
                    if(even[i]!=0)
                    System.out.print(even[i]);
                }
                System.out.println();
                for(int i=0;i<n;i++){
                    if(odd[i]!=0)
                    System.out.print(odd[i]);
                }


            }
        }

