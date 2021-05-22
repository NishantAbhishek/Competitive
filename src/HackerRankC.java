import java.util.ArrayList;
import java.util.List;

public class HackerRankC {
    public static void main(String[] args) {

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
            }
        }
        return data;
    }

}
