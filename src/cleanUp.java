import java.util.Scanner;
public class cleanUp {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,m,k,t;    //m-finished jobs,n-total jobs,t-testcases
    System.out.println("Give number of test cases");
    t=sc.nextInt();
       while(t--!=0);{
           System.out.println("Give total number of jobs ");
           n=sc.nextInt();
           System.out.println("Give total number of finished jobs ");
           m=sc.nextInt();
           int a[]= new int[n+1];
           int b[]= new int[n-m];
           System.out.println("Give finished jobs ");
           for(int i=0;i<m;i++){
               k=sc.nextInt();
               a[k]=1;
           }
           k=0;
           for(int i=1;i<=n;i++){
               if(a[i]==0){
                   b[k++]=i;
               }
           }
           for(int i=0;i<n-m;i=i+2){
               System.out.print(b[i] + " ");
            }  System.out.println();
            for(int i=1;i<n-m;i=i+2){
                System.out.print(b[i] + " ");
            }   System.out.println();
        }
    }
}

