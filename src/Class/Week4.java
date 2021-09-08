package Class;

import java.util.ArrayList;

public class Week4 {
    public static void main(String[] args) {
        for (int i = 0; i <20; i++) {
            System.out.println("Num "+ i +" passed:- "+(i%2!=0 && i>15));
        }

        System.out.println("--"+String.format("%d,%b",2,1));

        int a = 10;

        printVal(a++);
        System.out.println(a);
    }

    static void printVal(int val){
        System.out.println("Metod:- "+val);
    }


}
