package CodingPracting2021.Past;

import java.util.ArrayList;
import java.util.List;

public class HackerRankE {
    public static void main(String[] args) {
        staircase(30);
    }

    public static void staircase(int n) {
        int startPlace = n;
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= n; a++) {
                if (startPlace <= a) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }


            startPlace--;
            System.out.println("");
        }
    }

    static String catAndMouse(int x, int y, int z) {
        int distanceFromASquared = (z - x) * (z - x);
        int distanceFromBSquared = (z - y) * (z - y);

        if (distanceFromASquared < distanceFromBSquared) {
            return "Cat A";
        } else if (distanceFromASquared > distanceFromBSquared) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxValue = 0;
        int countMax = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (maxValue < candles.get(i)) {
                maxValue = candles.get(i);
                countMax = 0;
            }
            if (maxValue == candles.get(i)) {
                countMax++;
            }
        }
        return countMax;
    }


    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> roundedGrades = new ArrayList<>();

        for(int i = 0;i<grades.size();i++){
            int currentGrades = grades.get(i);

            if(currentGrades>37){
                int remaider = currentGrades%5;

                if(remaider>2){
                    int newGrade = ((currentGrades/5)+1)*5;
                    roundedGrades.add(newGrade);
                }else{
                    roundedGrades.add(currentGrades);
                }
            }else{
                roundedGrades.add(currentGrades);
            }
        }
        return roundedGrades;
    }

    public static int pageCount(int n, int p) {
        int pageTurn = 0;
        if(n/2>=p){
            pageTurn = p/2;
        }else{
            pageTurn = (n/2)-(p/2);
        }
        return pageTurn;
    }

}
