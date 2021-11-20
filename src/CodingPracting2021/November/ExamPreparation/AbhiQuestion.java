package CodingPracting2021.November.ExamPreparation;

public class AbhiQuestion {
    public static void main(String[] args) {
        int data[] = {1,2,1,1,1,2,1,2,1,1,1,2,3,3,3,3,3,3,3,4,1,1};
        System.out.println(findLargestContig(data, 1));
        System.out.println(findElement(new int[]{1,2,1,1,2,1,1,1,1,2,3,4,1,1,1,5},new int[]{1,1,1,5}));
    }

    public static int findLargestContig(int[] data, int target){

        if(data==null){
            return 0;
        }
        int MAX = 0;
        int maxSubArraySize = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i]==target){
                maxSubArraySize++;
                if(MAX<maxSubArraySize){
                    MAX = maxSubArraySize;
                }
            }else{
                maxSubArraySize = 0;
            }
            
        }
        return MAX;

    }

    public static boolean  findElement(int[] largerArr, int[] smallerArr){
        if(largerArr==null || smallerArr==null || largerArr.length<smallerArr.length){
            return false;
        }

        boolean holdsElement = false;
        int outerIndex = 0;
        while(outerIndex<largerArr.length&&!holdsElement){
            if(largerArr[outerIndex]==smallerArr[0]){
                boolean matchFound = true;
                for(int i = 0;i<smallerArr.length;i++){
                    if(i+outerIndex>=largerArr.length){
                        matchFound = false;
                    }else{
                        if(largerArr[i+outerIndex]!=smallerArr[i]){
                            matchFound = false;
                        }
                    }
                }
                if(matchFound){
                    holdsElement = true;
                }
            }
            outerIndex++;
        }
        return holdsElement;
    }
}
