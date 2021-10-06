import java.util.Scanner;
public class mahaasena {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n, lucky=0, unlucky=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i]%2==0)
                lucky++;
            else
                unlucky++;
        }
        if(lucky>unlucky)
            System.out.print("Ready For Battle");
        else
            System.out.print("Not Ready For Battle");

    }
}
