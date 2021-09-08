package Past;

public class BinarySearch {
    public static void main(String[] args) {
        int[] val = {1,21,34,42,78,99,121,212,321};
        searchElement(4,val);
    }

    public static void searchElement(int val,int[] arr){
        int minIndex = 0;
        int maxIndex = arr.length-1;
        int midIndex = (maxIndex+minIndex)/2;

        while (minIndex<=maxIndex){
            if(arr[midIndex]==val){
                System.out.println(midIndex);
                return;
            }

            System.out.println("-");
            if(val>arr[midIndex]){
                minIndex = midIndex+1;
            }else if(val<arr[midIndex]){
                maxIndex=midIndex-1;
            }
            midIndex = (maxIndex+minIndex)/2;
        }
        System.out.println("Not Found");
    }

}
