package CodingPracting2021.September;

public class Day5 {

    public static void main(String[] args) {
        Day5 day5= new Day5();
        //System.out.println(day5.printName(5));//print 5
        //System.out.println(day5.sumTill(5));

        int[] values= {1,2,5,20,12,20};
        System.out.println(day5.addEvenPos(values,values.length-1));
        //System.out.println(day5.sumElement(values,values.length-1));
    }

    int printName(int num){
        if(num==0){
            return 0;
        }
        printName(num-1);
        System.out.println("Nishant "+num);
        return num;
    }

    //Num:- 1  Sum:-  0 Total:- 1
    //Num:- 2  Sum:-  1 Total:- 3
    //Num:- 3  Sum:-  3 Total:- 6
    //Num:- 4  Sum:-  6 Total:- 10
    //Num:- 5  Sum:-  10 Total:- 15
    int sumTill(int num){
        if(num==-1){
            return 0;
        }
        int sum = sumTill(num-1);
        System.out.println("Num:- "+num+" Sum:- "+sum+" Total:- "+(sum+num));
        return sum+num;
    }


    int addEvenPos(int arr[],int index){
        if(index==-1){
            return 0;
        }
        if(index%2==0){
            return arr[index] + addEvenPos(arr, index-1);
        }else{
            return addEvenPos(arr, index-1);
        }
    }

    int sumElement(int arr[],int index){
        if(index==-1){
            return 0;
        }

        //        int[] values= {1,2,5,20,12,20};

        //"Current Sum:- 1 Index:= 0
        //"Current Sum:- 3 Index:= 1
        //"Current Sum:- 8 Index:= 2
        //"Current Sum:- 28 Index:= 3
        //"Current Sum:- 40 Index:= 4
        //"Current Sum:- 60 Index:= 5

        int sum =  arr[index] + sumElement(arr,index-1);
        System.out.println("Current Sum:- "+sum+" Index:= "+index);
        return sum;
    }




}
