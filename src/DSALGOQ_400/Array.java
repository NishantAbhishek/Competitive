package DSALGOQ_400;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
//        System.out.println(maxSubarraySum(new int[]{1,2,-1,5,-7,8},6));
    }
    public static int unionIntersection(int[] a,int[] b){
        int maxIndex = 0;
        int union = 0;
        int countInterSec = 0;
        if(a.length>b.length){
            maxIndex = a.length;
        }else{
            maxIndex = b.length;
        }
        for (int i = 0; i < maxIndex; i++) {
            boolean a_unique = true;
            boolean b_unique = true;
            boolean isrepeatedin_same_a = false;
            boolean isrpeatedin_diif_a = false;

            int current_a = 0;
            int current_b=0;
            if(i<a.length){
                current_a= a[i];
            }else{
                a_unique = false;
            }

            if(i<b.length){
                current_b = b[i];
            }else {
                b_unique = false;
            }

            for(int k = 0;k<maxIndex;k++){
                if(k>i && k<a.length){
                    if(current_a==a[k]){
                        a_unique = false;
                    }
                }

                if(k>i&&k<b.length){
                    if(current_b==b[k]){
                        b_unique = false;
                        isrepeatedin_same_a = true;
                    }
                }

                if(k<a.length){
                    if(current_b==a[k]){
                        b_unique = false;
                        isrpeatedin_diif_a = true;
                    }
                }
            }

            if(a_unique){
                union++;
            }
            if(b_unique){
                union++;
            }
            if(isrpeatedin_diif_a && !isrepeatedin_same_a){
                countInterSec++;
            }
        }
        System.out.println("Intersec "+countInterSec);
        System.out.println("Common "+union);
        return union;
    }

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printAll(arr);
    }

    public static void maxmin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;

        int counter = 0;
        while (counter<arr.length){
            if(arr[counter]>max){
                max = arr[counter];
            }
            if(arr[counter]<min){
                min = arr[counter];
            }
            counter++;
        }
        System.out.println("Max "+max+",Min "+min);
    }

    public static int kthSmallest(int[] arr,int k){
        int[] cache = new int[k];
        int prevMin =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<k;i++){
            min = Integer.MAX_VALUE;
            for(int a = 0;a<arr.length;a++){
                if(arr[a]>prevMin&&arr[a]<min){
                    min = arr[a];
                }
            }
            cache[i]=min;
            prevMin = min;
        }
//        printAll(cache);
        return cache[k-1];
    }
    public static void printAll(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int a[], int n)
    {
        for(int i = 0;i<n-1;i++){
            for(int k = 0;k<n-i;k++){
                if(a[k]>a[k+1]){
                    int temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                }
            }
        }
    }

    public static void sort012(int a[], int n){
        //count and store  the values
        int Count0 = 0;
        int Count1 = 0;
        int Count2 = 0;
        for(int i = 0; i<n-1;i++){
            switch (a[i]){
                case 0:
                    Count0++;
                    break;
                case 1:
                    Count1++;
                    break;
                case 2:
                    Count2++;
                    break;
            }
        }
        for (int i = 0;i<n;i++){
            if(i<Count0){
                a[i] = 0;
            }else if(i<Count0+Count1){
                a[i] = 1;
            }else{
                a[i] = 2;
            }
        }
    }

    public void rotate(long a[], long n)
    {
        long temp = a[a.length-1];

        for(int i = a.length-1;i>=0;i--){
            if(i!=0){
                a[i] = a[i-1];
            }else{
                a[i] = temp;
            }
        }
    }

    // line 11 not optimized
    static int maxSubarraySum2(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int sum = 0;
            for(int a = i;a<arr.length;a++){
                sum = arr[a]+sum;
                if(max<sum){
                    System.out.println(max);
                    max = sum;
                }
            }
        }
        return max;
    }

    //Line 11 optimized
    static int maxSubarraySum(int arr[], int n){
        int maxSum = 0;
        int sum = 0;
        for(int  i = 0;i<arr.length;i++){
            sum = sum+arr[i];

            if(sum>maxSum){
                maxSum = sum;
            }

            if(sum<0){
                sum=0;
            }
        }

        return  maxSum;
    }

    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int direction = 0;

        while (top<=down&&left<=right){
            if(direction==0){
                for(int i = left;i<right;i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }else if(direction==1){
                for(int i = top;i<=down;i--){
                    list.add(matrix[i][right]);
                }
                right--;
            }else if(direction==2){
                for(int i = right ;i>=left;i--){
                    list.add(matrix[down][i]);
                }
                down--;
            }else if(direction==3){
                for(int i = down;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
            direction++;
            if(direction>3){
                direction=0;
            }
        }
        return list;
    }

}
