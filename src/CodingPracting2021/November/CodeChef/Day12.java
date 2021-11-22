package CodingPracting2021.November.CodeChef;
import java.util.*;

public class Day12{

    public static void q7(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int length = scan.nextInt();
            int data[] = new int[length];

            for(int i =0;i<length;i++){
                data[i] = scan.nextInt();
            }

            HashMap<Integer,Integer> sides = new HashMap<>();
            for(int i = 0;i<length;i++){
                int current = data[i];
                if(sides.containsKey(data[i])){
                    sides.put(data[i], sides.get(data[i])+1);                    
                }else{
                    sides.put(data[i], 1);                    
                }
            }

            int firstMax = -1;
            int secondMax = -1;

            for(int key:sides.keySet()){
                int sideLength = key;
                int count = sides.get(sideLength);
               // System.out.println("sideLength: "+sideLength+" count: "+count);
                if(sideLength>firstMax){
                    if(count>=4){
                        firstMax = sideLength;
                        secondMax = sideLength;
                    }else if(count<4&&count>=2){
                        secondMax = firstMax;
                        firstMax = sideLength;
                    }                
                }else if(sideLength>secondMax){
                    if(count>=2){
                        secondMax = sideLength;
                    }
                }
            }

            if(firstMax==-1||secondMax==-1){
                System.out.println(-1);
            }else{
                System.out.println(firstMax*secondMax);
            }
        }
    }  


    public static void q6() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int t = 0;t<testCases;t++){
            int G = scan.nextInt();
            for(int ii =0;ii<G;ii++){
                //true means head and false means tail
                int I = scan.nextInt();//initial states of coin
                int N = scan.nextInt();//number of coin
                int Q = scan.nextInt();//guess head or tail

                if(I==Q){
                    System.out.println(N/2);
                }else{
                    System.out.println(N-(N/2));
                }
                
            }
        }
      //  System.out.println("finished");
    }
    public static void q5() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        
        while(testCases-->0){
            int input =  scan.nextInt();
            int fiveMultiple = 5;
            int totalCount = 0;
            while((input/fiveMultiple)>0){
                totalCount = totalCount+(input/fiveMultiple);
                fiveMultiple = fiveMultiple*5;
            }

            System.out.println(totalCount);
        }

    }

    public static void q4() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while(testCases-->0){
            int input = scan.nextInt();
            double output = input + ((double)input/2*(input+1)); 

            System.out.println((int)output);
        }

    }


    public static void q3() {
        int testCases = 0;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();

        while(testCases-->0){
            int A = scan.nextInt();
            String B = scan.next();
            if(A==0&&B.equals("0")){
                System.out.println(A);
            }else if(A==0){
                System.out.println(B);
            }else{
                int bResult = 1;
                for(int i = 0;i<B.length();i++){
                    int currentVal = B.charAt(i)-'0';
                    bResult = ((bResult*10)+currentVal)%A;
                }
                int gcdResult = gcd(A,bResult);
            }
        }
    }

    static int gcd(int numA, int numB){
        if(numA==0){
            return numB;
        }else if(numB==0){
            return numA;
        }else{
            if(numA>numB){
                return gcd(numA%numB, numB);
            }else{
                return gcd(numA, numB%numA);
            }
        }
    }

    public static void q2() {
        System.out.println(gcd(10, 4));

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while(testCases-->0){
            int size = scan.nextInt();
            int[] data = new int[size];
        
            int minNum= Integer.MAX_VALUE;
            
            for(int i =0;i<size;i++){
                int input = scan.nextInt();
                data[i] = input;
            }
            int gcd = data[0];

            for(int i =1;i<size;i++){
                int currentData = data[i];
                gcd = gcd(gcd, currentData);
            }

        }
    }


    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            String nameA = scan.next();
            String nameB = scan.next();
            boolean possible = false;
            if(nameA.length()<nameB.length()){
                possible = isSubSequence(nameB, nameA);
            }else{
                possible = isSubSequence(nameA,nameB);
            }     

            if(possible){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }

    static boolean isSubSequence(String a, String b){
        boolean isSubSequence = false;
        int bIndex = 0;
        for(int i =0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(bIndex)){
                bIndex++;
            }
            if(bIndex==b.length()){
                isSubSequence = true;
                break;
            }            
        }
        return isSubSequence;
    }

}