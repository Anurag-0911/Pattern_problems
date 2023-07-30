package Pattern;

import java.util.Scanner;
public class pattern {
    public static void main(String[]args)
    {
        int i,j;
        System.out.println("Enter max number of row");
        Scanner sc = new Scanner(System.in);
                int row = sc.nextInt();
                for (i = 1;i <= row;i++) {
                    for (j = 1; j <= (row + 1); j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
    }
}
