package patterns;

import java.util.Scanner;

public class DecresingNumber {
    public static void main(String[] args) {
        startMethod();
    }

    public static void startMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row size of the square: ");
        int row = scanner.nextInt();

        for(int i = 1 ; i <= row; i++){
            for(int j = 1 ; j <=row-i+1 ; j++){
                System.out.print(" "+ j+ " ");
            }
             System.out.println();
        }
        scanner.close();
    }
}
