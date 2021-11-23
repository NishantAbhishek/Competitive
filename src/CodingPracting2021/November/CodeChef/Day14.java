package CodingPracting2021.November.CodeChef;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Day14 {
    public static void q6(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int N = scan.nextInt();
            if( ((N*(N+1))/2)%2==0 && N>=4 && N%2==0){
                System.out.println("YES");
                
                int[] dataA = new int[N/2];
                int[] dataB = new int[N/2];

                int eachPart = N/4;
                int aI =0;
                int bI = 0;
                for(int k = 1;k<=N;k++){
                    if(k<=eachPart||k>eachPart*3){
                        dataA[aI++] = k;
                    }else{
                        dataB[bI++] = k;
                    }
                }
                for (int i = 0; i < dataA.length; i++) System.out.print(dataA[i]+" ");
                System.out.println("");
                for (int i = 0; i < dataB.length; i++) System.out.print(dataB[i]+" ");

            }else{
                System.out.println("NO");
            }

        }
	}
    public static void q5() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while(testCases-->0){
            long L = scan.nextLong();
            long R = scan.nextLong();
            

            if(L%3!=0){
                long remainder = L%3;
                L = L+(3-remainder);    
            }

            long remainder = R%3;
            R = R-remainder;

            System.out.println(((R-L)/3)+1);
            //31,415,926,535,895
        }
    }
    public static void q4(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while(testCases-->0){
            int N = scan.nextInt();
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            int totalPrepare = 0;
            if(B>=A+C){
                totalPrepare = A+C;
            }else if(B<A+C){
                totalPrepare = B;
            }
            if(totalPrepare>=N){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }
    }
    
    public static void q3(){

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while(testCases-->0){
            int D = scan.nextInt();
            int L = scan.nextInt();
            int R = scan.nextInt();
            
            if(D>R){
                System.out.println("Too Late");
            }else if(D<L){
                System.out.println("Too Early");
            }else{
                System.out.println("Take second dose now");
            }
        }
    }  
    public static void q2() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while(testCases-->0){
            long N = scan.nextInt();
            long V = scan.nextInt();
    
            long max = ((N-1)*N)/2;
            
            if(N-V<=0){
                System.out.println(max+" "+(N-1L));
            }else{
                long min = V +(((N-V)*(N-V+1L))/2)-1L;
                System.out.println(max+" "+min);
            }
        }

    }
    
    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] data = new int[length];

        for(int k = 0;k<length;k++){
            int userInput = scan.nextInt();
            data[k] = userInput;
        }
        int count = 0;
        ArrayList<String> printingValue = new ArrayList<>();
        for(int i = 0;i<length;i++){
            if(data[i]==-1){
                continue;
            }
            String message = "";
            count++;
            int position = i+1;
            while(position>0){
                message = message + position+" ";
               // System.out.print((position)+" ");
                int previousPosition = position;
                position = data[position-1];
                data[previousPosition-1] = -1;
            }
            printingValue.add(message);
        }

        System.out.println(count);
        for(int i =0;i<printingValue.size();i++){
            System.out.println(printingValue.get(i));
        }
        System.out.println("");
    }
}
