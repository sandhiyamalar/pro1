import java.io.*;
import java.util.*;
class G17{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int b=n;
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum=sum+(temp*temp*temp);
            n=n/10;
        }
        if(b==sum){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
