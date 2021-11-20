package CodingPracting2021.Past;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank {
    public static void main(String[] args) {
        List<Integer> value = new ArrayList<>();
        value.add(5);
        value.add(4);
        value.add(4);
        value.add(2);
        value.add(2);
        value.add(8);
        //cutTheSticks(value);
    }

    //ICPC Question
    public static List<Integer> acmTeam(List<String> topic) {
        ArrayList<Integer> output = new ArrayList<>();
        output.add(1);
        output.add(1);

        int subjectLength = topic.get(0).length();
        int max = -1;
        int teamKnowingTopic = 0;

        for(int i=0;i<topic.size();i++){
            String teamA = topic.get(i);
            // System.out.println("Team A:- "+teamA);
            for(int k = i;k<topic.size();k++){
                if(k!=i){
                    String teamB = topic.get(k);
                    // System.out.println("Team B:- "+teamB);
                    int combValue = 0;

                    for(int c = 0;c<subjectLength;c++){
                        char teamAChar = teamA.charAt(c);
                        char teamBChar = teamB.charAt(c);
                        if(teamAChar=='1' || teamBChar=='1'){
//                            temp[c] = 1;
                            combValue++;
                        }
                    }
                    if(combValue==max){
                        teamKnowingTopic++;
                    }else if(combValue>max){
                        max = combValue;
                        teamKnowingTopic = 1;
                    }
                }
            }
            // System.out.println("----------");
        }
        output.set(0,max);
        output.set(1,teamKnowingTopic);
        return output;
    }

    //SOme cases does not passes
    public static List<Integer> cutTheSticks_(List<Integer> arr) {
        List<Integer> myList = new ArrayList<>();
        myList.add(arr.size());
        boolean taskComplete = false;
        while(!taskComplete){
            int minValue = 1001;

            //find the Minimum
            for(int i = 0;i<arr.size();i++){
                if(arr.get(i)<minValue&&arr.get(i)!=0){
                    minValue = arr.get(i);
                }
            }
            //subtract and count the value;
            int remaining=0;
            for(int i = 0;i<arr.size();i++){
                int value = arr.get(i);
                if(value>0){
                    value = value-minValue;
                    arr.set(i,value);
                    if(value>0){
                        remaining++;
                    }
                }
            }
            myList.add(remaining);
            if(remaining==1||remaining==0){
                taskComplete = true;
            }

            boolean differentValue;
            for(int i = 0;i<arr.size();i++){

            }
        }
        return myList;
    }




}
