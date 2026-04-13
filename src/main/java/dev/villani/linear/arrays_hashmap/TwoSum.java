package dev.villani.linear.arrays_hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //complexidade de tempo é O(n)
    //complexidade de espaço é O(n)
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) return nums;

        Map<Integer, Integer> valueIndexMap = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int missingForResult = target - nums[i];
            if (valueIndexMap.containsKey(missingForResult)) {
                return new int[]{i, valueIndexMap.get(missingForResult)};
            }
            valueIndexMap.putIfAbsent(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        //Output: [0,1]
        System.out.println("Result:" + Arrays.toString(result));

        int[] result2 = twoSum(new int[]{3,2,4}, 6);
        //Output: [1,2]
        System.out.println("Result:" +Arrays.toString(result2));

        int[] result3 = twoSum(new int[]{3,3}, 6);
        //Output: [0,1]
        System.out.println("Result:" +Arrays.toString(result3));

        int[] result4 = twoSum(new int[]{0,4,3,0}, 0);
        //Output: [0,3]
        System.out.println("Result:" +Arrays.toString(result4));
    }
}
