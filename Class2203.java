package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Class2203 {
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
