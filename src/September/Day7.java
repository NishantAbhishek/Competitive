package September;

import java.io.InputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
//4
//1
//2
//5
//3

        Scanner sc = new Scanner(System.in);
        int turn = sc.nextInt();
        while (turn>0){
            int numFac = sc.nextInt();
            BigInteger factorial = new BigInteger("1");
            for(int i = 1; i<=numFac; i++){
                factorial = factorial.multiply(BigInteger.valueOf((i)));
            }
            System.out.println(factorial);
            turn--;
        }

    }

    public static void sumOfNumber(){
        Scanner scanner = new Scanner(System.in);
        int turn = scanner.nextInt();
        while (turn > 0 ){
            int num = scanner.nextInt();
            int total = 0;
            while (num>0){
                total= total + (num%10);
                num = num/10;
            }
            System.out.println(total);
            turn--;
        }
    }
}
