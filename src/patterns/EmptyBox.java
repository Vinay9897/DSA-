package patterns;

import java.util.Scanner;

public class EmptyBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the box: ");
        int n = sc.nextInt();
        System.out.println("Enter the column size of the box: ");
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i%2 == 0 && (i == 0 || i == n-1)){
                    System.out.print("*");
                }
                else if(i % 2 ==0)
                {
                    if(j ==0 || j == m-1) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

