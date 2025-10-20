package LeetCode;

public class ReverseWords {
    //Task:
    //https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75

    private static void printAnArray(String[] arr){
        for (String s : arr) {
            System.out.println(s);
        }
    }
    private static String[] reverseAnArray(String[] arr){
        String[] newArr= new String[arr.length];
        int pos=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            //System.out.println("i "+i);
            newArr[pos]=arr[i];
            pos++;
        }
        return newArr;
    }

    private static String StringFromArray(String[] arr){
        String s="";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                s+=arr[i];
            }
            else{
                s+=arr[i]+" ";
            }

            //System.out.println("sfa "+s);
        }
        return s;
    }


    public static String reverseWords(String s){
        String res="", trimmed =" ";
        trimmed=s.trim();
        System.out.println("11" +trimmed);
        trimmed=trimmed.replaceAll("\\s+"," ");
        System.out.println(trimmed);
        String[] arr = trimmed.split(" ");
        //System.out.println("arr ");
        //printAnArray(arr);
        String[] arr2 = reverseAnArray(arr);
        //System.out.println("arr2");
        //printAnArray(arr2);
        res=StringFromArray(arr2);
        return res;
    }

    public static void main(String[] args) {

//        String[] arr = {"1","2"};
//        System.out.println(arr[0]);

        String s1 = "a good   example";
        String s2="the sky is blue";
        String s3 = "  hello world  ";
        System.out.println(reverseWords(s1));


    }
}
