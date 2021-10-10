package October;

import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Scanner;

public class Day5 {

    public static void q2()
    {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while (testCases-- > 0) {
            int arrSize = scan.nextInt();
            int[] A = new int[arrSize];
            int[] B = new int[arrSize];
            int xorVal = 0;

            for(int i = 0;i<arrSize;i++){
                A[i] = scan.nextInt();
            }

            for(int i = 0;i<arrSize;i++){
                B[i] = scan.nextInt();
            }


            for(int i = 0;i<arrSize;i++){
                xorVal = xorVal^A[i]^B[i];
            }

            HashMap<Integer,Integer> valuesCount = new HashMap<>();
            for(int k = 0;k<arrSize;k++){
                int value = A[k]^xorVal;
                // System.out.println(value);
                if(valuesCount.containsKey(value)){
                    valuesCount.put(value,valuesCount.get(value)+1);
                }else{
                    valuesCount.put(value,1);
                }
            }

            for(int i = 0;i<arrSize;i++){
                int currentVal = B[i];
                if(valuesCount.containsKey(currentVal)){
                    valuesCount.put(currentVal,valuesCount.get(currentVal)-1);
                }
            }

            boolean satisfies = true;

            for(int key: valuesCount.keySet()){
                int currentVal = valuesCount.get(key);
                if(currentVal!=0){
                    satisfies = false;
                }
            }

            if(!satisfies){
                System.out.println(-1);
            }else{
                for(int k = 0;k<arrSize;k++){
                    int value = A[k]^xorVal;
                    System.out.print(value+" ");
                }
                System.out.println();
            }
        }

    }
    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int numberOfArray = scan.nextInt();
        while (numberOfArray-- > 0) {
            int arraySize = scan.nextInt();
            int[] data = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                data[i] = scan.nextInt();
            }
            boolean nextPositive = data[arraySize - 1] > 0;
            int subArraySize = 0;
            String printingString = "";
            for (int i = arraySize - 1; i >= 0; i--) {
                int currentData = data[i];
                if ((currentData >= 0 && nextPositive) || (currentData < 0 && !nextPositive)) {
                    subArraySize++;
                } else {
                    subArraySize = 1;
                }
                //System.out.print(subArraySize+" ");
                nextPositive = !(data[i] > 0);
                data[i] = subArraySize;
            }

            for (int i = 0; i < arraySize; i++) {
                System.out.print(data[i] + " ");
            }

            System.out.println();
        }

    }

}
