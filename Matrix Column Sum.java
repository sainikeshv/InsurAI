PROGRAM:

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int mat[][]=new int[n][m];

       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
         mat[i][j]=sc.nextInt();
        }
       }
       for(int j=0;j<m;j++)
       {
       int sum=0;
       for(int i=0;i<n;i++)
       {
        sum+=mat[i][j];
       }
       System.out.println(sum);
       }
    }
}
