package Past;

import java.util.ArrayList;
import java.util.List;

public class HackerRankC {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Heads");
        data.add("Heads");
        data.add("Tails");
        data.add("Tails");
        data.add("Tails");
        data.add("Tails");
        data.add("Tails");
        data.add("Heads");
        data.add("Heads");
        data.add("Tails");
        data.add("Heads");
        data.add("Heads");
        List<Integer> val = getMaxStreaks(data);
        System.out.println(val.get(0));
        System.out.println(val.get(1));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> data = new ArrayList<>();
        for(int i = 0;i<player.size();i++){
            int score = player.get(i);
            int position = 1;
            for(int k = 0;k<ranked.size();k++){
                if(k!=0){
                    if(ranked.get(k)!=ranked.get(k-1)){
                        position++;
                    }
                }
                if(score>ranked.get(k)){
                    data.add(position);
                    break;
                }
                if(k==ranked.size()-1 && score<ranked.get(k)){
                    position = position+1;
                    data.add(position);
                }
            }
        }
        return data;
    }

    static char[] myChar = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static int getStrength(String password, int weight_a) {
        int totalStrength = 0;
        for(int i = 0;i<password.length();i++){
            int tempWeight = weight_a;
            char currentChar = password.charAt(i);
            for(int k = 0;k<myChar.length;k++){
                if(currentChar==myChar[k]){
                    totalStrength = totalStrength+tempWeight;
                    System.out.println(tempWeight+""+currentChar+myChar[k]);
                    break;
                }
                if(tempWeight==25){
                    tempWeight=0;
                }else{
                    tempWeight++;
                }
            }

        }
        return totalStrength;
    }
    public static List<Integer> getMaxStreaks(List<String> toss) {
        List<Integer> list = new ArrayList<>();
        int maxHead = 0;
        int maxTail = 0;
        int headCont = 0;
        int tailCont = 0;
        boolean incrementingHead =false;
        if(toss.get(0).equals("Heads")){
            incrementingHead = true;
        }else {
            incrementingHead = false;
        }

        for (int i = 0; i < toss.size(); i++) {
            String currentText = toss.get(i);
            if(currentText.equals("Heads")){
                if(!incrementingHead){
                    incrementingHead = true;
                    headCont=0;
                }
                headCont++;
                if(headCont>maxHead){
                    maxHead = headCont;
                }
            }else {
                if(incrementingHead){
                    incrementingHead = false;
                    tailCont=0;
                }
                tailCont++;
                if(tailCont>maxTail){
                    maxTail = tailCont;
                }
            }
        }
        list.add(maxHead);
        list.add(maxTail);
        return list;
    }
}
