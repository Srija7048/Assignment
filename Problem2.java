import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
class Problem2{
    public static void main(String args[]){
        int[] arr=new int[4];
        Scanner s=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println("enter the integer");
            arr[i]=s.nextInt();

        }
        Arrays.sort(arr);
        //for (int i:arr){
            //System.out.println(i);
        //}

        int[] d1=new int[arr.length/2];
        int[] d2=new int[arr.length/2];
        int c=0;
        for (int i=0;i<arr.length/2;i++){
            if (c%2==0){
                d1[i]=arr[2*i];
                d2[i]=arr[(2*i)+1];
                c=c+1;
            }
            else if (c%2==1){
                d1[i]=arr[(2*i)+1];
                d2[i]=arr[2*i];
                c=c+1;
            }
        }
        int[] res=new int[arr.length];
        for (int i=0;i<arr.length/2;i++)
        {
            //System.out.println(d1[i]);
            res[i]=d1[i];
            res[i+(arr.length/2)]=d2[i];
        }

        for (int i:res){
            System.out.print(i+" ");
        }
        //for (int i=0;i<d1.length;i++){
          //  System.out.println(d1[i]);

        //3
    
    }
}