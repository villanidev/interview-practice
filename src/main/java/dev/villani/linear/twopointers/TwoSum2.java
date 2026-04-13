package dev.villani.linear.twopointers;

import java.util.Arrays;

public class TwoSum2 {

    //complexidade de tempo é O(n)
    //complexidade de espaço é O(1) - constante
    //pois não crio nenhuma estrutura de dados que cresce com o input (n)
    public static int[] twoSum(int[] nums, int target) {
        //como o array já vem ordenado
        //usar dois ponteiros (um no início e outro no fim)
        if (nums.length == 0) return nums;
        int pointerStart = 0;
        int pointerEnd = nums.length - 1;

        while (pointerStart <= pointerEnd) {
            int sum = nums[pointerStart] + nums[pointerEnd];

            if (sum == target) {
                return new int[]{pointerStart+1, pointerEnd+1};
            } else if (sum > target) {
                pointerEnd--;
            } else {
                pointerStart++;
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        //Output: [1,2]
        System.out.println("Result:" + Arrays.toString(result));

        int[] result2 = twoSum(new int[]{2,3,4}, 6);
        //Output: [1,3]
        System.out.println("Result:" +Arrays.toString(result2));

        int[] result3 = twoSum(new int[]{-1,0}, -1);
        //Output: [1,2]
        System.out.println("Result:" +Arrays.toString(result3));
    }
}
