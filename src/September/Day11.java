package September;

import java.util.Scanner;

public class Day11 {

    public static void q8() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns > 0) {
            String inputA = scan.next();
            String inputB = scan.next();

            int maxDifference = 0;
            int minDifference = 0;

            for (int i = 0; i < inputA.length(); i++) {
                char a = inputA.charAt(i);
                char b = inputB.charAt(i);
                if (a == '?' || b == '?') {
                    maxDifference++;
                } else if (a != b) {
                    maxDifference++;
                    minDifference++;
                }
            }
            System.out.println(minDifference + " " + maxDifference);
            turns--;
        }
    }

    public static void q7() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns > 0) {
            int apples = scan.nextInt();
            int orange = scan.nextInt();
            int goldCoins = scan.nextInt();

            if (apples == orange) {
                System.out.println(0);
            } else {
                int neededAmount = 0;
                if (apples > orange) {
                    neededAmount = apples - orange;
                } else {
                    neededAmount = orange - apples;
                }
                if (neededAmount < goldCoins) {
                    System.out.println(0);
                } else {
                    System.out.println(neededAmount - goldCoins);
                }

            }
            turns--;
        }

    }

    public static void q6() {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        if (input.equals("A") || input.equals("E") || input.equals("I") || input.equals("O") || input.equals("U")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    public static void q5() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            if (a == b && c == d) {
                System.out.println("YES");
            } else if (a == c && b == d) {
                System.out.println("YES");
            } else if (a == d && b == c) {
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
            int totalCoins = scan.nextInt();
            int peopleRange = scan.nextInt();

            int maxAdvantage = totalCoins % peopleRange;

            for (int i = 1; i <= peopleRange; i++) {
                if (maxAdvantage < (totalCoins % i)) {
                    maxAdvantage = (totalCoins % i);
                }
            }
            System.out.println(maxAdvantage);
            turns--;
        }
    }

    public static void q3() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int num = scan.nextInt();
            if (num % 10 == 0) {
                System.out.println(0);
            } else if ((num * 2) % 10 == 0) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }

            turns--;
        }

    }

    public static void q2() {
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        while (totalInput > 0) {
            int dataCount = scan.nextInt();
            String currentData = scan.next();
            if (currentData.contains("I")) {
                System.out.println("INDIAN");

            } else if (currentData.contains("Y")) {
                System.out.println("NOT INDIAN");

            } else {
                System.out.println("NOT SURE");
            }
            totalInput--;
        }
    }

    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int size = scan.nextInt();
            int[][] data = new int[size][size];
            int indexLimit = 0;

            for (int row = 0; row < size; row++) {
                for (int column = 0; column <= indexLimit; column++) {
                    data[row][column] = scan.nextInt();
                }
                indexLimit++;
            }

//            indexLimit = size-1;
            for (int row = size - 2; row >= 0; row--) {
                for (int column = 0; column < size - 1; column++) {
                    int elementA = data[row + 1][column];
                    int elementB = data[row + 1][column + 1];

                    if (elementA > elementB) {
                        data[row][column] = elementA + data[row][column];
                    } else {
                        data[row][column] = elementB + data[row][column];
                    }
                }
//                indexLimit--;
            }
            System.out.println(data[0][0]);
            turns--;

        }
    }
}
