package patterns;

import java.util.Scanner;

public class SquareStar2 {
    public static void main(String[] args) {
        startMethod();
    }

    public static void startMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row size of the square: ");
        int row = scanner.nextInt();
        System.out.print("Enter the column size of the square: ");
        int col = scanner.nextInt();
        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(" * ");
            }
             System.out.println("");
        }
        scanner.close();
    }
}
