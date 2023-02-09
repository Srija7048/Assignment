import java.util.ArrayList;
import java.util.List;
import java.util.Lists;
import java.util.Scanner;
class Problem1 {
    public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        int reqsum;
        System.out.println("Enter the required number");
        reqsum=s.nextInt();
        //System.out.println(reqsum);
        Prime p=new Prime();
        List<Integer> arr=new ArrayList<Integer>();
        for (int i=2;i<reqsum;i++){
            if (p.checkprime(i)==true){
                arr.add(i);
            }
        }
        System.out.println(arr);
        int arrsum=0;
        for (int x:arr){
            arrsum=arrsum+x;
        }
        System.out.print(arrsum);
        int[] pr=new int[arr.size()];
        for (int i=0;i<arr.size();i++){
            pr[i]=arr.get(i);

        }
        Combinations c=new Combinations();
            //sum_up(new ArrayList<Integer>(Arrays.asList(arr)),reqsum);
        c.findSubsets(pr,reqsum);
    }
}