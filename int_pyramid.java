package Pattern;

import java.util.Scanner;

public class int_pyramid {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter max number of row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for( i=1; i<=row; i++) {
            for(j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
