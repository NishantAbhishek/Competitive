package CodeChef;

public class A {
    public static void main(String[] args) {
        boolean aBool = true;
        //here aBool is declared and assigned to false

        double aDouble=10.5;
        //here aDouble is declared and assigned the value of 10.5


        System.out.println(aBool=false);
        //first aBool value is assigned as false
        //and then aBool value is passed to print function, which print aBool value, which is false.


        System.out.println(aBool!=true);
        //currently, aBool value is assigned as false
        //as the value of aBool is false, the statement aBool!=true becomes true.
        //Therefore, true is passed to println() function which prints true


        System.out.println(aBool!=(aDouble>10));
        //step1:- it computes whether (aDouble>10) is true or not. as aDouble value was assigned as 10.5, 10.5 is more than 10, so it's true.
        //step2:- it checks whether the computed value step1 value (true) is not equal to aBool(false) value. as they are not equal the expression aBool!=(aDouble>10) holds as true.
        //step3:- here the result of the expression aBool!=(aDouble>10) which computes as true is passed to the println() function resulting as true.

        System.out.println(aBool+" value");
        //string literal is " value"
        //boolean value assigned to aBool is false
        //aBool value is converted to string and concatenated with string literal of " value"
        //the concatenated value is passed in println() function which prints "false value"

    }

    public static String formatPhone(String phoneNum){
       return "+"+phoneNum.substring(0, 5) + "*****" + phoneNum.substring(phoneNum.length()-2, phoneNum.length());
    }

/*
* Why is Java called a 'strongly typed language'?
* Java demands that all variable should be given a datatype before execution, therefore it is called strongly typed language
*/


    /*
    In java, programmers are not allowed to assign a double value to int variable as the fractional part of double
    variable will get lost.

    WIDENING CONVERSION refers to:-
    this refers to conversion from smaller value range to a larger value range. example conversion of int = 5 to double is permitted
    as information will not get lost. We can perform assignment conversion on widening conversion type. Here is the example:-
    public void wideningConversion(){
        int a = 5;
        double b = a; //(here I am performing assignment conversion)
    }


    NARROWING CONVERSION refers to:-
    This refers to conversion from larger value range to smaller value range. There is possibility of information loss.
    Therefore, we need to perform casting for narrowing conversion as assignment conversion will throw compile time error.
    Example:-
    public void narrowingConversion(){
        double a = 5.0;
        int b =(int) a;  // (here I am performing casting)


        double k = 1.0;
        int l = k;  // (this will give compile time error as we are
                   //not allowed to perform narrowing conversion without casting)

    }
    */

    /*
    Why does this piece of code print 3.5 instead of 4.0?
    The rule says that while mathematical operation smallest range is
    converted to the data type of the operand with the data type that has the largest range

    so here number1 is long and number2 is int, for the division operation (number1/number2) number2 int is converted to long type which has higher range than int.
    after the division then we get the result as 2 instead of 2.5, the result comes as long datatype.
    number3 is double which holds value of 1.5 according to the rule now long 2 will be converted to double and the result will be added to number3:-  1.5
    the final value will come as 1.5+2.0 = 3.5 which is printed
     */
    public void getData(){
        long number1=10;
        int number2=4;
        double number3=1.5;
        double result;
        result=(number1/number2)+number3;
        System.out.println(result);
    }



    public static void way1(){
        //initialize number1 and number2 as double from
        //the beginning or either number1 or number2 to be double
        double number1=10;
        double number2=4.0;
        double number3=1.5;
        double result;
        result=(number1/number2)+number3;
        System.out.println(result);
    }

    public static void way2(){
        long number1=10;
        int number2=4;
        double number3=1.5;
        double result;
        result=((double) number1/(double)number2)+number3;
        //while performing the operation cast number1 or
        // number2 or both number1 and number2 to be double
        System.out.println(result);
    }

    public static void way3(){
        //initialize number1 and number2 as double from the beginning or either number1 or number2 to be double
        int number1=10;
        int number2=4;
        double number3=1.5;
        double result;
        result=(number1/(double)number2)+number3;//cast number2 to be double
        System.out.println(result);
    }



}
