  import java.util.*;
  import java.io.*;
    public class comparingNums {
        public static void main(String args[]) throws IOException {
            Scanner sc= new Scanner(System.in);
            int t,n,k,l;
            t=sc.nextInt();
            while(t--!=0){
                n=sc.nextInt();
                int a[]= new int[n];
                k=sc.nextInt();
                for(int i=0;i<n;i++){
                    l=sc.nextInt();
                    a[i]=l;
                }
                int count1=0;
                int count2=0;
                int count3=0;
                for(int i=0;i<n;i++){
                    if(a[i]<k){
                        count1=count1+1;
                        if(a[i]>k)
                            count2=count2+1;
                        else
                            count3=count3+1;
                    }
                }
                System.out.print(count1 + " ");
                System.out.print(count2 + " ");
                System.out.print(count3 + " ");
                System.out.println();
            }
        }
    }