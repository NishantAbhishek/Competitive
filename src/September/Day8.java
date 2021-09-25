package September;

import DSALGOQ_400.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//
//3
//120 11 400
//10213 312 10
//10 3 450


public class Day8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns>0){
        }

    }

    public static void fifthQuestion(){
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int userNum = scan.nextInt();
            int totalNum = 0;
            int tempNum = userNum;
            while (tempNum > 9) {
                tempNum = tempNum / 10;
                totalNum++;
            }
            int reversednum = 0;
            while (userNum > 0) {
                int currentNum = userNum % 10;
                reversednum = (int) (reversednum + (currentNum*Math.pow(10, totalNum)));
                totalNum--;
                userNum = userNum/10;
            }
            System.out.println(reversednum);
            turns--;
        }
    }

    public static void sortA() {
        Scanner scan = new Scanner(System.in);
        int totalNum = scan.nextInt();
        int[] data = new int[totalNum];

        for (int i = 0; i < totalNum; i++) {
            data[i] = scan.nextInt();
        }

        //-:sorting:-
        for (int i = 0; i < totalNum; i++) {
            int maxIndex = i;
            for (int k = i; k < totalNum; k++) {
                if (data[maxIndex] < data[k]) {
                    maxIndex = k;
                }
            }
            int temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }

        for (int val : data) {
            System.out.println(val);
        }
    }


    public static void fourthQuestion() {
        Scanner scanner = new Scanner(System.in);
        int turns = scanner.nextInt();

        while (turns > 0) {
            int numA = scanner.nextInt();
            int numB = scanner.nextInt();
            int numC = scanner.nextInt();

            if ((numA >= numB && numA <= numC) || (numA >= numC && numA <= numB)) {
                System.out.println(numA);
            } else if ((numB >= numA && numB <= numC) || (numB >= numC && numB <= numA)) {
                System.out.println(numB);
            } else {
                System.out.println(numC);
            }
            turns--;
        }
    }

    public static void thirdQuestion() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns > 0) {
            int number = scan.nextInt();
            String value = String.valueOf(number);
            boolean isPal = true;
            int firstIndex = 0;
            int lastIndex = value.length() - 1;
            while (firstIndex < lastIndex && isPal) {
                if (value.charAt(firstIndex) != value.charAt(lastIndex)) {
                    isPal = false;
                }
                firstIndex++;
                lastIndex--;
            }

            if (isPal) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }

            turns--;
        }
    }

    void secondQuestion() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int currentNum = scan.nextInt();
            if (currentNum < 10) {
                System.out.println(currentNum);
            } else {
                int lastNum = currentNum % 10;
                int firstNum = 0;
                while (currentNum > 0) {
                    firstNum = currentNum % 10;
                    currentNum = currentNum / 10;
                }
                System.out.println(firstNum + lastNum);
            }
            turns--;
        }
    }

    void firstQuestion() {
        Scanner scan = new Scanner(System.in);

        double transactionAmount = scan.nextDouble();
        double totalAmount = scan.nextDouble();

        double remainingAmount = (totalAmount - transactionAmount - 0.5);

        if (remainingAmount < 0 || transactionAmount % 5 != 0) {
            System.out.println(String.format("%.2f", totalAmount));
        } else {
            System.out.println(String.format("%.2f", remainingAmount));
        }
    }
}
