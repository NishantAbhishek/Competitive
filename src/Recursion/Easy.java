package Recursion;

public class Easy{

    public static void main(String[] args) {
//        System.out.println(factorial(4));

//        System.out.println(addNum(10));
//        System.out.println(listProduct(new int[]{4,2,5,2},3));
        String name = "Nishant";
        System.out.println(reverse(name.length()-1,name));
    }
    
    public static int factorial(int num){
        if(num==1){
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }

    //Fibonacci
    static int num1 = 0;
    static int num2 = 1;
    static int num3 =0;

    public static void fibonacci(int count){
        if(count>0){
           num3 = num1+num2;
           num1 = num2;
           num2 = num3;
           System.out.print(" "+num3);
           fibonacci(count-1);
        }
    }

    public static int addNum(int num){
        if(num>0){
            return num + addNum(num-1);
        }else{
            return 0;
        }
    }

    public static int listProduct(int[] arr,int n){
        if(n>=0){
            return arr[n] * listProduct(arr,n-1);
        }else{
            return 1;
        }
    }

    public static String reverse(int index,String value){
        if(index>=0){
            return value.charAt(index) + reverse(index-1,value);
        }else{
            return "";
        }
    }
}
