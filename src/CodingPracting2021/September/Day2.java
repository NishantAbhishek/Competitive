package CodingPracting2021.September;

public class Day2 {
    public static void main(String[] args) {
        int[] arr= {-47,43,94,-94,-93,-59,31,-86};

        System.out.println(maxSubarraySum(arr,arr.length));

//        for(int i = 0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }

    public static void rotate(int arr[], int n)
    {
        int lastVal = arr[n-1];
        for(int i = n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastVal;
    }


    static long maxSubarraySum(int arr[], int n){
        long maxSum = arr[0];
        int currentMax = arr[0];

        for(int i =1;i<arr.length;i++){
            currentMax += arr[i];
            if(currentMax<0){
                currentMax = 0;
                continue;
            }
            if(currentMax>maxSum){
                maxSum = currentMax;
            }
        }

        return  maxSum;
    }
}
