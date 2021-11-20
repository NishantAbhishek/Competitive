package CodingPracting2021.DSALGOQ_400;

public class Matrix {

    public static void main(String[] args) {
        int[][] arr = {{1,3,5},{2,6,9},{3,6,9}};
        //System.out.println(median(arr,3,3));
    }

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

    public static void myMatrix(){
        int[][] matrix =
                {{1,2,3,4}
                ,{5,6,7,8}
                ,{9,10,11,12}
                ,{13,14,15,16},{17,18,19,20}};
        int top = 0;
        int down = matrix.length-1;
        int left = 0;
        int right= matrix[0].length-1;
        int direction = 0;

        while (top<=down&&left<=right){
            if(direction==0){
                for(int i= left;i<=right;i++){
                    System.out.println(matrix[top][i]);
                }
                top++;
            }

            if(direction==1){
                for(int i = top;i<=down;i++){
                    System.out.println(matrix[i][right]);
                }
                right--;
            }

            if(direction==2){
                for(int i = right;i>=left;i--){
                    System.out.println(matrix[down][i]);
                }
                down--;
            }

            if(direction==3){
                for(int i = down;i>=top;i--){
                    System.out.println(matrix[i][left]);
                }
                left++;
            }

            direction++;
            if(direction>3){
                direction = 0;
            }
        }
    }




}
