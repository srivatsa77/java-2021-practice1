  import java.util.*;
  import java.io.*;
    public class ComparingNums {
        public static void main(String args[]) throws IOException {
            Scanner sc = new Scanner(System.in);
            int t, n, k, l;
            t = sc.nextInt();
            while (t-- != 0) {
                n = sc.nextInt();
                int a[] = new int[n];
                k = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    l = sc.nextInt();
                    a[i] = l;
                }
                int lessThan = 0;
                int greaterThan = 0;
                int equalsTo = 0;
                for (int i = 0; i < n; i++) {

                    if (a[i] < k) {
                        lessThan = lessThan + 1;
                    }
                    if (a[i] > k) {
                        greaterThan = greaterThan + 1;
                    }
                    if (a[i] == k) {
                        equalsTo = equalsTo + 1;
                    }
                }
                System.out.print(lessThan + " ");
                System.out.print(greaterThan + " ");
                System.out.print(equalsTo + " ");
                System.out.println();
            }
        }
    }