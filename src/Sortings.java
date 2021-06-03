import DSALGOQ_400.Array;

import java.util.Arrays;

public class Sortings {
    public static void main(String[] args) {
//        insertionSort(new int[]{17, 25, 31, 13, 2});
    }

    public static void insertionSort(int[]a){
        for(int i = 1;i<a.length;i++){
            int temp = a[i];
            int j = i-1;

            while (j>=0 && temp < a[j]){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = temp;
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void selectionSort(int[] a){
        for(int i = 0;i<a.length;i++){
            int minValueI = i;
            for(int k = i;k<a.length;k++){
                if(a[k]>a[minValueI]){
                    minValueI = k;
                }
            }
            int temp = a[minValueI];
            a[minValueI] = a[i];
            a[i] = temp;
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    int[][] sortedMatrix(int N, int Mat[][]) {
        int[] val = new int[Mat.length*Mat[0].length];
        int counter = 0;
        for(int i = 0;i< Mat.length;i++){
            for(int c = 0;c<Mat[0].length;c++){
                val[counter] = Mat[i][c];
                counter++;
            }
        }
        Arrays.sort(val);
        for(int i = 0;i< val.length;i++){
            System.out.println(val[i]);
        }
        counter =0;
        for(int i = 0;i< Mat.length;i++){
            for(int c = 0;c<Mat[0].length;c++){
                val[counter] = Mat[i][c];
                counter++;
            }
        }
        return Mat;
    }

}
