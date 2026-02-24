PROGRAM:

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
         arr[i]=sc.nextInt();
       }
       int key=sc.nextInt();
       int start=-1;
       int last=-1;
       for(int i=0;i<n;i++)
       {
        if(arr[i]==key)
        {
            start=i;
            break;
        }
    }
    for(int j=n-1;j>=0;j--)
    {
      if(arr[j]==key)
      {
        last=j;
        break;
      }
    }
    System.out.println(start+" "+last);
    }
}
