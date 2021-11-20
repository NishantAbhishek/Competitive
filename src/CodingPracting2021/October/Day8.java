package CodingPracting2021.October;

import java.util.Scanner;

public class Day8 {

    public static void q2()
    {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long lastVal = n*2;
        int test = scan.nextInt();

        long maxSum = n + lastVal;
        long minSum = 1 + n + 1;


        while(test-->0){
            long currentNum = scan.nextLong();
            long result = 0;
            if(currentNum<=(maxSum+minSum)/2){
                result = (currentNum-minSum)+1;
            }else{
                result = (maxSum-currentNum)+1;
            }

            if(result<0){
                result = 0;
            }

            System.out.println(result);

        }


    }
    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] data = new int[K];

        //bombarding
        for(int i = 0;i<A;i++){
            for(int a = 0;a<K;a++){
                if(data[a]<N){
                    data[a]+=1;
                    break;
                }else{
                    data[a] = 0;
                }
            }
        }


        for(int i = 0;i<data.length;i++){
            System.out.println(data[i]);
        }

    }
}
