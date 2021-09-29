package September;

import DSALGOQ_400.Array;

import java.util.HashMap;
import java.util.Scanner;

public class Day12 {
    public static void q8()
    {
        Scanner scan =new Scanner(System.in);
        int inputs = scan.nextInt();

        while(inputs>0){
            String inputX = scan.next();
            String inputY = scan.next();

            boolean canBeSame = true;

            for(int i = 0;i<inputY.length();i++){
                char charX = inputY.charAt(i);
                char charY = inputX.charAt(i);

                if(charY!=charX){
                    if(!(charX=='?' || charY=='?')){
                        canBeSame =false;
                        break;
                    }
                }

            }

            if(canBeSame){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }



            inputs--;
        }

    }

    public static void q7() {
        Scanner scan = new Scanner(System.in);
        int totalTwit = scan.nextInt();
        int[] data = new int[totalTwit+1];

        int clicks = scan.nextInt();
        while (clicks > 0) {
            String input = scan.next();
            if (input.equals("CLOSEALL")) {
                for (int i = 0; i <= totalTwit; i++) {
                    data[i] = 0;
                }
            } else {
                int clickedIndex = scan.nextInt();
                if (data[clickedIndex] == 0) {
                    data[clickedIndex] = 1;
                } else {
                    data[clickedIndex] = 0;
                }
            }
            int count = 0;

            for (int i = 0; i <= totalTwit; i++) {
                if (data[i] == 1) {
                    count++;
                }
            }
            System.out.println(count);

            clicks--;
        }

    }


    public static void q6() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            String ballon = scan.next();
            int amberCount = 0;
            int blueCount = 0;

            for (int i = 0; i < ballon.length(); i++) {
                if (ballon.charAt(i) == 'a') {
                    amberCount++;
                } else {
                    blueCount++;
                }

            }


            if (amberCount == 0 || blueCount == 0) {
                System.out.println(0);
            } else if (amberCount > blueCount) {
                System.out.println(blueCount);
            } else if (blueCount > amberCount) {
                System.out.println(amberCount);
            } else {
                System.out.println(amberCount);
            }

            turns--;
        }

    }


    public static void q5() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int totalDigit = 0;
        while (input > 9) {
            input = input / 10;
            totalDigit++;
        }
        if (totalDigit + 1 > 3) {
            System.out.println("More than 3 digits");
        } else {
            System.out.println(totalDigit + 1);
        }
    }


    public static void q4() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int totalCoins = scan.nextInt();
            int row = 0;
            while (totalCoins >= 0) {
                row++;
                totalCoins = totalCoins - row;
            }
            System.out.println(row - 1);
            turns--;

        }

    }


    public static void q3() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns > 0) {
            int distanceLimit = scan.nextInt();
            int X1 = scan.nextInt();
            int Y1 = scan.nextInt();

            int X2 = scan.nextInt();
            int Y2 = scan.nextInt();

            int X3 = scan.nextInt();
            int Y3 = scan.nextInt();

            double distanceA = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
            double distanceB = Math.sqrt((X1 - X3) * (X1 - X3) + (Y1 - Y3) * (Y1 - Y3));
            double distanceC = Math.sqrt((X3 - X2) * (X3 - X2) + (Y3 - Y2) * (Y3 - Y2));


            System.out.println((distanceA <= distanceLimit && distanceB <= distanceLimit) && (distanceB <= distanceLimit && distanceC <= distanceLimit)
                    || (distanceA <= distanceLimit && distanceC <= distanceLimit) ? "yes" : "no");

            turns--;
        }

    }

    public static void q2() {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int width = scan.nextInt();

        if (length * width > 2 * (length + width)) {
            System.out.println("Area");
            System.out.println(length * width);
        } else if (length * width < 2 * (length + width)) {
            System.out.println("Peri");
            System.out.println(2 * (length + width));
        } else {
            System.out.println("Eq");
            System.out.println(2 * (length + width));
        }
    }


    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int totalPotatoPlanted = scan.nextInt() + scan.nextInt();

            int extraPlanting = 1;

            boolean isPrime = false;
            while (!isPrime) {
                int totalPotato = extraPlanting + totalPotatoPlanted;

                int counter = 2;
                while (counter < totalPotato) {
                    if (totalPotato % counter == 0) {
                        break;
                    }
                    counter++;
                }

                if (counter == totalPotato) {
                    isPrime = true;
                } else {
                    extraPlanting++;
                }

            }

            System.out.println(extraPlanting);

            turns--;
        }

    }

}
