package CodingPracting2021.November.CodeChef;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Day11 {

    public static void q9(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int N = scan.nextInt();
            int currentNum = 1;
            for(int i = 0;i<N;i++){
                System.out.print(currentNum+" ");
                currentNum = currentNum+2;
            }
            System.out.println("");
        }
    }    


    public static void q8() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int N = scan.nextInt();
            if(N%2==0){
                System.out.println(N);
            }else{
                System.out.println(N-1);
            }
        }
    }

    public static void q7(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int A = scan.nextInt();
            int B = scan.nextInt();
            int P = scan.nextInt();
            int Q = scan.nextInt();

            if(A==P && P==Q){
                System.out.println(0);
            }else if((A+B)%2!=(P+Q)%2){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
    }

    public static void q6() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int Z = scan.nextInt();
            if(X+Y<=Z){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static void q5() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while(testCases-->0){
            int size = scan.nextInt();
            int[] data = new int[size];
            HashMap<Integer,Integer> foundData = new HashMap<>();
            int unique = 0;
            for(int k = 0;k<size;k++){
                int current = data[k];
                if(!foundData.containsKey(current)){
                    unique++;
                }
                foundData.put(current, current);
            }

            System.out.println(unique);
        }   
    }

    public static void q4() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int start = scan.nextInt();
            int endNum = scan.nextInt();
            int total = 0;
            for(int i =start;i<=endNum;i++){
                if(i%10==2||i%10==3||i%10==9){
                    total++;
                }
            }
            System.out.println(total);
        }
    }


    public static void q3() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int possibility = 0;
        while(testCases-->0){
            boolean possible = false;
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();

            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            int x3 = scan.nextInt();
            int y3 = scan.nextInt();
            
            int a = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));

            int b = ((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2));

            int c = ((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1));
            //System.out.println("Side a: "+a+" Side b: "+b+ " Side c: "+c);
            //int case 1
            if(a+b==c){
                possible = true;
            }

            //case 2
            if(b+c==a){
                possible = true;
            }

            //case 3
            if(a+c==b){
                possible = true;
            }

            if(possible){
                possibility++;
            }
        }
        System.out.println(possibility);
    }

	public static void q2(){
	    Scanner scan = new Scanner(System.in);
	    int total = scan.nextInt();
	    int candelDifference = scan.nextInt();
	    int[] data = new int[total];
	    
	    for(int i = 0;i<total;i++){
	        int input = scan.nextInt();
	        data[i] = input;
        }

        Arrays.sort(data);
        int matches = 0;
        int i = 0;
        while(i<total-1){
            if(data[i+1]-data[i]<=candelDifference){
                matches++;
                i++;
            }
            i++;
        }
        System.out.println(matches);
	}

    public static void q1(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int required = (testCases*(testCases+1))/2;
        int have = 0;
        for (int i = 0; i < testCases; i++) {
            have = have+ scan.nextInt();
        }

        if(required>=have){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }   
}










