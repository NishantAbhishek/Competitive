package September;

import java.util.HashMap;
import java.util.Scanner;

public class Day13 {


    public static void q4() {
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();

        while (totalInput>0){
            String userValue = scan.next();

            int count1 = 0;
            int count0 = 0;
            //--what the--
            // while (userValue>=1){
            //     int lastValue = userValue%10;
            //     if(lastValue==0){
            //         count0++;
            //     }else if(lastValue==1){
            //         count1++;
            //     }
            //     userValue=userValue/10;
            // }

            for(int i = 0;i<userValue.length();i++){
                if(userValue.charAt(i)=='0'){
                    count0++;
                }else{
                    count1++;
                }
            }

            if(count0==1||count1==1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            totalInput--;
        }

    }
    
    public static void q3(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while (testCases > 0) {
            int numberOfDolls = scan.nextInt();
            HashMap<Integer, Integer> data = new HashMap<>();
            while (numberOfDolls > 0) {
                int dollNumber = scan.nextInt();
                if(data.get(dollNumber)!=null){
                    data.put(dollNumber, data.get(dollNumber) + 1);
                }else{
                    data.put(dollNumber,1);
                }
                numberOfDolls--;
            }

            for (Integer key : data.keySet()) {
                if (data.get(key) %2 !=0) {
                    System.out.println(key);
                    break;
                }
            }

            testCases--;
        }
    }

    public static void q2() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int noOfFeature = scan.nextInt();
            int initialFeature = scan.nextInt();
            int countFeature = 0;

            while (noOfFeature > 0) {
                int additionalFeature = scan.nextInt();
                //System.out.println(additionalFeature+initialFeature);
                if ((additionalFeature + initialFeature) % 7 == 0) {
                    countFeature++;
                }
                noOfFeature--;

            }

            System.out.println(countFeature);

            turns--;
        }
    }

    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int M = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();

            int houseLimit = x * y;
            int[] houses = new int[101];

            while (M > 0) {
                int houseNumber = scan.nextInt();
                int upperLimit = (houseLimit + houseNumber <= 100) ? houseLimit + houseNumber : 100;
                int lowerLimit = (houseNumber - houseLimit > 0) ? houseNumber - houseLimit : 0;

                // System.out.println("upperLimit "+upperLimit);
                // System.out.println("lowerLimit "+lowerLimit);

                for (int i = lowerLimit; i <= upperLimit; i++) {
                    houses[i] = 1;
                }

                M--;
            }

            int count0 = 0;

            for (int i = 1; i < houses.length; i++) {
                if (houses[i] == 0) {
                    count0++;
                }
            }

            System.out.println(count0);

            turns--;
        }

    }
}
