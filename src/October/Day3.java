package October;

import java.util.Scanner;

public class Day3 {

    public static void q3() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns-->0){
            String currentInput = scan.next();
            int total = 0;
            for (int i = 0; i < currentInput.length(); i++) {
                if(currentInput.charAt(i)!='4'&& currentInput.charAt(i)!='7'){
                    total++;
                }
            }
            System.out.println(total);
        }
    }

//    public static void main (String[] args) throws java.lang.Exception
//    {
//        Scanner scan = new Scanner(System.in);
//        int turns = scan.nextInt();
//        while (turns-->0){
//            long currentInput = scan.nextLong();
//            int countNon = 0;
//            while(currentInput>=1){
//                if(currentInput%10!=7 && currentInput%10!=4){
//                    countNon++;
//                }
//                currentInput = currentInput/10;
//            }
//            System.out.println(countNon);
//        }
//
//    }

    public static void q2() {
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        while (totalInput-- > 0) {
            int totalJob = scan.nextInt();
            int jobDone = scan.nextInt();
            int[] jobCompleted = new int[jobDone];
            for (int i = 0; i < jobDone; i++) {
                jobCompleted[i] = scan.nextInt();
            }
            String chefJob = "";
            String assistantJob = "";
            boolean isChefJob = true;
            boolean isJobCompleted;
            for (int k = 1; k <= totalJob; k++) {
                isJobCompleted = false;
                for (int j = 0; j < jobDone; j++) {
                    if (jobCompleted[j] == k) {
                        isJobCompleted = true;
                        break;
                    }
                }
                if (!isJobCompleted) {
                    if (isChefJob) {
                        chefJob =chefJob+ k + " ";
                    } else {
                        assistantJob =assistantJob+ k + " ";
                    }
                }
                isChefJob = !isChefJob;
            }
            System.out.println(chefJob);
            System.out.println(assistantJob);
        }
    }


    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while (input-- > 0) {
            int totalSize = scan.nextInt();
            int[] data = new int[totalSize];
            while (totalSize > 0) {
                data[totalSize - 1] = scan.nextInt();
                totalSize--;
            }

            int minDifference = Integer.MAX_VALUE;
            for (int i = 0; i < data.length; i++) {
                int currentData = data[i];
                for (int k = i + 1; k < data.length; k++) {
                    int difference = currentData - data[k];
                    if (difference < 0) {
                        difference = difference * -1;
                    }

                    if (difference < minDifference) {
                        minDifference = difference;
                    }

                }
            }
            System.out.println(minDifference);
        }
    }

}
