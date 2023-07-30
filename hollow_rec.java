package Pattern;

import java.util.Scanner;

public class hollow_rec {

    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter max number of row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= (row + 1); j++) {
                if (i == 1 || j == 1 || i == row || j == (row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                }
                System.out.println();
            }
        }
    }

