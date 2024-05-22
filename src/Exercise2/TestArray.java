package Exercise2;

import java.util.Random;

public class TestArray {
    public static void main(String[] args) {
        final int LENGTH = 10;
        int[] arr = new int[LENGTH];
        Random in =  new Random();
        for (int i = 0; i < LENGTH; i++){
            arr[i] = in.nextInt(1000);
        }
        System.out.println("Actual Array ");
        for (int i = 0; i < LENGTH ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Every element at an even index.");
        for (int i = 0; i < LENGTH; i+=2)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Every even element.");
        for (int i = 0 ; i < LENGTH ; i++){
            if(arr[i] % 2 ==0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("All elements in reverse order . ");
        for (int i = LENGTH - 1; i >=0 ;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Only the first and last element.");
        System.out.println(arr[0] + " " + arr[LENGTH - 1]);
    }
}
