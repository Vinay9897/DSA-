package patterns;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        startMethod();
    }

    public static void startMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row size of the square: ");
        int row = scanner.nextInt();
        System.out.print("Enter the col size of the square: ");
        int col = scanner.nextInt();

        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j < col ; j++){
               if(j<col/2-i-1){
                   System.out.print(" ");
               }
               else if(j>=col/2-i && j<=col/2-i + i*2){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }
             System.out.println();
        }
        scanner.close();
    }
}
