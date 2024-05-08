package patterns;

import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ending character : ");
        char ch = sc.next().charAt(0);
        for (char i =  'a';i<= ch;i++)
        {
            for (char j = 'a';j<= i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
