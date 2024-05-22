package Exercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Enter numbers (enter a non-numeric value to stop):");
        while(in.hasNextInt()){
            a.add(in.nextInt());
        }
        for (int i = a.size() - 1; i >= 0; i--){
            System.out.println(a.get(i));
        }
    }
}
