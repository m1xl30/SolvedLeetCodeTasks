package LeetCode;

public class PalindromeLC {
    public static void main(String[] args) {
        String p = "mama1";
        StringBuilder s1 = new StringBuilder(p);
        System.out.println(s1.reverse());

        int x=12721;
        String intString = Integer.toString(x);
        int centerPos;
        String firstPart="";
        String secondPart="";
        boolean result=false;
        for (int i = 0; i < intString.length(); i++) {
            centerPos= (intString.length()-1)/2;
            if(i<centerPos){
                firstPart+=intString.charAt(i);
            }
            if(i==centerPos){
                System.out.println();
            }
            if(i>centerPos){
                secondPart+=intString.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder(firstPart);

//        System.out.println(x);
//        System.out.println("first "+firstPart);
//        System.out.println("second "+secondPart);

        if(secondPart.equals(sb.reverse().toString())){
            result=true;
        }

        System.out.println(result);
    }
}
