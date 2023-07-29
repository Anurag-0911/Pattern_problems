package Pattern;

import java.util.Scanner;

public class half_pyramid {

    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter max number of row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
