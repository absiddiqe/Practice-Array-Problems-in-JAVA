package FirstArray;

import java.util.Scanner;

public class InitArray {
    public static void main(String[] args) {
        final int LENGTH =  10;
        int[] arr = new int[LENGTH];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Any Ten Numbers");
        for (int i = 0; i < LENGTH; i++){
            arr[i] = in.nextInt();
        }
        for (int i = LENGTH - 1; i >=0 ;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
