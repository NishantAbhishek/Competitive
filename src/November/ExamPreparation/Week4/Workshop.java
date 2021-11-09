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

}
