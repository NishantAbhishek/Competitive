import java.util.ArrayList;
import java.util.List;

public class HackerRankD {
    public static void main(String[] args) {

        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(90);
        ranked.add(90);
        ranked.add(80);
        ranked.add(75);
        ranked.add(60);

        List<Integer> player = new ArrayList<>();
        player.add(102);
        System.out.println(climbingLeaderboard(ranked,player).get(0));
    }

    public static String gridSearch(List<String> G, List<String> P) {
        for(int outer = 0;outer<G.size()-P.size();outer++){
            int indexFound = -1;
            String firstPattern = P.get(0);
            for(int i = outer;i<G.size();i++){
                if(G.get(i).contains(firstPattern)){
                    indexFound = i;
                    System.out.println("Found at "+i);
                }
            }
            int counter = 0;
            boolean satisfied = true;
            for(int k = indexFound;k<indexFound+P.size();k++){
                if(G.get(k).contains(P.get(counter))){
                    System.out.println("Condition met "+k);
                }else{
                    System.out.println("Condition Not met "+k);
                    satisfied = false;
                }
                counter++;
            }

            if(satisfied){
                return "YES";
            }else{
                return "NO";
            }
        }
        return "NO";
    }

    public static void minimumBribes(List<Integer> q){
        int totalSwap=0;
        for(int k = q.size()-1;k>=0;k--){
            if(k+1!=q.get(k)){
                if(q.get(k-1)<q.get(k)){
                    totalSwap++;
                    swap(k-1,k,q);
                }else if(q.get(k-2)>q.get(k)){
                    totalSwap++;
                    swap(k-2,k,q);
                }else{
                    System.out.println("Too chaotic");
                }

            }
        }
        System.out.println(totalSwap);
    }


    public static void swap(int indexA,int indexB,List<Integer> q){
        int temp = q.get(indexA);
        q.set(indexA,q.get(indexB));
        q.set(indexB,temp);
    }

    public static int makeAnagram(String a, String b) {
        int counter = 0;
        for(int i = 0;i<a.length();i++){
            if(!a.contains(Character.toString(b.charAt(i)))){
                counter++;
            }
        }

        for(int i = 0;i<b.length();i++){
            if(!b.contains(Character.toString(a.charAt(i)))){
                counter++;
            }
        }

        return counter;
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> data = new ArrayList<>();
        for(int i = 0;i<player.size();i++){
            int prevValue = player.get(0);
            int rank = 0 ;
            int currentScore = player.get(i);
            boolean found = false;

            for(int k = 0;k<ranked.size();k++){
                if(currentScore>=ranked.get(k)){
                    rank++;
                    found = true;
                    break;
                }else if(currentScore<ranked.get(k)){
                    if(prevValue!=ranked.get(k)){
                        rank++;
                    }
                    prevValue = ranked.get(k);
                }
            }

            if(found){
                data.add(rank);
            }else {
                rank = rank+1;
                data.add(rank);
            }
        }
        return data;
    }

}
