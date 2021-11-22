package CodingPracting2021.November.CodeChef;
import java.util.HashMap;
import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        
        while(testCases-->0){
            int A = scan.nextInt();
            int B = scan.nextInt();
            int P = scan.nextInt();
            int Q = scan.nextInt();
            
            if(P%A==0 && Q%B==0){
                int aliceTime = (P/A)*2;
                int bobTime = ((Q/B)*2)-1;

                if(aliceTime-bobTime==1||bobTime-aliceTime==1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }else{
                System.out.println("NO");
            }

        }
        
    }

    public static void q7() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int input = scan.nextInt();
            if(input>=1&&input<100){
                System.out.println("Easy");
            }else if(input>=100&&input<200){
                System.out.println("Medium");
            }else{
                System.out.println("Hard");
            }
        }
    }

    public static void q6() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int size = scan.nextInt();
            int[] freq = new int[3];
            
            for(int i = 0;i<size;i++){
                int input = scan.nextInt();
                int remainder = input%2;
                freq[remainder]++;                
            }

            if((freq[1]*1+freq[2]*2)%3==0){
                int result = Math.min(freq[1], freq[2]);

                if(freq[1]>freq[2]){
                    result += ((freq[1]-freq[2])/3)*2;
                }else{
                    result += ((freq[2]-freq[1])/3)*2;
                }

                System.out.println(result);

            }else{
                System.out.println(-1);
            }

        }
    }


    public static void q5() {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        HashMap<Integer,Integer> data = new HashMap<>();
        while(scan.hasNext()){
            int input = scan.nextInt();
            if(data.containsKey(input)){
                data.put(input, data.get(input)+1);
            }else{
                data.put(input, 1);
            }
        }

        int captainRoom = 0;
        for(int key:data.keySet()){
            if(data.containsKey(key)){
                int roomNumber = data.get(key);                
                if(roomNumber!=k){
                    captainRoom = roomNumber;
                }
            }            
        }

        System.out.println(captainRoom);        
    }

    public static void q4(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int PC = scan.nextInt();
            int PR = scan.nextInt();
            if((PC/9)==0 && (PR/9)==0){
                System.out.println(1+" "+1);
            }else{                
                if((PC/9)<(PR/9)){
                    int numberOfDigit = 0;
                    if(PC%9==0){
                        numberOfDigit = (PC/9)+1;
                    }else{
                        numberOfDigit = (PC/9);
                    }

                    System.out.println(0+" "+numberOfDigit);                    
                }else{
                    int numberOfDigit = 0;
                    if(PR%9==0){
                        numberOfDigit = (PR/9)+1;
                    }else{
                        numberOfDigit = (PR/9);
                    }
                    System.out.println(1+" "+numberOfDigit);
                }

            }


        }
    }

    public static void q3(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int D = scan.nextInt();
            int N = scan.nextInt();            

            int result = 0;

            while(D-->0){
                result +=(result*(result+1))/2;
            }
            System.out.println(result);
        }
    }


    public static void q2(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int N = scan.nextInt();
            int K = scan.nextInt();
            System.out.println(N%K);
        }
    }
    public static void q1(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int Z = scan.nextInt();
            if((Y-X)<=Z*2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
