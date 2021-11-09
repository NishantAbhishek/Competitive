package November.ExamPreparation;

public class Question {
    public static void main(String[] args) {
        int data[] = {1,2,1,1,2,1,2,1,1,2,3,3,3,3,3,3,3,4,1,1};

        System.out.println(findElement(new int[]{1,2,3,2,3,3,4,5},new int[]{2,3,3}));
    }
        

    // public static void findLargestContig(int[] data){

    //     if(data==null||data.length==0){
    //         System.out.println("YO DONT MESS WITH THE NUMBER");
    //         return;
    //     }

    //     int MAX = 0;
    //     int MAX_ELEMENT = data[0];
    //     int largest = 1;
    //     int currentElement = data[0];

    //     for(int i = 1;i<data.length;i++){
    //         if(currentElement==data[i]){
    //             largest++;
    //             if(MAX<largest){
    //                 MAX = largest;
    //                 MAX_ELEMENT = currentElement;
    //             }
    //         }else{
    //             largest = 1;
    //             currentElement=data[i];
    //         }
    //     }
    //     System.out.println("MAX ELEMENT: "+MAX_ELEMENT+ " OCCURANCE: "+ MAX);
    // }

    public static int findLargestContig(int[] data, int target){

        if(data==null){
            return 0;
        }

        int maxSubArraySize = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i]==target){
                maxSubArraySize++;
            }else{
                maxSubArraySize = 0;
            }
            
        }
        return maxSubArraySize;

    }

    public static boolean  findElement(int[] largerArr, int[] smallerArr){
        if(largerArr==null || smallerArr==null || largerArr.length<smallerArr.length){
            return false;
        }

        boolean holdsElement = false;
        int outerIndex = 0;
        while(outerIndex<largerArr.length&&!holdsElement){
            if(largerArr[outerIndex]==smallerArr[0]){
                boolean matchFound = true;
                for(int i = 0;i<smallerArr.length;i++){
                    if(largerArr[i+outerIndex]!=smallerArr[i]){
                        matchFound = false;
                    }
                }
                if(matchFound){
                    holdsElement = true;
                }
            }
            outerIndex++;
        }
        return holdsElement;
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