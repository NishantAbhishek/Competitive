import java.util.ArrayList;
import java.util.List;

public class HackerRankD {
    public static void main(String[] args) {
        List<Integer> q = new ArrayList<>();
        q.add(1);
        q.add(2);
        q.add(5);
        q.add(3);
        q.add(7);
        q.add(8);
        q.add(6);
        q.add(4);
        minimumBribes(q);
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

}
