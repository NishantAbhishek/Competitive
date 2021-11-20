package CodingPracting2021.October;
class Day12{
    


    public static void mergeSort(int[] arr, int beg, int end){
        if(beg<end){
            int midIndex = (beg+end)/2;
            mergeSort(arr,beg,midIndex);
            mergeSort(arr,midIndex+1,end);
            merge(arr,beg,midIndex,end);
        }
    }


    public static void merge(int[] arr, int startIndex, int midIndex,int endIndex){

        //Step 1 create two separate sub array of calculauted length and insert data..
        int[] arrA = new int[midIndex-startIndex+1];        
        int[] arrB = new int[endIndex-midIndex];

        for(int i = 0;i<arrA.length;i++){
            arrA[i] = arr[i+startIndex];
        }

        for(int i = 0;i<arrB.length;i++){
            arrB[i] = arr[i+midIndex+1];
        }

        int flagA = 0;
        int flagB = 0;


        //then merge both of the created array.
        while(flagA<arrA.length && flagB<arrB.length){
            if(arrA[flagA]<arrB[flagB]){
                arr[startIndex] = arrA[flagA];
                flagA++;
            }else{
                arr[startIndex] = arrB[flagB];
                flagB++;
            }
            startIndex++;
        }

        for(int i = flagA;i<arrA.length;i++){
            arr[startIndex] = arrA[i];
            startIndex++;
        }

        for(int i = flagB;i<arrB.length;i++){
            arr[startIndex] = arrB[i];
            startIndex++;
        }

    }

    //merging two sorted Array;
    public static int[] mergeArray(int[] arrA, int[] arrB){
        int indexA = 0;
        int indexB = 0;
        int counter =0;

        int[] finalArr = new int[arrA.length+arrB.length];

        while(indexA<arrA.length && indexB<arrB.length){
            if(arrA[indexA]<arrB[indexB]){
                finalArr[counter] = arrA[indexA];
                indexA++;
            }else{
                finalArr[counter] = arrB[indexB];
                indexB++;
            }
            counter++;
        }

        for(int i = indexA;i<arrA.length;i++){
            finalArr[counter++] = arrA[i];
        }

        for(int i = indexB;i<arrB.length;i++){
            finalArr[counter++] = arrB[i];
        }
        return finalArr;
    }
    

}

