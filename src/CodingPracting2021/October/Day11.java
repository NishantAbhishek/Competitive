package CodingPracting2021.October;
import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
        q1();
    }

    public static void q1(){
        Scanner scan  = new Scanner(System.in);
        int input = scan.nextInt();

        while(input>0){
            String userInput = scan.next();

            int maxLimit = userInput.length() * 11;

            int currentChar = userInput.charAt(0);
            int totalStep = userInput.length()+1;

            for(int i = 1;i<userInput.length() && totalStep<=maxLimit;i++){
                int tempChar = userInput.charAt(i);

                if(currentChar>tempChar){
                    totalStep = totalStep + ('z'-currentChar)+(tempChar-'a')+1;
                }else if(currentChar<tempChar){
                    totalStep = totalStep+ (tempChar-currentChar);
                }
                System.out.println(totalStep);
                currentChar = tempChar;
            }

            if(totalStep>maxLimit){
                System.out.println("NO"+totalStep+" "+maxLimit);
                // System.out.println("NO");
            }else{
                System.out.println("YES"+totalStep+" "+maxLimit);
                // System.out.println("YES");
            }
            input--;
        }        
    }
}
