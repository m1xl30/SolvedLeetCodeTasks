package LeetCode;

public class Test2503 {
    private static int gcd(int a,int b) {
        int temp = 0;
        System.out.println(a);
        System.out.println(b);
        //euclidean algorithm
        while (b != 0) {
            temp = b;
            //temp=9
            b = a % b;
            //b=9%3=3
            a = temp;
            //a=3
//            System.out.println("a "+a);
//            System.out.println("b "+b);
//            System.out.println("temp "+temp);
        }
        return a;
    }
    public static void main(String[] args) {
        //merge-strings-alternately
//        String word1 = "abc";
//        String word2 = "pqrrr";
//        int maxLength = Math.max(word1.length(),word2.length());
//        ArrayList<Character> arCh = new ArrayList<Character>();
//        String newVar = "";
//
//        for (int i = 0; i < maxLength; i++) {
//            if(word1.length()-1<i){
//                arCh.add(word2.charAt(i));
//            }
//            else if(word2.length()<i){
//                arCh.add(word1.charAt(i));
//            }
//            else{
//                arCh.add(word1.charAt(i));
//                arCh.add(word2.charAt(i));
//            }
//        }
//        for (Character s : arCh){
//            newVar+=s.toString();
//        }
//        System.out.println(newVar);
//        System.out.println(arCh);

//         test
//        StringBuilder sb = new StringBuilder(word1);
//        String sup = sb.substring(2,3);
//        System.out.println(sup);
//        System.out.println(word1);
        //ends with, starts with, deleteCharAt, substring(включительно,невключительно),reverse, delete(int start,int end), setCharAt

        //greatest-common-divisor-of-strings

        String ab = "ABC";
        String bb ="ABCABCABC";
        String res="";
        int a = ab.length();
        int b = bb.length();

        String abb = ab+bb;
        String bbb = bb+ab;
        System.out.println(gcd(a,b));
        System.out.println(abb);
        System.out.println(bbb);

        if(!abb.equals(bbb)){
            System.out.println("non equivalent");
            System.out.println("");
        }
        else{
            for (int i = 0; i < gcd(a,b); i++) {
                res+= ab.charAt(i);
            }
        }
        System.out.println(res);
    }
}
