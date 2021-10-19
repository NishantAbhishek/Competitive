package October;

import java.util.Arrays;
import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {
        System.out.println(calculateGCD(5,25));
    }

    public static int getGCD(int numA, int numB) {
        int maxGcd = 1;
        for (int i = 1; i <= numA && i <= numB; i++) {
            if(numA%i==0 && numB%i==0){
                maxGcd = i;
            }
        }
        return maxGcd;
    }

    public static int  calculateGCD(int numA,int numB){
        if(numA==0){
            return numB;
        }else if(numB==0){
            return numA;
        }else{
            return calculateGCD(numA,numA%numB);
        }
    }


    public static void q2() {
        Scanner scan = new Scanner(System.in);
        int totalTestCases = scan.nextInt();

        while (totalTestCases-- > 0) {
            int size = scan.nextInt();
            int[] data = new int[size];

            for (int i = 0; i < size; i++) {
                data[i] = scan.nextInt();
            }

            bubbleSort(data);

            int currentArrival = 0;
            for (int i = 0; i < size; i++) {
                if (data[i] <= currentArrival) {
                    currentArrival++;
                }
            }
            System.out.println(currentArrival);
        }
    }

    static void selectionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            for (int k = i + 1; k < data.length; k++) {
                if (data[k] < data[minIndex]) {
                    minIndex = k;
                }
            }
            int tempData = data[minIndex];
            data[minIndex] = data[i];
            data[i] = tempData;
        }
    }

    static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int k = 0; k < data.length - i - 1; k++) {
                if (data[k] > data[k + 1]) {
                    int temp = data[k + 1];
                    data[k] = data[k + 1];
                    data[k] = temp;
                }
            }
        }
    }


    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int inputLength = scan.nextInt();
        int MOD = 1000000007;

        int total = 0;

        while (inputLength-- > 0) {
            int data = scan.nextInt();
            if (data > 0) {
                total = ((total % MOD) + (data % MOD)) % MOD;
            } else {
                total = ((total % MOD) + (data % MOD) + MOD) % MOD;
            }
        }

        int totalQuery = scan.nextInt();
        while (totalQuery-- > 0) {
            scan.nextInt();
            total = ((total % MOD) + (total % MOD)) % MOD;
            System.out.println(total);
        }
    }


}
