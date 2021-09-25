package September;

import DSALGOQ_400.Array;

import java.util.Arrays;
import java.util.HashMap;

public class Day1 {
    public static void main(String[] args) {

    }

    static void reverse(){
        int[] myArr= {1,3,1,4,5,1};
        int first = 0;
        int last  = myArr.length - 1;

        while(first<last){
            int temp = myArr[last];
            myArr[last] = myArr[first];
            myArr[first] = temp;

            first++;
            last--;
        }

        for(int data:myArr){
            System.out.println(data);
        }
    }

    public static void moveOneSide(){
        int[] myArr= {-1,3,1,-4,5,-1,9,5,-8,-4,3,0};
        int negativeSide = 0;
        int positiveSide = myArr.length-1;
        while (negativeSide<positiveSide){

            if(myArr[negativeSide]<0){
                negativeSide++;
            }

            if(myArr[positiveSide]>=0){
                positiveSide--;
            }

            if(negativeSide<positiveSide && myArr[negativeSide]>=0 && myArr[positiveSide]<0){
                int temp = myArr[negativeSide];
                myArr[negativeSide] = myArr[positiveSide];
                myArr[positiveSide] = temp;
            }
        }

        for(int data:myArr){
            System.out.println(data);
        }
    }

    public static int doUnion(int a[], int n, int b[], int m)
    {
        int count = 0;
        HashMap<Integer,Integer> repeatedVal =  new HashMap<>();
        for(int i = 0;i<n;i++){
            if(!repeatedVal.containsKey(a[i])){
                count++;
                repeatedVal.put(a[i],a[i]);
            }
        }

        for(int i = 0;i<m;i++){
            if(!repeatedVal.containsKey(b[i])){
                count++;
                repeatedVal.put(b[i],b[i]);
            }
        }
        return count;
    }



}
