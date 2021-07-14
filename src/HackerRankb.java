import DSALGOQ_400.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class HackerRankb{
    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(20,new int[]{13,1,11,10,6}));
    }


    static int flatlandSpaceStations(int n, int[] c) {
        int maxDist = 0;
        int flagLeft = 0;
        int flagRight = 0;
        Arrays.sort(c);


        if(c.length>0){
            flagRight = 1;
        }

        for(int i = 0;i<n;i++){
            if(i>c[flagLeft] && i>c[flagRight]){
                flagLeft++;
                flagRight++;
            }

            if(flagRight>=c.length){
                flagRight--;
            }

            if(flagLeft>=c.length){
                flagLeft--;
            }

            int distFrFlagLeft = c[flagRight]-i;
            int distFrFlagRight = c[flagLeft]-i;

            int dist = Math.min(Math.abs(distFrFlagLeft),Math.abs(distFrFlagRight));
            maxDist = Math.max(dist,maxDist);
        }

        return maxDist;
    }



    public static int beautifulTriplets(int d, List<Integer> arr){
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int firstVal = arr.get(i);
            int secondVal=-1;
            int thirdVal=-1;
            for(int k = i;k<arr.size();k++){
                if(secondVal==-1){
                    if(d+firstVal==arr.get(k)){
                        secondVal = arr.get(k);
                    }
                }else{
                    if(d+secondVal==arr.get(k)){
                        thirdVal = arr.get(k);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int minimumDistances(List<Integer> a){
        int minimumDifference = 10000;
        for(int i = 0;i<a.size();i++){
            int firstVal = a.get(i);
            for(int k = i+1;k<a.size();k++){
                int secondVal = a.get(k);
                if(firstVal==secondVal){
                    int difference = k-i;
                    if(minimumDifference>difference){
                        minimumDifference = difference;
                    }
                }
            }
        }
        if(minimumDifference==10000){
            return -1;
        }else{
            return minimumDifference;

        }
    }

    public static long repeatedString(String s, long n) {
        long countAOneRepeat = 0;
        for(int i = 0;i<s.length();i++){
            if(String.valueOf(s.charAt(i)).equals("a")){
                countAOneRepeat++;
            }
        }
        long numberOfRepeat = n/s.length();
        long total = numberOfRepeat*countAOneRepeat;
        long remaningCycle = n%s.length();

        for(int i = 0;i<remaningCycle;i++){
            if(String.valueOf(s.charAt(i)).equals("a")){
                total++;
            }
        }

        return total;

    }



}
