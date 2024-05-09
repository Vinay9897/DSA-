package patterns;

import java.util.Scanner;

public class DecreasingNumberSquare {
    public static void main(String[] args) {

        helperMethod();
    }

    private static void helperMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int row = (num-1)*2+1;
        int col = (num-1)*2+1;

        for(int i = 0; i < row; i++) {
            int val = num;
            for(int j = 0; j < col; j++) {
                if(i<=row/2) {

                    if(j>=i && j<row-i){
                        System.out.print(val+" ");
                    }
                    else if(j<i){
                        System.out.print(val-- + " ");
                    }
                    else if(j>=row-i){
                        System.out.print(++val + " ");
                    }
                }
                else {

                    if(j>=row-i-1 && j<=i){
                        System.out.print(val+ " ");
                    }
                    else if(j<row/2){
                        System.out.print(val-- + " ");
                    }
                    else if(j>row-row-i){
                        System.out.print(++val + " ");
                    }

                }

            }
            System.out.println();
        }
        sc.close();
    }
}
