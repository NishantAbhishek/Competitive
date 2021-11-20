package CodingPracting2021.November.CodeChef;

import java.util.*;

;public class Day7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();
        int arrayLength = scan.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < args.length; i++) {
            array[i] = scan.nextInt();
        }

        while(testCases-->0){
            int count= 0;
            int l = scan.nextInt();
            int r = scan.nextInt();
            //greater than x
            int x = scan.nextInt();

            for(int i = 0;i<arrayLength;i++){
                if(array[i]>x){
                    count = arrayLength-i;
                    break;
                }
            }

            System.out.println(x);
        }
    }

    public static void q1() {
        int testCases = 0;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();

        while(testCases-->0){
            String stringA = scan.next();
            String stringB = scan.next();

            int[] allChar = new int[123];

            for(int i = 0;i<stringA.length();i++){
                int currentChar = stringA.charAt(i);
                allChar[currentChar] = -1; 
            }

            for(int i = 0;i<stringB.length();i++){
                int currentChar = stringB.charAt(i);
                if(allChar[currentChar]!=-1){
                    allChar[currentChar] = -2;
                }
            }

            String uniqueChar = "";

            for(int i = 90;i<123;i++){
                if(allChar[i]==-2){
                    char c = (char) i;
                    uniqueChar = uniqueChar+c;
                }
            }
            if(uniqueChar.equals("")){
                System.out.println("-1");
            }else{
                System.out.println(uniqueChar);
            }
        }

    }
}