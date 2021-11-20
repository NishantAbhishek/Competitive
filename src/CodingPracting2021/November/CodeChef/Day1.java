package CodingPracting2021.November.CodeChef;
import java.util.*;

public class Day1{
	public static void main(String[] args) {		
		Queue<Integer> data = new LinkedList<>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(5);
		data.add(2);
		data.add(3);
		data.add(7);
		data.add(5);
		data.remove();
		System.out.println(data);
		System.out.println(giveUniqueDat(data));
	}

	public static Queue<Integer> giveUniqueDat(Queue<Integer> data){
		HashMap<Integer,Integer> value = new HashMap<>();

		while(!data.isEmpty()){
			int currentData = data.remove();
			if(!value.containsKey(currentData)){
				value.put(currentData, currentData);				
			}
		}

		for(int key:value.keySet()){
			data.add(value.get(key));
		}

		return data;
	}

	public static boolean bracketCheck(String data){
		boolean possible = true;
		int openingCount = 0;
		int closingCount = 0;

		for(int i = 0;i<data.length()&&possible;i++){
			if(data.charAt(i)=='('){
				openingCount++;
			}else if(data.charAt(i)==')'){
				closingCount++;
			}

			if(openingCount<closingCount){
				possible = false;
			}
		}

		if(openingCount!=closingCount){
			possible = false;
		}
		return possible;
	}

	public static void q6(){

	    Scanner scan = new Scanner(System.in);
	    int turns = scan.nextInt();
        
	    while(turns-->0){
	        int playerListSize = scan.nextInt();
	        int[] data = new int[playerListSize];
	        
	        for(int i = 0;i<playerListSize;i++){
	            data[i] = scan.nextInt();
	        }
	        
	        int position = scan.nextInt();
	        int element = data[position-1];
	        Arrays.sort(data);
	       // mergeSort(data,0,data.length-1);
	       // System.out.println("_________________________");
	        
	       // for(int d:data){
	       //     System.out.print(d+" ");
	       // }
	        
	       // System.out.println("");
	        System.out.println(findElement(data,element)+1);
	        
	    }
	}
	
	public static int findElement(int[] data, int element){
	    int start = 0;
	    int end = data.length-1;
	    int midIndex = (start+end)/2;
	    
	    int finalIndex = -1;
	    while(start<=end){
	        if(data[midIndex]==element){
	            finalIndex = midIndex;
	            break;
	        }else if(element>data[midIndex]){
	            start = midIndex+1;
	        }else{
	            end = midIndex-1;
	        }
	        midIndex = (start+end)/2;
	    }
	    return finalIndex;
	}
	
	public static void mergeSort(int[] arr,int beg, int end){
	    if(beg<end){
	        int midIndex = (beg+end)/2;
	        mergeSort(arr,beg,midIndex);
	        mergeSort(arr,midIndex+1,end);
	        merge(arr,beg,midIndex,end);
	        
	    }
	}
	
	
	public static void merge(int[] arr,int startIndex,int midIndex,int endIndex){
	    int[] arrA = new int[midIndex-startIndex+1];
	    int[] arrB = new int[endIndex-midIndex];
	    
	    for(int i = 0;i<arrA.length;i++){
	        arrA[i] = arr[startIndex+i];
	    }
	    
	    for(int k = 0;k<arrB.length;k++){
	        arrB[k] = arr[midIndex+k+1];
	    }
	    int flagA = 0;
	    int flagB = 0;
	    
	    while(flagA<arrA.length && flagB<arrB.length){
	        if(arrA[flagA]<arrB[flagB]){
	            arr[startIndex] = arrA[flagA];
	            flagA++;
	        }else{
	            arr[startIndex] = arrB[flagB];
	            flagB++;
	        }
	        startIndex++;
	    }
	    
	    for(int i = flagA;i<arrA.length;i++){
	        arr[startIndex] = arrA[flagA];
	        startIndex++;
	    }
	    
	    for(int i = flagB;i<arrB.length;i++){
	        arr[startIndex] = arrB[flagB];
	        startIndex++;
	    }
	    
	}    

	public static void q5(){
	    Scanner scan = new Scanner(System.in);
	    int turns = scan.nextInt();
	    while(turns-->0){
	    	int numberOfLaptop = scan.nextInt();
	    	int totalCash = scan.nextInt();
	    	int totalArea = 0 ;
	    	while(numberOfLaptop-->0){
	    		int area = scan.nextInt() * scan.nextInt();
	    		int laptopPrice = scan.nextInt();
	    		if(totalCash>=laptopPrice && totalArea<area){
	    			totalArea = area;
	    		}
	    	}
	    	if(totalArea==0){
    	    	System.out.println("no tablet");
	    	    
	    	}else{
	    	    System.out.println(totalArea);
	    	}
	    }
	}    

    public static void q4()
	{
	    Scanner scan = new Scanner(System.in);
	    int rank = scan.nextInt();
	    if(rank>50&&rank<=100){
	        System.out.println(50);
	    }else if(rank<=50){
	        System.out.println(100);
	    }else{
	        System.out.println(0);
	    }
	    
	}
    
    public static void q3(){
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        while(totalInput-->0){
            int arrSize = scan.nextInt();
            int[] data = new int[arrSize]; 
            for(int i = 0;i<arrSize;i++){
                data[i] = scan.nextInt();
            }
            int count = arrSize;
            for(int i = 0;i<data.length;i++){
                int sum = data[i];
                int product = data[i];
                for(int k = i+1;k<data.length;k++){
                    sum = sum+data[k];
                    product = product* data[k];
                    if(sum == product){
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void q2()
	{
	    Scanner scan = new Scanner(System.in);
	    int numberOfTurns = scan.nextInt();
	    while(numberOfTurns-->0){
	        int numberOfFriend = scan.nextInt();
	        int dayCount = numberOfFriend;
	        ArrayList<Integer> days = new ArrayList();
	        while(dayCount-->0){
	            int number = scan.nextInt();
	            boolean found = false;
	            for(int d:days){
	                if(d==number){
	                    found = true;
	                }
	            }
	            if(!found){
	                days.add(number);
	            }
	        }
	        int savedFriend = (days.size()>numberOfFriend)?numberOfFriend:days.size();
	        System.out.println(savedFriend);
	        
	    }
	    
	}

    public static void q1(){
        Scanner scan = new Scanner(System.in);
        int numberOfInput = scan.nextInt();

        while(numberOfInput-->0){
            int length = scan.nextInt();
            int breadth = scan.nextInt();
            int gcd = gcd(length, breadth);
            System.out.println((length*breadth)/(gcd*gcd));
        }    
    }   
    

    //gcd is same as hcf
    public static int gcd(int numberA, int numberB){
        if(numberA==0){
            return numberB;
        }else if(numberB==0){
            return numberA;
        }else{
            if(numberA>numberB){
                return gcd(numberA%numberB, numberB);
            }else{
                return gcd(numberA, numberB%numberA);
            }
        }
    }
}
