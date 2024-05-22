package Exercise5;

import java.util.*;
public class RemoveSmallest {
    Scanner in = new Scanner(System.in);
    final int LARGEST = 10;
//    int[] a =  new int[LARGEST];
    private ArrayList<Integer> a;

    public void addToArray(int scores){
        a.add(scores);
    }
    public void removeSmallest(int i){
        a.remove(i);
    }

}
