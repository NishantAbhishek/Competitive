package November.ExamPreparation.Week2;

public class WorkShop{
    public static void main(String[] args) {
        String unit="FIT1051";
        double mark=0;
        System.out.println("The unit is:"+unit);
        System.out.println("The total mark is:"+mark);
        mark=1500;
        System.out.println("the new mark is:"+mark);
        unit=unit+mark;
        System.out.println("Unit and mark:"+unit);
    }    
}

/*q1 Answer 
    The mark is instantiated but the value is not declarared. Thefore it will give error.
    //unit=unit+mark;
    The mark doublw variable cannot be declared twice.
*/

/*
Error 1:
:-   The calculateValue function should be kept inside the class. But it is outside the class therefore it will give error.
:-   The aValue function is local variable declared inside printMsg function. It cant be used outside it,
    the code tries to access it outside thus will give erro.
*/

/*
Briefly explain two differences between Classes and Objects in Java OOP. 

:-    Classes are the bluprint which are used for creating an object.
:-    Object are the instance of the class which are created using new kwyword.

:-   Classes are created only once.
:-   Object can be created as many times as we want.

:-   In java classes are created using class keyword.
:-   In java objects are created using new keyword.
*/

/*
Briefly explain two differences between instance variables and local variables in Java. 
:- Local varible are declared inside a function.
:- Instance variable are declared inside a class but outside of function body.

:- Local variable can only be accessed in the context of where it is declared like, a function local 
variable can be accessed inside the function only.
:- Instance variable can be accessed from anywhere inside the class. 

:- Instance variable life ends when the the function is executed.
:- Local variable life depends on the object life.
*/








