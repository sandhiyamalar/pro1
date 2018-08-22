import java.io.*;
import java.util.*;
class G16{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					count=0;
					break;
				}
				else{
					count=1;
				}
			}
			if(count==1){
				System.out.print(i+" ");
			}
			else if(i==2)
			   System.out.print(i+" ");
			count=0;
        }
    }
}
