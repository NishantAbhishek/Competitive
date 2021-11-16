package November.ExamPreparation.Week3;


public class WorkShop{
    int a = 0,b = 10;
    public static void main(String[] args) {
        boolean aBool = true;
        double aDouble=10.5;
        System.out.println(aBool=false);//false will be printed
        System.out.println(aBool!=true);//true
        System.out.println(aBool!=(aDouble>10));//true
        System.out.println(aBool+" value");//false value
    }
}

/*
Widening conversion:
When datatype such as int(32) bit is converted to long(64) bit, there is no possibility of data 
loss (Conversion from smaller value range to larger value range), and thus this conversion
is automatically done by the compiler.
        int a = 10;
        double val = a ;

Narrowing Conversion
When conversion from long to int takes place, there is possibilty of data loss
(Conversion from larger value range to smaller)and thus it might cause problem. This is called as Narrowing convarsion.
        long l = 10;
        int b = l;
*/


/*
Why is Java called a 'strongly typed language'?
Java is called strongly typed language because it demands every variable should be given some datatype.
*/


/*
a) Why does this piece of code print 3.5 instead of 4.0? 
   result=(number1/number2)+number3;
   number1 is long and number2 is int. Dividing them will give a long value of 2.
   Then adding with number3 double 1.5 will give final result of 3.5

   Make number1 as double.
*/
