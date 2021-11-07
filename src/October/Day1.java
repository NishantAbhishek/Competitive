package October;

import java.util.Scanner;

public class Day1 {
    
    public static void q3()
    {
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        while(totalInput-- >0){
            int totalPerson = scan.nextInt();
            int totalAmount = scan.nextInt();

            while(totalPerson-->0){
                int amountNeed = scan.nextInt();
                if(amountNeed<=totalAmount){
                    totalAmount-=amountNeed;
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println("");
        }

    }

    public static void q2() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();
        while (turns > 0) {
            String userInput = scan.next();
            if(userInput.length()%2==0){
                int i = 0;
                boolean found = false;
                while (found==false && i<userInput.length()) {
                    char currentChar = userInput.charAt(i);
                    int countCharacter = 0;
                    for (int k = 0; k < userInput.length(); k++) {
                        if(currentChar==userInput.charAt(k)){
                            countCharacter++;
                        }
                    }
                    if(countCharacter==userInput.length()/2){
                        found = true;
                    }
                    i++;
                }

                if(found){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }


            turns--;
        }


    }

    public static void q1() {
        Scanner scan = new Scanner(System.in);
        int turns = scan.nextInt();

        while (turns > 0) {
            int dictionarySize = scan.nextInt();
            int totalPeopleInput = scan.nextInt();
            String[] oldLanguage = new String[dictionarySize];


            for (int i = 0; i < dictionarySize; i++) {
                String userInput = scan.next();
                oldLanguage[i] = userInput;
            }

            while (totalPeopleInput > 0) {
                int totalWordInput = scan.nextInt();
                while (totalWordInput > 0) {
                    String currentWord = scan.next();
                    int counter = 0;
                    while (counter < dictionarySize && !currentWord.equals(oldLanguage[counter])) {
                        counter++;
                    }

                    if (counter != dictionarySize) {
                        oldLanguage[counter] = "YES";
                    }
                    totalWordInput--;
                }
                totalPeopleInput--;
            }


            for (int i = 0; i < dictionarySize; i++) {
                if (oldLanguage[i].equals("YES")) {
                    System.out.print("YES ");
                } else {
                    System.out.print("NO ");
                }
            }
            System.out.println("");
            turns--;
        }

    }

}
