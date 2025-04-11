package LeetCode;

public class TwoSum {
    //Two sum
    //https://leetcode.com/problems/two-sum/description/
    public static int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        for (int q = 0; q < nums.length; q++) {
            //outside
                for (int y = 1; y < nums.length; y++) {
                    //inside
                    if (nums[y] + nums[q] == target) {
                    result[0] = q;
                    result[1] = y;
                    if(q!=y){
                        return result;
                    }

                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};

        for (int i : twoSum(nums, 6)) {
            System.out.println(i);
        }

    }


}
