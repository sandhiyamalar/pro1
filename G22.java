import java.io.*;
import java.util.*;
public class G22{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min)
               min=a[i];
        }
        System.out.print(min);
    }
}

