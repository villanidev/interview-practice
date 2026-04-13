package dev.villani.linear.slidingwindow;

public class MaximumAverageSubArray {

    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length == 0) return 0.0;
        if (nums.length < k) return -1;

        //int  maxSum;
        int  windowSum = 0;

        // Calcula a soma da primeira janela
        for(int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Desliza a janela
        for (int i = k; i < nums.length; i++) {
            // entra o elemento da direita
            //windowSum += nums[i];
            // sai o elemento da esquerda
            //windowSum -= nums[i - k];
            //maxSum = Math.max(maxSum, windowSum);
            windowSum += nums[i] - nums[i - k]; // Soma e subtrai na mesma linha
            if (windowSum > maxSum) maxSum = windowSum; // 'if' é mais rápido que Math.max
        }

        return (double) maxSum / k; // Cast só no final
    }

    public static void main(String[] args) {
        double result = findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        //Output: 12.75000
        System.out.println("Result: "+ result);

        double result2 = findMaxAverage(new int[]{5}, 1);
        //Output: 5.00000
        System.out.println("Result: "+ result2);
    }
}
