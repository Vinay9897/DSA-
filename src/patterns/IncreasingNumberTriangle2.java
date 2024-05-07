package patterns;

import java.util.Scanner;

public class IncreasingNumberTriangle2 {
    public static void main(String[] args) {
        startMethod();
    }

    public static void startMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row size of the square: ");
        int row = scanner.nextInt();

        for(int i = 1 ; i <= row; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" " + i + " ");
            }
             System.out.println();
        }
        scanner.close();
    }
}
