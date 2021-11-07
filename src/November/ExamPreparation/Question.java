package November.ExamPreparation;

public class Question {
    public static void main(String[] args) {
        System.out.println(String.format("%%%%"));
        int  a  = 1,b = 2;
        boolean myBoolean = false;
        String myString = "123.4";
        //myString.l
        //myString.charAt(index)
        System.out.println(a<b); 
        System.out.println(a==5);
        System.out.println(a%b==0);
        System.out.println(myBoolean);
        System.out.println(myString=="done");
    }

    public void test(){
        boolean internationalCalls = false;
        boolean bonusData = false;
        double monthlyPrice = 0;
        if(!internationalCalls&&!bonusData){
            monthlyPrice = 19.99;
        }else if(!internationalCalls||!bonusData){
            monthlyPrice = 29.99;
        }else{
            monthlyPrice = 38.88;
        }                
    }

}


/**
 * A1 e
 * A2 c
 * A3 
 * A4 
 * A5 
 * A6 b
 */


 /**
  * 1)
  * Benefit of object-oriented programming
  *The task can be divided separatrly and handeled.
  *Error will be esay to handel and look
  *
  *
  *2)
  *length is a accessing a instance variable which is public
  *length() is a accessing public function called length
  *
  *4)
  *The i variable value is not initlaized.
  *
  *5)
  *Boolean can only hold either true or false but here there are three states which cant be 
  *represented in boolean and thus needs enum.
  *
  *6)
  *The main purpose of accessor class to give controlled access to instance or other data outside the class.
  *This can be achieved through public.
  *
  *7)
  *static doesnot belong to the object, they belongs to class.
  *
  *9)
  *the operation will start from left side. first (b*b-4*a*c) will be caclculated. In this first
  * b*b will be calculated then 4*a*c will be calculated. The subtracted will be be result of first bracket.
  *after the 2*a will be calculated. The first and the second result will then be divided to give final result.
  *
  *10)
  *(a&&b)
  *
  *
  *11)
  *This is method overloading, even though the function has same name and parameter, they donot have
  *same arguments. one of them has int and other has double which will be used to defferentiate between the two.
  *
  *12)
  *extend stamenet makes the class inherit all the property.
*/

/*
C1.
boolean internationalCalls;
boolean bonusData;
int monthlyPrice;
if(!internationalCalls&&!bonusData){
    monthlyPrice = 19.99;
}else if(!internationalCalls||!bonusData){
    monthlyPrice = 29.99;
}else{
    monthlyPrice = 38.88;
}



C2.
a)
String input = getUserInput();
while(!input.equals("done")){
    if(!isInteger(input)){
        validStrings.add(input);
    }
    input = getUserInput();
}
b)
string finalString = "";
for(String data:validStrings){
    finalString = finalString + data 
}
*/

/*
class Magician{
    private String name;
    private String id;
    private int hp;
    private int mana;
    private final int HP_MAX = 400;
    private final int MANA_MAX = 200;

    Magician(String name,String id, int hp,int mana){
        setName(name);
        setId(id);
        setHp(hp);
        setMana(mana);
    }
    public boolean setName(String _name){
        boolean status = false;
        if(_name.length()<=60){
            this.name = _name;
            status = true;
        }
        return status;
    }

    public boolean setId(String id){
        boolean status = true;
        if(id.length()==8){
            for(int i = 0;i<.length();i++){
                char currentChar = id.codePointAt(i);
                if(i=0){
                    if(currentChar>)
                }else{

                }
            }
        }else{
            status = false;
        }
        return status;
    }

    public boolean setHp(int hp){
        boolean status = false;
        if(hp>=0&&hp<=HP_MAX){
            this.hp = hp;
            status = true;
        }
        return status;
    }

    public boolean setMana(int mana){
        boolean status = false;
        if(mana>=0&&mana<=MANA_MAX){
            this.mana = mana;
            status = true;
        }
        return status;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public int getHp(){
        return hp;
    }

    public int getMana(){
        return mana;
    }

    public int getHPPercent(){
        return (hp/HP_MAX)*100;
    }
    


}
*/