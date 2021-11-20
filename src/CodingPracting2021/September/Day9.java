package CodingPracting2021.September;

import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {

    }
    public static void q10(){
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns>0){
            int num = scan.nextInt();
            if(num==1||num==0){
                System.out.println("no");
            }else{
                int count = 2;
                while (count<num && (num%count!=0)){
                    count++;
                }
                if(count==num){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
            turns--;
        }
    }
    public static void q9() {
        //int[] currency = {1,2,5,10,100};
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int userCash = scan.nextInt();
            int totalCash = 0;
            while (userCash > 0) {
                if (userCash >= 100) {
                    totalCash = userCash / 100 + totalCash;
                    userCash = userCash % 100;
                } else if (userCash >= 50) {
                    totalCash = userCash / 50 + totalCash;
                    userCash = userCash % 50;
                } else if (userCash >= 10) {
                    totalCash = userCash / 10 + totalCash;
                    userCash = userCash % 10;
                } else if (userCash >= 5) {
                    totalCash = userCash / 5 + totalCash;
                    userCash = userCash % 5;
                } else if (userCash >= 2) {
                    totalCash = userCash / 2 + totalCash;
                    userCash = userCash % 2;
                } else {
                    totalCash = userCash / 1 + totalCash;
                    userCash = userCash % 1;
                }
            }
            System.out.println(totalCash);
            turns--;
        }
    }

    public static void q8() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int amountToSpend = scan.nextInt();
            int menu = 11;
            int numberOfItem = 0;
            while (menu >= 0) {
                int currentPrice = (int) Math.pow(2, menu);
                if (amountToSpend >= currentPrice) {
                    amountToSpend = amountToSpend - currentPrice;
                    numberOfItem++;
                } else {
                    menu--;
                }
            }
            System.out.println(numberOfItem);
            turns--;
        }
    }


    public static void q7() {
        Scanner scan = new Scanner(System.in);
        int noSoldier = scan.nextInt();
        int eventCount = 0;
        int oddCount = 0;
        while (noSoldier > 0) {
            if (scan.nextInt() % 2 == 0) {
                eventCount++;
            } else {
                oddCount++;
            }
            noSoldier--;
        }

        if (eventCount > oddCount) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
    }

    public static void q6() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns > 0) {
            if (scan.nextInt() < 10) {
                System.out.println("Thanks for helping Chef!");
            } else {
                System.out.println(-1);
            }
            turns--;
        }

    }

    public static void q5() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            if (scan.nextInt() + scan.nextInt() + scan.nextInt() == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            turns--;
        }
    }


    public static void q4() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns > 0) {
            int repeat = scan.nextInt();
            int number = scan.nextInt();

            while (repeat > 0) {
                number = sum(number);
                repeat--;
            }

            System.out.println(number);
            turns--;
        }
    }


    public static int sum(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + sum(num - 1);
        }
    }

    public static void q3() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        int player1MaxLead = 0;
        int player2MaxLead = 0;
        int cumulativeP1 = 0;
        int cumulativeP2 = 0;

        while (turns > 0) {
            int currentScorePlayer1 = scan.nextInt();
            int currentScorePlayer2 = scan.nextInt();
            cumulativeP1 += currentScorePlayer1;
            cumulativeP2 += currentScorePlayer2;

            if (player1MaxLead < (cumulativeP1 - cumulativeP2)) {
                player1MaxLead = cumulativeP1 - cumulativeP2;
            }

            if (player2MaxLead < (cumulativeP2 - cumulativeP1)) {
                player2MaxLead = cumulativeP2 - cumulativeP1;
            }
            turns--;
        }

        System.out.println(cumulativeP1);
        System.out.println(cumulativeP2);
        if (player1MaxLead > player2MaxLead) {
            System.out.println(1 + " " + player1MaxLead);
        } else {
            System.out.println(2 + " " + player2MaxLead);
        }
    }

    public static void q2() {
        Scanner scanner = new Scanner(System.in);
        int turns = scanner.nextInt();
        int divisio = scanner.nextInt();
        int count = 0;
        while (turns > 0) {
            int number = scanner.nextInt();
            if (number % divisio == 0) {
                count++;
            }
            turns--;
        }
        System.out.println(count);
    }


    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            System.out.println(scan.nextInt() + scan.nextInt());
            turns--;
        }
        
    }
}
