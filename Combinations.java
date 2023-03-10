import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Combinations{
    Combinations(){}
    public static void sumSubsets(int set[], int n, int target)
    {
        int x[] = new int[set.length];
        int j = set.length - 1;
        while (n > 0) {
            x[j] = n % 2;
            n = n / 2;
            j--;
        }
 
        int sum = 0;
        for (int i = 0; i < set.length; i++)
            if (x[i] == 1)
                sum = sum + set[i];

        if (sum == target) {
            System.out.print("(");
            for (int i = 0; i < set.length; i++)
                if (x[i] == 1)
                    System.out.print(set[i] + ", ");
            System.out.println(") ");
        }
    }
 
    public static void findSubsets(int[] arr, int K)
    {
        int x = (int)Math.pow(2, arr.length);
        for (int i = 1; i < x; i++)
            sumSubsets(arr, i, K);
    }

}