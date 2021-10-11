package October;

import java.util.Arrays;
import java.util.Scanner;

public class Day6 {
    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int turn = scan.nextInt();

        while (turn-->0){
            int nextInput = scan.nextInt();
            if(nextInput%4==1){
                System.out.println("BOB");
            }else{
                System.out.println("ALICE");
            }

        }
    }


    public static void q2()
    {
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();

        while(totalInput-->0){
            int size = scan.nextInt();
            int[] data = new int[size];

            for(int i = 0;i<size;i++){
                data[i] = scan.nextInt();
            }

            Arrays.sort(data);

            int beginIndex = 0;
            int endIndex = size-1;

            while (beginIndex<=endIndex){
                int temp = data[beginIndex];
                data[beginIndex] = data[endIndex];
                data[endIndex] = temp;
                beginIndex++;
                endIndex--;
            }

            int total = 0;
            for(int i = 0;i<size;i++){
                if((i+1)%4==1 || (i+1)%4==2){
                    total = total+data[i];
                }
            }
            System.out.println(total);
        }
    }
}
