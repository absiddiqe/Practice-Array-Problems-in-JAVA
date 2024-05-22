package Exercise3;

import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        final int LARGEST = 10 ;
        int[] arr = new int[LARGEST];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers ");
        for (int i = 0; i < LARGEST ; i++ ){
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int j = 0; j < LARGEST; j++){
            if(arr[j] > max)
                max = arr[j];
            if (arr[j] < min)
                min = arr[j];
        }
        System.out.println("Min Element :" + " " + min);
        System.out.println("Max Element :" + " " + max);
    }
}
