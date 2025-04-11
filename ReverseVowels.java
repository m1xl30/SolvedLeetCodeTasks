package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {
    //Reverse Vowels of a String
    //https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75

    private static boolean isVowel(Character c){
        char[] vowelsArray = {'a','e','i','o','u','A','E','I','O','U'};
        for (char q : vowelsArray){
            if (c==q){
                return true;
            }
        }
        return false;
    }

    private static String reverseTheVowels(String s){

        ArrayList<Integer> indexes = new ArrayList<Integer>();
        List<Character> vowels = new ArrayList<Character>();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))){
                vowels.add(s.charAt(i));
                indexes.add(i);
            }
        }
        //reversing an array
        vowels = vowels.reversed();

        for (int x = 0; x < vowels.size(); x++) {
            sb.setCharAt(indexes.get(x), vowels.get(x));
        }

        //potential encoding to avoid long constraint java error
//        String value = sb.toString();
//        String encoder = Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
//        System.out.println(encoder.getBytes(StandardCharsets.UTF_8).toString());
//        return encoder.getBytes(StandardCharsets.UTF_8).toString();

        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "let's do homework together";
        reverseTheVowels(s);

        List<Integer> indexes = new ArrayList<Integer>();
        indexes.add(1);
        indexes.add(2);
        indexes.add(3);
        indexes =  indexes.reversed();

        //System.out.println(sb.toString());

    }
}
