package CodingPracting2021.September;

public class Day3 {
    public static void main(String[] args) {
        int[] data = {-1,-2,-3,-4};
        System.out.println(largestSumContiguos(data));
        findDuplicateChar("Nishant abhishek");//aih
    }

    public static long largestSumContiguos(int[] arr){
        long largestSum = arr[0];
        long currentMax = 0;

        for(int i = 0;i<arr.length;i++){
            currentMax += arr[i];
            if(currentMax>largestSum){
                largestSum = currentMax;
            }

            if(currentMax<0){
                currentMax = 0;
            }
        }
        return largestSum;
    }

    public void reverseString(char[] s) {
        int startIndex = 0;
        int endIndex = s.length-1;
        while (startIndex<endIndex){
            char temp = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = temp;
            startIndex++;
            endIndex--;;
        }
    }
    int isPalindrome(String S) {
        int isPali = 1;
        int startIndex = 0;
        int endIndex = S.length()-1;
        while (startIndex<endIndex && isPali==1){
            if(S.charAt(startIndex) != S.charAt(endIndex)){
                isPali =  0;
            }
            startIndex++;
            endIndex--;
        }
        return isPali;
    }

    //O(N) complexity
    static void findDuplicateChar(String value){
        char[] allChar = new char[256];

        for(int i = 0;i<value.length();i++){
            if(allChar[value.charAt(i)]==1){
                System.out.println(value.charAt(i));
                allChar[value.charAt(i)] += 1;
            }else{
                allChar[value.charAt(i)] += 1;
            }
        }
    }
//
//    int getMinDiff(int[] arr, int n, int k) {
//
//    }

}
