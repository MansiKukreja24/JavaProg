import java.io.*;
import java.util.*;


public class Sort011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                c++;

        }
        for(int i=0;i<c;i++)
            System.out.print("0"+" ");

        for(int i=c;i<n;i++)
            System.out.print("1"+" ");
    }}
