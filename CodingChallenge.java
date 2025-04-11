package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CodingChallenge {
//    Coding Challenge
//Please witte a code that will retum a number of all posuthle solutions for solving a puzzle similar to the one presented on the image
//The blocks are passed to a function as list of strings, where each string defines a block by giving its connection types and 10-indicate an input or output
//The soluson must start and end with special blocks having START and END connection types (eg. "START,+diamond", diamond, END). All given bricks must be used. If there are no possible solutions to solve the puzzle, return 0
//There might be multiple bricks of the same shape and they are always distinctive (you can imagine them as having different colours)
//For bricks with two identical sides (eg
//"+diamond+diamond") rotating them won't produce two results


    private static ArrayList<String> toArray(String[] a){
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner sc = null;
        for(String s : a) {
            sc = new Scanner(s);
            sc.useDelimiter(",");
            if(s.contains("START") || s.contains("END")){
                System.out.println("start or end ///  ");
            }
            else{
                while(sc.hasNext()){
                    arrayList.add(sc.next());
                }
            }
        }
        sc.close();
        System.out.println("toArray "+arrayList);
        return arrayList;
    }
    private static ArrayList<String> removeFirstLetter(ArrayList<String> arrayList1){
        ArrayList<String> arrayList2 = new ArrayList<String>();
        HashSet<String> hashSet = new HashSet<String>();
        StringBuilder sb = null;
        for (String s : arrayList1){
            arrayList2.add(s.substring(1));
//            String newStr="";
//            sb = new StringBuilder(s);
//            sb.deleteCharAt(0);
//            arrayList2.add(sb.toString());
        }

        System.out.println("remove 1 letter "+ arrayList2);
        return arrayList2;
    }

    private static ArrayList<String> even(ArrayList<String> str){
        ArrayList<String> array = new ArrayList<String>();
        for(String s : str){
            if(s.startsWith("+")){
                array.add(s);
            }
        }
        return array;
    }
    private static ArrayList<String> odd(ArrayList<String> str){
        ArrayList<String> array = new ArrayList<String>();
        for(String s : str){
            if(s.startsWith("-")){
                array.add(s);
            }
        }
        return array;
    }
    private static int count(ArrayList<String> a1,ArrayList<String> a2){
        int counter=0;
        HashSet<String> hashSet1 = new HashSet<String>(a1);
        HashSet<String> hashSet2 = new HashSet<String>(a2);
        hashSet2.removeAll(hashSet1);
        counter = hashSet2.size() + hashSet1.size();
        System.out.println(counter);
        return counter;
    }

//    private static int count(ArrayList<String> a1, ArrayList<String> a2) {
//        Set<String> set1 = new HashSet<>(a1);
//        Set<String> set2 = new HashSet<>(a2);
//        set1.retainAll(set2); // Оставляем только совпадающие элементы
//        int counter = set1.size();
//        System.out.println("count: " + counter);
//        return counter;
//    }

    public static void main(String[] args) {
        //use delimiter , and create new array
        //remove start and end from that array
        //with minuses to 1 array to pluses to another
        //if contains all but first mark(- in case of first array and + in case of the second) - so counter ++

        String[] arr = {
                "START,-diamond",
                "+diamond,+diamond",
                "-diamond,+arc",
                "-arc,+doublearc",
                "-doublearc,-diamond",
                "+diamond,-arc",
                "+arc,+arc",
                "-arc,END"
        };

        ArrayList<String> array = toArray(arr);
        System.out.println("even +"+even(array));
        System.out.println("odd "+odd(array));
        count(removeFirstLetter(even(array)),removeFirstLetter(odd(array)));



        ///////////////////////////////////////////////////

//        for (String a : arr) {
//            if (a.contains("START") || a.contains("END")) {
//                counter++;
//            }
//            else{
//                sc = new Scanner(a);
//                sc.useDelimiter(",");
//                while (sc.hasNext()) {
//                    arrayInt.add(sc.next());
//                }
//
//            }
//            System.out.println("a "+ a);
//        }
//        sc.close();
        //StringBuilder stringBuilder = new StringBuilder();

        //
//        for (String s : arrayInt) {
//            if (s.contains("+")) {
//                    pos.add(s);
//                System.out.println("pos "+ s);
//            }
//            else if (s.contains("-")) {
//                    neg.add(s);
//                System.out.println("neg " +s);
//            }
//        }
//
//        System.out.println(pos);
//        System.out.println(neg);

        //System.out.println(arrayInt);

//        System.out.println(pos);
//        System.out.println(neg);



    }
}
