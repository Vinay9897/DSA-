package recursion;

public class PrintNumbers {

    static int i  = 1;
    public static void main(String[] args) {
        int n= 5;
        printNumber(n);
    }

    private static void printNumber(int n) {

        System.out.print(i +" ");
        if(i == n)
            return ;
        i++;
        printNumber(n);

    }
}
