package Pattern;

import java.util.Scanner;
public class Floyds_triangle {
    public static void main(String[] args) {
        int i, j;
        int k = 1;
        System.out.println("Enter max number of row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

    }
}
