package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels1004 {
    private static boolean isVowel(Character c){
        char[] vowelsArray = {'a','e','i','o','u'};
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
            char currentChar = Character.toLowerCase(s.charAt(i));
            if(isVowel(currentChar)){
                vowels.add(s.charAt(i));
                indexes.add(i);

            }
        }
        vowels = vowels.reversed();
        System.out.println(s);
        System.out.println(vowels);
        System.out.println(indexes);


        for (int x = 0; x < vowels.size(); x++) {
            System.out.println(sb);
            System.out.println("vowel "+vowels.get(x));
            System.out.println("index "+ indexes.get(x));

            if(x==indexes.size()-1){
                sb.replace(indexes.get(x),indexes.get(x), vowels.get(x).toString());
            }
            else{
                sb.replace(indexes.get(x),indexes.get(x+1), vowels.get(x).toString());
            }

            System.out.println("sb "+sb);
        }
        s = sb.toString();
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        String s = "PidOr";
        reverseTheVowels(s);
        List<Integer> indexes = new ArrayList<Integer>();
        indexes.add(1);
        indexes.add(2);
        indexes.add(3);
        indexes =  indexes.reversed();


        StringBuilder sb = new StringBuilder("pidOr");
        sb.replace(4,4,"x");


        //System.out.println(sb.toString());

    }
}
