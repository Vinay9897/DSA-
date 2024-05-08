package patterns;

import java.util.Scanner;

public class DecreasingAlphabetTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting character : ");
        char ch = sc.next().charAt(0);
        for (char i = ch;i>= 'a';i--)
        {
            for (char j = 'a';j<= i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
