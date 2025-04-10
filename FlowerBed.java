package LeetCode;

public class FlowerBed {
    public static int findEmptySpace(int[] arr){
        //first and last
        int emptyCells =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr.length==1 && arr[i]==0){
                emptyCells++;
            }
            else if (arr.length==1 && arr[i]==1){
                System.out.println("1 cell with int = 1 - false");
            }
            else if(arr.length>1){
                if(i==0 && arr[i]==0 && arr[i+1]==0){
                    emptyCells++;
                    arr[i]=1;
                }
                else if(i== arr.length-1 && arr[i]==0 && arr[i-1]==0 && i-1>0){
                    emptyCells++;
                    arr[i]=1;
                }
                else{
                    if(i+1<arr.length-1&& arr[i]==0 && arr[i+1]== 0 && arr[i-1]==0){
                        emptyCells++;
                        arr[i]=1;
                    }
                }
            }
            else{

            }
        }

        System.out.println(emptyCells);
        return emptyCells;
        }


    public static boolean isTrue(int n, int q){
        boolean tr = false;
        if(n<=q){
            tr= true;
        }
        System.out.println(tr);
        return tr;
    }


    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,1};
        int[] flowerbed1 = {0};
        int n =1;
        int n1 =2;

        isTrue(n,findEmptySpace(flowerbed));
    }
}
