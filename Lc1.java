package LeetCode;

public class Lc1 {


    public Lc1() {
    }

    public int[] twoSum(int[] nums, int target) {
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


//
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[x]+nums[i]==target ){
//                result[0]=x;
//                result[1]=i;
//                return result;
//            }
//            else{
//                x++;
//            }
//        }

    }


}
