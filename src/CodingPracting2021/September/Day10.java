package CodingPracting2021.September;

import java.util.Scanner;

public class Day10 {
    public static void q8() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a % b);
            turns--;
        }

    }

    public static void q7() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int hardness = scan.nextInt();
            double carbonContent = scan.nextDouble();
            int tensileStrength = scan.nextInt();

            int grade = 0;
            if (hardness > 50 && carbonContent < 0.7 && tensileStrength > 5600) {
                grade = 10;
            } else if (hardness > 50 && carbonContent < 0.7) {
                grade = 9;
            } else if (carbonContent < 0.7 && tensileStrength > 5600) {
                grade = 8;
            } else if (hardness > 50 && tensileStrength > 5600) {
                grade = 7;
            } else if (hardness > 50 || carbonContent < 0.7 || tensileStrength > 5600) {
                grade = 6;
            } else {
                grade = 5;
            }
            System.out.println(grade);
            turns--;
        }


    }

    public static void q6() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns > 0) {
            String userInput = scan.next();

            String firstHalf = "";
            String secondHalf = "";

            firstHalf = userInput.substring(0, (userInput.length() / 2));

            if (userInput.length() % 2 == 0) {
                secondHalf = userInput.substring(userInput.length() / 2);
            } else {
                secondHalf = userInput.substring(userInput.length() / 2 + 1);
            }

//            System.out.println(firstHalf);
//            System.out.println(secondHalf);

            boolean result = true;

            int counter = 0;
            while (counter < firstHalf.length() && result) {
                int frequencyCountA = 0;
                int frequencyCountB = 0;

                char currentChar = firstHalf.charAt(counter);
                for (int i = 0; i < firstHalf.length(); i++) {
                    if (firstHalf.charAt(i) == currentChar) {
                        frequencyCountA++;
                    }

                    if (secondHalf.charAt(i) == currentChar) {
                        frequencyCountB++;
                    }
                }
                if (frequencyCountA != frequencyCountB) {
                    result = false;
                }

                counter++;
            }

            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            turns--;
        }

    }

    public static void q5() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int points = scan.nextInt();

            int firstSmallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            while (points > 0) {
                int num = scan.nextInt();
                System.out.println(num);
                if (num < firstSmallest) {
                    secondSmallest = firstSmallest;
                    firstSmallest = num;
                    points--;
                    continue;
                }

                if (num < secondSmallest) {
                    secondSmallest = num;
                }

                points--;
            }
            System.out.println(firstSmallest + secondSmallest);
            turns--;
        }

    }

    public static void q4() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns > 0) {
            int salary = scan.nextInt();
            double totalSalary = 0;
            if (salary < 1500) {
                totalSalary = ((double) (10 * salary) / 100) + ((double) (90 * salary) / 100) + salary;
            } else {
                totalSalary = 500 + ((double) (98 * salary) / 100) + salary;
            }
            System.out.println(totalSalary);
            turns--;
        }

    }

    public static void q3() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        //int a = 1000000
        while (turns > 0) {
            int sideLength = scan.nextInt();
            sideLength = sideLength - 2;
            sideLength = sideLength / 2;

            int totalTriangle = sideLength * ((1 + sideLength) / 2);
            System.out.println(totalTriangle);
            turns--;
        }


    }

    public static void q2() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int itemQuantity = scan.nextInt();
            int itemPrice = scan.nextInt();

            double totalExpenses = itemQuantity * itemPrice;

            if (itemQuantity > 1000) {
                totalExpenses = (90 * totalExpenses) / 100;
            }

            System.out.println(totalExpenses);
            turns--;
        }

    }

    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            long originalA = scan.nextInt();
            long originalB = scan.nextInt();
            long inputA = originalA;
            long inputB = originalB;

            while (inputA != inputB) {
                if (inputA > inputB) {
                    inputA = inputA - inputB;
                } else {
                    inputB = inputB - inputA;
                }

            }

            long gcd_ = inputA;

            long lcm = (originalA * originalB) / (gcd_);

            System.out.println(gcd_ + " " + lcm);
            turns--;
        }

    }

}
