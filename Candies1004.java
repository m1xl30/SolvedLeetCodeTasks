package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Candies1004 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidsBool = new ArrayList<Boolean>();
        int maxCount=0;
        for(int m : candies){
            System.out.println("maxcount "+maxCount);
            System.out.println("m "+m);
            maxCount= Math.max(maxCount,m);

        }
        System.out.println(maxCount);

        for (int candie : candies) {
            int extraIndex=candie+extraCandies;
            if(extraIndex>=maxCount){
                kidsBool.add(true);
            }
            else{
                kidsBool.add(false);
            }
        }
        System.out.println(kidsBool);
        return kidsBool;
    }
    public static void main(String[] args) {
        int[] candies ={2,3,5,1,3};
        int extraCandies = 3;
        kidsWithCandies(candies,extraCandies);


    }
}
