package CodingPracting2021.November.CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class Day11 {
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










