package recursion;

import java.util.ArrayList;

public class Factorial {

    static long val = 1;

    static ArrayList<Long> arr = new ArrayList<Long>();


    public static void main(String[] args) {
        factorialMethod(1);
        for(Long list : arr) {
            System.out.print(list + " ");
        }
    }

    private static ArrayList<Long> factorialMethod(int N) {

            if(arr.size() ==0)
            {
                arr.add(val);
                if(N==1)
                    return arr;
            }
            else{
            val = arr.get(arr.size()-1) * (arr.size()+1);
            if(val>N)
                return arr;
            else
                arr.add(val);

            }
            return factorialMethod(N);
    }
}
