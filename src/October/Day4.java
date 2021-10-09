package October;

import java.util.Arrays;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args){
        System.out.println(5&4);
        System.out.println(5|4);
        System.out.println(5^4);
        System.out.println(~5);
    }


    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns>0){
            int startNumber = scan.nextInt();
            int endNumber = scan.nextInt();
            for(int i = startNumber;i<=endNumber;i++){

                if(i==1){
                    continue;
                }
                boolean isPrime = true;
                for(int k = 2;k<=Math.sqrt(i);k++){
                    if(i%k==0){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime){
                    System.out.println(i);
                }
            }

            System.out.println();
            turns--;
        }

    }
    public static void q2()
    {
        Scanner scan = new Scanner(System.in);
        long turns = scan.nextInt();

        while(turns>0){
            int toalNumber = scan.nextInt();
            int nthTerm = toalNumber-1;
            //System.out.println(nthTerm);
            while(toalNumber>0){
                scan.nextInt();
                toalNumber--;
            }

            if(nthTerm<1){
                System.out.println(0);
            }else{
                long output = ((long)nthTerm*((long)nthTerm+1))/2;
                System.out.println(output);
            }
            turns--;
        }


    }
}
