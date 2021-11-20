package CodingPracting2021.November.CodeChef;
import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        
    }

    public static void q1(){
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        while(totalInput-->0){
            int inputLength = scan.nextInt();
            String data = scan.next();
            int rCount = 0;
            int gCount = 0;
            int bCount = 0;

            for(int i = 0;i<data.length();i++){
                if(data.charAt(i)=='R'){
                    rCount++;
                }else if(data.charAt(i)=='G'){
                    gCount++;
                }else{
                    bCount++;
                }
            }

            int max = 0;
            if(rCount>=gCount && rCount>=bCount){
                max = rCount;
            }else if(gCount>=rCount && gCount>=bCount){
                max = gCount;
            }else{
                max = bCount;
            }
            System.out.println(inputLength-max);
        }
    }
}
