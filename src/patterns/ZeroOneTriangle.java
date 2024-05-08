package patterns;

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the triangle: ");
        int rowSize = sc.nextInt();
        for (int row = 0; row < rowSize; row++) {
            int val = -1;
            if(row%2==0){
                val = 1;
            }
            else{
                val = 0;
            }
            for (int column = 0; column <= row; column++) {

                System.out.print(val + " ");
                val = 1-val;
            }
            System.out.println();
        }


    }
}
