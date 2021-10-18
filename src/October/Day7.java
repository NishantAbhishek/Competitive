package October;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Day7 {

    public static void main(String[] args) {
        Engrave engrave = new Engrave();
        //engrave.drawLine(6, ' ');
        //System.out.println(engrave.charPrintCount);
        engrave.engrave(3, 4);
    }

    public static void q1()
    {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while(turns-->0){
            int pagesToWrite = scan.nextInt();
            int pagesLeft = scan.nextInt();
            int budget = scan.nextInt();
            int shopBook = scan.nextInt();
            int neededPage = pagesToWrite-pagesLeft;

            boolean canBuy = false;

            while(shopBook-->0){
                int pages = scan.nextInt();
                int price = scan.nextInt();
                if(price<=budget && pages>=neededPage){
                    canBuy = true;
                }
            }


            if(canBuy){
                System.out.println("LuckyChef");
            }else{
                System.out.println("UnluckyChef");
            }

        }
    }
    public static void q2()
    {
        Scanner scan = new Scanner(System.in);
        int sizeA = scan.nextInt();
        int sizeB = scan.nextInt();
        int sizeC = scan.nextInt();
        HashMap<Integer,Integer> data = new HashMap<>();

        for(int i = 0;i<sizeA;i++){
            int input = scan.nextInt();
            data.put(input,1);
        }

        for(int i = 0;i<sizeB;i++){
            int input = scan.nextInt();
            if(data.containsKey(input)){
                data.put(input,2);
            }else{
                data.put(input,1);
            }
        }

        for(int i = 0;i<sizeC;i++){
            int input = scan.nextInt();
            if(data.containsKey(input)){
                data.put(input, data.get(input)+1);
            }else{
                data.put(input,1);
            }
        }

        ArrayList<Integer> finalize = new ArrayList<>();
        for(int key:data.keySet()){
            if(data.get(key)>=2){
                finalize.add(key);
            }
        }

        int[] printAr = new int[finalize.size()];
        for(int i = 0;i<finalize.size();i++){
            printAr[i] = finalize.get(i);
        }
        Arrays.sort(printAr);
        System.out.println(printAr.length);
        for(int i = 0;i<printAr.length;i++){
            System.out.println(printAr[i]);
        }

    }
}
