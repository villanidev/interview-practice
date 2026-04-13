package dev.villani.linear.twopointers;

public class RemoveDuplicatesFromSortedArray {

    // os ponteiros vao na mesma direção (fast, slow)
    //remover as duplicatas in-place (sem criar outro array)
    //complexidade de tempo é O(n)
    //complexidade de espaço é O(1) - constante
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int slow = 0;
        int fast = 1;

        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }

        return slow + 1;
    }

    public static void main(String[] args) {
        int result = removeDuplicates(new int[] {1, 1, 2});
        //Output: 2
        System.out.println("Result:" + result);
        int result2 = removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
        //Output: 5
        System.out.println("Result:" + result2);
    }
}
