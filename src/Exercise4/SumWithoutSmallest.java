package Exercise4;

import java.util.Scanner;

public class SumWithoutSmallest {
    public static void main(String[] args) {
        final int LARGEST = 10;
        int Smallest = 10000000;
        int sum = 0;
        int[] arr = new int [LARGEST];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Numbers :");
        for (int i = 0; i < LARGEST ; i++){
            arr[i] = in.nextInt();
            sum = sum + arr[i];
            if(arr[i] < Smallest)
                Smallest = arr[i];
        }
        System.out.println("Final Sum is : " + (sum - Smallest));
    }
}
