package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringDOMChallenge {
//String Challenge
//    Have the function StringChallenge(str) read the str parameter being passed which will be a string of HTML DOM elements and plain text. The elements that will be used are: b, i, em, div, p. For example: if str is "<div><b><p>hello world</p></b></div>" then this string of DOM elements is nested correctly so your program should return the string true.
//
//    If a string is not nested correctly, return the first element encountered where, if changed into a different element, would result in a properly formatted string. If the string is not formatted properly, then it will only be one element that needs to be changed. For example: if str is "<div><i>hello</i>world</b>" then your program should return the string div because if the first <div> element were changed into a <b>, the string would be properly formatted.
//    Examples
//    Input: "<div><div><b></b></div></p>"
//    Output: div
//    Input: "<div>abc</div><p><em><i>test test test</b></em></p>"
//    Output: i


    public static void main(String[] args) {
        //<div><div><strong></strong><p>
        //<section><bold></section>
        String html = "<div><div><strong></strong><i></div>";
        String saver="";
        int counter =0;
        int counter1 =0;
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        ArrayList<String> arrayS =  new ArrayList<String>();
        for (int i = 0; i < html.length(); i++) {
                if(html.charAt(i)=='<' || html.charAt(i)=='/'){
                    saver="";
                }
                else if(html.charAt(i)=='>' && !saver.equals("")){
                    arrayS.add(saver);
                    saver="";

                }
                else{
                    saver+=html.charAt(i);
                }
        }

        System.out.println(arrayS);

        for(String t : arrayS){
            map.put(t,map.getOrDefault(t,0)+1);
        }

//        for (int j = 0; j < arrayS.size(); j++) {
//            counter=0;
//            for (int f = 0; f < arrayS.size(); f++) {
//                if(arrayS.get(j).equals(arrayS.get(f))){
//                    counter++;
//                }
//            }
//            map.put(arrayS.get(j), counter);
//        }

        //////////// [div, div, strong, strong, i, div]
        System.out.println(map);


        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("div",3);
        hm.put("i",2);
        hm.put("h2",2);
        for(Map.Entry<String,Integer> me : hm.entrySet()){
            if(me.getValue()%2!=0){
                System.out.println(me.getKey());
            }
        }

//        String text = "apple banana apple orange banana apple";
//        String[] words = text.split(" ");
//        Map<String, Integer> map1 = new HashMap<>();
//
//        for (String word : words) {
//            map1.put(word, map1.getOrDefault(word, 0) + 1);
//        }
//        System.out.println(map1); // {apple=3, banana=2, orange=1}

    }
}
