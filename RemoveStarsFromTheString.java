package LeetCode;

import java.util.Stack;

public class RemoveStarsFromTheString {

    public static String removeStars(String s){
        Stack<Character> st = new Stack<>();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        System.out.println(st);
        return res;
    }
    public static void main(String[] args) {
        String s1 = "leet**cod*e";
        String s2 = "erase*****";
        System.out.println(removeStars(s1));
    }
}
