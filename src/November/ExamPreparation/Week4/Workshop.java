package November.ExamPreparation.Week4;

public class Workshop {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n);
        System.out.println(n/10);

        boolean flag = true;
        boolean stop = false;

        if(flag&&!stop){
            System.out.println(!stop);
            System.out.println(!flag);
        }

        int i = 10,j=3,result;
        result=++j+ i--;
        j=i--;
        System.out.println(String.format("i=%d, j=%d, result=%d",i,j,result));

    }

    /**
     * First declaring variable n as 10
     * Printing the n
     * The pringing the int value of n/10
     */

     /**
      * 

        if(flag == true && stop!=false){
            System.out.println(stop==false);
            System.out.println(flag!=true);
        }      
      *
      *
      */
      /**
       * 
        int i = 10,j=3,result;
        result=++j+ i--;//result = 14,     j = 4,  i = 9
        j=i--;//j = 9, i = 8
        System.out.println(String.format("i=%d, j=%d, result=%d",i,j,result));       
       * It will print 8,  9,  14
       * 
       */


}
