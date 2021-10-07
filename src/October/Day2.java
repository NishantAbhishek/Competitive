package October;

import java.util.Scanner;

public class Day2 {


    public static void q2() {
        Scanner scan = new Scanner(System.in);
        int numberOfArray = scan.nextInt();

        while (numberOfArray > 0) {
            int numberOfElement = scan.nextInt();
            int[] data = new int[numberOfElement];

            for (int i = 0; i < numberOfElement; i++) {
                data[i] = scan.nextInt();
            }

            for (int i = 0; i < numberOfElement; i++) {
                int subArraySize = 0;
                boolean isPositive = data[i] > 0;
                for (int k = i; k < numberOfElement; k++) {
                    int element = data[k];
                    if (isPositive) {
                        if (element > 0) {
                            subArraySize++;
                        } else {
                            break;
                        }
                    } else {
                        if (element < 0) {
                            subArraySize++;
                        } else {
                            break;
                        }
                    }
                    isPositive = !isPositive;
                }
                System.out.print(subArraySize + " ");
            }
            System.out.println();
            numberOfArray--;
        }
    }

    public static void q1() {
        Scanner scanner = new Scanner(System.in);
        String readingWord = scanner.next();
//        System.out.println(readingWord);
        int totalInput = scanner.nextInt();
        while (totalInput > 0) {
            String userInput = scanner.next();
//            System.out.println(userInput);
            boolean notFound = false;
            for (int i = 0; i < userInput.length(); i++) {
                char currentChar = userInput.charAt(i);
                boolean charFound = false;
                for (int k = 0; k < readingWord.length(); k++) {
                    if (currentChar == readingWord.charAt(k)) {
                        charFound = true;
                    }
                }
                if (charFound == false) {
                    notFound = true;
                    break;
                }
            }
            if (notFound) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            totalInput--;
        }
    }
}