    import java.util.*;
  import java.io.*;

    public class findMinimum {
        public static void main(String args[]) throws IOException {


            Scanner sc = new Scanner(System.in);
            int n, l, t;
            t = sc.nextInt();
            while (t-- != 0) {
                int index = 0;
                n = sc.nextInt();
                int a[] = new int[n];
                for (int i = 0; i < n; i++) {
                    l = sc.nextInt();
                    a[i] = l;
                }
                int min = a[0];
                for (int i = 0; i < n; i++) {
                    if (min > a[i]) {
                        min = a[i];
                        index = i;
                    }
                }
                System.out.println(index);
            }
        }
    }

