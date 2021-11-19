package November.CodeChef;
import java.util.*;

class Day10{
    public static void q7() {
        Scanner scan = new Scanner(System.in);
        int totalCases = scan.nextInt();
        while(totalCases-->0){
            String data = scan.next();
            int index = 0;
            int openingCount = 0;
            int closingCount = 0;
            for(int i = 0;i<data.length();i++){
                if(data.charAt(i)=='<'){
                    openingCount++;
                }else{
                    closingCount++;
                }
                if(openingCount<closingCount){
                    break;
                }
                if(openingCount==closingCount){
                    index = i;
                }
            }
            if(index!=0){
                System.out.println(index+1);
            }else{
                System.out.println(index);
            }
        }
    }

    public static void q6(){
        Scanner scan = new Scanner(System.in);
        
        int testCases = scan.nextInt();
        
        while(testCases-->0){
            int length = scan.nextInt();
            String data = scan.next();     
            
            long ones = 0;
            
            for(int i = 0;i<data.length();i++){
                if(data.charAt(i)=='1'){
                    ones++;
                }
            }
            
            System.out.println((ones*(ones+1))/2);
        }
    }

    public static void q5(){
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();

        for(int i = 1;i<=totalInput;i++){
            int arraySize = scan.nextInt();
            int[] data = new int[arraySize];

            int min = Integer.MAX_VALUE;
            for(int k=0;k<arraySize;k++){
                data[k] = scan.nextInt();                
                min = Math.min(min, data[k]);
            }

            int count = 0;

            for(int k = 0;k<arraySize;k++){
                count = count + (data[k]-min);
            }

            System.out.println(count);

        }

    }

    public static void q4()
	{
	    Scanner scan = new Scanner(System.in);
	    int total = scan.nextInt();
	    while(total-->0){
	        String jewel = scan.next();
	        String mined = scan.next();
	        //System.out.println(jewel);
	        //System.out.println(mined);
	        if(jewel==null||mined==null){
	            continue;
	        }
	        int jewelMined = 0;
	        HashMap<Character,Character> cache = new HashMap();

	        for(int i =0;i<jewel.length();i++){
                if(!cache.containsKey(jewel.charAt(i))){
                    for(int k = 0;k<mined.length();k++){
                        if(jewel.charAt(i)==mined.charAt(k)){
                            jewelMined++;
                        }
                    }
                }
                cache.put(jewel.charAt(i),jewel.charAt(i));
	        }
            System.out.println(jewelMined);
	    }
	   // System.out.println("`````");
	}



    public static void q3() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0){
            int playerCount = scan.nextInt();
            int speedIncrease = scan.nextInt();
            int catchinPoint = scan.nextInt();

            int[] speeds = new int[playerCount];
            int maxSpeed = 0;

            for(int i = 0;i<playerCount;i++){
                speeds[i] = scan.nextInt(); 
            }
            
            for(int i =0;i<=playerCount-2;i++){
                if(maxSpeed<speeds[i]){
                    maxSpeed = speeds[i];
                }
            }
            
            // System.out.println("maxSpeed: "+maxSpeed);
            
            int friendSpeed = 0; 
            if(speedIncrease>0){
                friendSpeed = speeds[playerCount-1] + speedIncrease*(catchinPoint-1);
            }else{
                friendSpeed = speeds[playerCount-1];
            }
            
            
            if(friendSpeed>maxSpeed){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }



    public static void q2(){
        int testCases = 0;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();

        while(testCases-->0){
            String inputA = scan.nextLine();
            String inputB = scan.nextLine();

            boolean isPal = false;
            for(int i = 0;i<inputA.length();i++){
                for(int k = 0;k<inputB.length();k++){
                    if(inputA.charAt(i)==inputB.charAt(k)){
                        isPal = true;
                    }
                }            
            }            
            if(isPal){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }



    public static void q1(){
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        
        while(totalInput-->0){
            int inputSize = scan.nextInt();
            int[] data = new int[inputSize];
            int maxSum = 0;
            for(int i = 0;i<inputSize;i++){
                for(int k = 0;k<inputSize;k++){
                    if(i!=k){
                        int product = data[k]*data[i];
                        int totalSum = 0;
                        while(product>0){
                            totalSum = totalSum + (product%10);
                            product = product/10;
                        }
                        if(totalSum>maxSum){
                            maxSum = totalSum;
                        }
                    }
                }
            }
            System.out.println(maxSum);
        }
    }


}