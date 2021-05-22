import java.util.ArrayList;
import java.util.List;
public class HackerRankb{
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(10);
        System.out.println(minimumDistances(myList));
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

}
