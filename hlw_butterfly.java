package Pattern;

import java.util.Scanner;

public class hlw_butterfly {


    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter max number of row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = row; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (i == 1 || j == 1 && (i+j) <= row || j == (row + 1)){
                System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
