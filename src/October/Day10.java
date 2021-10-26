package October;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        bubbleSort(new int[]{1,14,12,11,29});
    }



    public static void bubbleSort(int[] data){
        for(int i = 0;i<data.length;i++){
            for(int k = 0;k<data.length-1;k++){
                if(data[k]>data[k+1]){
                    int temp = data[k];
                    data[k] = data[k+1];
                    data[k+1] = temp;
                }
            }
        }
        printArray(data);
    }


    public void q2(){
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns>0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int count = 0;
            while (a!=b){
                if(a>b){
                    a = a/2;
                }else{
                    b = b/2;
                }

                count++;
            }
            System.out.println(count);
            turns--;
        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int currentVal = arr[i];
            int k = i-1;
            while (k>=0 && arr[k]>currentVal){
                arr[k+1] = arr[k];
                k--;
            }
            arr[k+1] = currentVal;
        }
    }

    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
