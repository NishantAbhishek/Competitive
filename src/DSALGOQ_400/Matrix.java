package DSALGOQ_400;

public class Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int cLength = matrix[0].length;
        int rLength = matrix.length;
        int rowTarget = -1;

        for(int i = 0;i<rLength;i++){
            int maxVal = matrix[i][cLength-1];
            int minVal = matrix[i][0];

            if(target<=maxVal&&target>=minVal){
                rowTarget = i;
                break;
            }
        }

        if(rowTarget==-1){
            return false;
        }

        for(int i = 0;i<cLength;i++){
            if(matrix[rowTarget][i]==target){
                return true;
            }
        }

        return false;
    }

    int rowWithMax1s(int arr[][], int n, int m) {
        int max0 = arr[0].length;
        int max_1s=-1;
        for(int r = 0;r<arr.length;r++){
            int r_o = 0;
            for(int c =0;c<arr[0].length;c++){
                if(arr[r][c]==0){
                    r_o++;
                }else{
                    break;
                }
            }
            if(r_o<max0){
                max0 = r_o;
                max_1s = r;
            }
        }
        return max_1s;
    }
}
