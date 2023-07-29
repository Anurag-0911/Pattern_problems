package Pattern;

import java.util.Scanner;

public class binary_tri {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter max number of row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }

    public static class Binary_search {
        public static int b_s(int val[],int low,int high,int key){
            int mid=low+(high-low)/2;
            if (low==high){
                if (val[low]==key){
                    return low;
                }
            }
            else {
                if (key==val[mid]){
                    return mid;
                }
                if(val[mid]>key){
                    return b_s(val,low,mid-1,key);
                }
                else {
                return b_s(val, mid + 1, high, key);
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            System.out.println("Enter the number of elements:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            System.out.println("Enter the elements:");
            int val[] = new int[size];
            for (int i=0;i<size;i++){
                val[i] = sc.nextInt();
            }
            for (int i=0;i<size;i++){
                System.out.print(val[i]+" ");
            }
            System.out.println(" ");
            int low=0;
            int high=val.length-1;
            System.out.println("Enter the element you want to search:");
            int key = sc.nextInt();
            int result=b_s(val,low,high,key);
            if (result==-1)
                System.out.println("Not found");
            else
                System.out.println("Found at "+result);
        }
    }
}
