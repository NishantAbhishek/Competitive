package CodingPracting2021.Past;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CodeChef {
    public static void main(String[] args) {
//        1 12 5 111 200 1000 10
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(12);
        data.add(5);
        data.add(111);
        data.add(200);
        data.add(1000);
        data.add(10);
        System.out.println(maximumToys(data,50));
    }
    public static String getRoundResult(char winning_suit, char suit1, int number1, char suit2, int number2){
        String result="";
        if(suit1==suit2){
            if(number1>number2){
                result = "Player 1 wins";
            }else if(number2>number1){
                result = "Player 2 wins";
            }else{
                result = "Draw";
            }
        }else{
            if(suit1==winning_suit){
                result = "Player 1 wins";
            }
            if(suit2==winning_suit){
                result = "Player 2 wins";
            }
            if(suit1!=winning_suit&&suit2!=winning_suit){
                if(number1>number2){
                    result = "Player 1 wins";
                }else if(number2>number1){
                    result = "Player 2 wins";
                }else{
                    result = "Draw";
                }
            }
        }
        return result;
    }


    public static void whatFlavors(List<Integer> cost, int money) {
        HashMap<Integer,Integer> sums = new HashMap<>();
        for(int k = 0;k<cost.size();k++){
            sums.put(money-cost.get(k),k);
        }

        for (int i = 0; i < cost.size(); i++) {
            int priceNeeded = cost.get(i);
            if(sums.containsKey(priceNeeded)){
                int position = sums.get(priceNeeded);
                if(position!=i&&position>i){
                    System.out.println((i+1)+" "+(position+1));
                }
            }
        }
    }
    public static void whatFlavors_(List<Integer> cost, int money) {
        for(int i = 0;i<cost.size();i++){
            int firstPrice = cost.get(i);
            int leftCost = money-firstPrice;
            for(int k = i+1;k<cost.size();k++){
                if(leftCost==cost.get(k)){
                    System.out.println((i+1)+" "+(k+1));
                }
            }
        }
    }

    public static void countSwaps(List<Integer> a) {
        int totalSwap=0;
        for(int i = 0;i<a.size();i++){
            for(int k = 0;k<a.size()-1;k++){
                if(a.get(k)>a.get(k+1)){
                    int temp = a.get(k);
                    a.set(k,a.get(k+1));
                    a.set(k+1,temp);
                    totalSwap++;
                }
            }
        }

        System.out.println("Array is sorted in "+totalSwap+" swaps");
        System.out.println("First Element: "+a.get(0));
        System.out.println("First Element: "+a.get(a.size()-1));
    }

    public static int maximumToys(List<Integer> a, int totalPrice) {
        int lastMinimum = -1;
        int findMinimum=Integer.MAX_VALUE;
        int total = 0;
        int count = 0;
        while (total<totalPrice){
            for(int i = 0;i<a.size();i++){
                if(a.get(i)<findMinimum && a.get(i)>lastMinimum){
                    findMinimum = a.get(i);
                }
            }
            System.out.println(findMinimum);
            total = total+findMinimum;
            if(total<totalPrice){
                count++;
            }else{
                break;
            }

            lastMinimum=findMinimum;
            findMinimum = 1000000;
        }
        return count;
    }


}
