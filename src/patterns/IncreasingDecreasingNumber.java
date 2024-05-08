package patterns;

import java.util.Scanner;

public class IncreasingDecreasingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int row = sc.nextInt();
        int col = row*2;
        for (int i = 0; i < row; i++) {
            int val = 1;
            for (int j = 0; j <col; j++) {
                if(j<=i)  // val is increasing with until column less than or equal to row
                {
                    System.out.print(val++);
                }
                else if(j>i && j <=col-((i+1)*2)+i){ // for space  column length minus i*2 for each rows

                    System.out.print(" ");
                }
                else if(j<col){
                    System.out.print(--val ); // val is decreasing until column is less than or equal to column length
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
