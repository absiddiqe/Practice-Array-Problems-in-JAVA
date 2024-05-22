package Exexcise6;

import java.util.*;

public class Alternate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Enter numbers (enter a non-numeric value to stop):");
        while(in.hasNextInt()){
            num.add(in.nextInt());
        }
        int sum =  0;
        for (int i = 0; i < num.size(); i++){
            if (i % 2 == 0) {
                sum += num.get(i);
            } else {
                sum -= num.get(i);
            }
        }
        System.out.println(sum);
    }
}
