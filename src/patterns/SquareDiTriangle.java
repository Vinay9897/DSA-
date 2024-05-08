package patterns;

import java.util.Scanner;

public class SquareDiTriangle {
    public static void main(String[] args) {
        startMethod();
    }

    public static void startMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row size of the square: ");
        int row = scanner.nextInt();

        for(int i = 0 ; i < row; i++){

            for(int j = i;j<row;j++)
            {
                System.out.print("*");
            }

            for(int j = 0;j<2*i;j++)
            {

                System.out.print(" ");
            }
            for(int j = i;j<row;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i = 0 ; i < row; i++){

            for(int j = 0;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j = 0;j<row*2-2*i-2;j++)
            {

                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        scanner.close();
    }
}
