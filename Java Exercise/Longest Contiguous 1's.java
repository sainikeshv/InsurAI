
PROGRAM:
import java.io.*;
import java.util.*;

public class longest {

    public static void main(String[] args) {
    
       Scanner sc=new Scanner(System.in);
       int count=0;
       int maxlen=0;
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
       arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
         if(arr[i]==1)
         {
            count++;
         }
         else
         {
            if(maxlen<count)
            {
                maxlen=count;
            }
            count=0;
         }
         
       }
       System.out.println(Math.max(maxlen,count));
    }
}
