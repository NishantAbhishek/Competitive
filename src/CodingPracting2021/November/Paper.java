package CodingPracting2021.November;

import java.util.ArrayList;

public class Paper{
    public static void main(String[] args) {

        ArrayList<int[]> da = new ArrayList<>();


       String[] data =  compareStrings("rare","carefully");
       for(String d:data){
           System.out.print(d+" ");
       }
    }
    public static int charactersOnly(String value){
        int count = 0;
        for(int i = 0;i<value.length();i++){
            if(value.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }


    public static String[] compareStrings(String a,String b){
        int maxSize = 0;
        if(a.length()>b.length()){
            maxSize = a.length();
        }else{
            maxSize = b.length();
        }
        String[] data = new String[maxSize];
    
        for(int i = 0;i<maxSize;i++){
            if(i>=a.length()||i>=b.length()){
                data[i] = "!";
            }else{
                if(a.charAt(i)==b.charAt(i)){
                    data[i] =Character.toString(a.charAt(i));
                }else{
                    data[i] = "!";
                }
            }
            
        }
        return data;
    }
    

}

/*
A6)
First Inner result of Math.max(a,b) is found. Then the result of this compared with c. The final max is then returned

A7)
int counter = 10;
while(counter>=1){
    myWindow.writeOutLine(i);
}

A8)
A local variable declared inside the if block will be out of scope when if block executaion is complete, but it will be still alive as the function
is currently getting executed.

A9)
When we write the same function name with dfferent parameter n same class instead of parent and child. This will cause overloading.

A11)
Constructor is used to create the object of a class. Method performs some function for which it is created.
Constructor does not return any value. Method can return or not return.
Constructor name is same as class name but not method.  
A constructor cannot be inherited but method can be inherited.

A12)
It allows classes to nherited the properties of the previous bulilt classes.
It allows us to give additional properties which will be needed to execute more functionality.

public static int charactersOnly(String value){
    int count = 0;
    for(int i = 0;i<value.length;i++){
        if(value.charAt(i)!=' '){
            count++;
        }
    }
}

public int[] compareStrings(String a,String b){
    int maxSize = 0;
    if(a.length()>b.length()){
        maxSize = a.length();
    }else{
        maxSize = b.length();
    }
    int[] data = new data[maxSize];

    for(int i = 0;i<maxSize;i++){
        if(i>=a.length()||i>=b.length()){
            data[i] = '!';
        }else{
            if(a.charAt(i)==b.charAt(i)){
                data[i] = a.charAt(i);
            }else{
                data[i] = '!';
            }
        }
        
    }
}

*/