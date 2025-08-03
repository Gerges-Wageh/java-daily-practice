package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Definition
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        // From list to array
        Integer[] fromList = list.toArray(new Integer[0]);
        for (Integer i : fromList) {
            System.out.println(i);
        }



    }
}
