import java.io.*;
import java.util.*;
public class G27{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        char[] c=str.toCharArray();
        int l=0;
        for(int i=0;i<c.length;i++){
            if(Character.isLetter(c[i]) )
                 l++;
        }
        if(l==0)
          System.out.print("yes");
         else
          System.out.println("no");
    }
}
