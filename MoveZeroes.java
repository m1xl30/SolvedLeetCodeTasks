package LeetCode;

public class MoveZeroes {
    //Task:
    //https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75

    public static void moveZeroes(int[] nums) {
        int replaceCounter=0;
        for (int n : nums){
            if(n!=0){
                nums[replaceCounter]=n;
                replaceCounter++;
            }
        }

        int substraction = nums.length-replaceCounter;

        while(substraction>0){
            nums[nums.length-substraction]=0;
            substraction--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        for (int a:arr)
            System.out.println(a);
    }
}
