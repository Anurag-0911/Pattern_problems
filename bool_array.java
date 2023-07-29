package Pattern;

import java.util.*;
public class bool_array {
    public static void main(String args[]) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ascend = true;
        for (int i = 0; i < arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                ascend = false;
            }
        }
        if (ascend == true){
            System.out.println("Array is sorted in ascending order.");
        }
        else
        {
            System.out.println("Array is not sorted in ascending order.");
        }
    }
}