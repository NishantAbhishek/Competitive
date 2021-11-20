package CodingPracting2021.October;
import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputCases = scan.nextInt();
        while(inputCases-->0){
            int N = scan.nextInt();
            char[][] data = new char[N][N];

            for(int i =  0;i<N;i++){
                String userInput = scan.next();
                for(int k =0;k<N;k++){
                    data[i][k] = userInput.charAt(k);
                }
            }

            int possibility = 0;
            for(int rowFlag = N-1;rowFlag>=0;rowFlag--){
                for(int columnFlag = N-1;columnFlag>=0;columnFlag--){
                    if(data[rowFlag][columnFlag]=='#'){
                        break;
                    }
    
                    boolean found = true;
    
                    for(int c = columnFlag;c<N;c++){
                        if(data[rowFlag][c]=='#'){
                            found = false;
                            break;
                        }
                    }
    
                    if(found==false){
                        break;
                    }
    
                    for(int r = rowFlag;r<N;r++){
                        if(data[r][columnFlag]=='#'){
                            found = false;
                            break;
                        }
                    }
    
                    if(found){
                        possibility++;
                    }
                }
            }
            System.out.println(possibility);
        }

    }
    public static void q1(){
        Scanner scan = new Scanner(System.in);
        int  inputCases = scan.nextInt();

        while(inputCases>0){
            int charLength = scan.nextInt();
            int goodDeeds = 0;
            int badDeeds = 0;

            String userInput = scan.next();
            for(int i =0;i<charLength;i++){
                if(userInput.charAt(i)=='1'){
                    goodDeeds++;
                }else{
                    badDeeds++;
                }
                
                if(goodDeeds>=badDeeds){
                    break;
                }
            }                
            if(goodDeeds>=badDeeds){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            inputCases--;
        }
    }
    

    public static int binarySearch(int[] arr, int data){
        int beginIndex = 0;
        int endIndex = arr.length-1;
        int midIndex = (beginIndex+endIndex)/2;
        boolean found = false;
        while(beginIndex<=endIndex && !found){
            if(arr[midIndex]==data){
                found = true;
                break;
            }else if(data>arr[midIndex]){
                beginIndex = midIndex+1;
            }else{
                endIndex = midIndex-1;
            }
            midIndex = (beginIndex+endIndex)/2;
        }

        if(found==true){
            return midIndex;
        }else{
            return -1;
        }
    }

    
}


// for(int i = 0;i<N;i++){
//     for(int k = 0;k<N;k++){
//         System.out.print(data[i][k]+" ");
//     }
//     System.out.println();
// }   