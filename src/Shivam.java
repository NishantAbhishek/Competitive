import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shivam {
    public static void main(String [] args) throws Exception {
        //timeConversion();
//        kaprekarNumbers(1,99999);
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(5);
        data.add(3);
        data.add(7);
        data.add(8);
        data.add(6);
        data.add(4);
        minimumBribes(data);
    }

    public static void TimeConversion(){
        try{
            String _24HourTime = "2:15";
            SimpleDateFormat _24HourSDF = new SimpleDateFormat("HH:mm");
            SimpleDateFormat _12HourSDF = new SimpleDateFormat("hh:mm a");
            Date _24HourDt = _24HourSDF.parse(_24HourTime);
            System.out.println(_24HourDt);
            System.out.println(_12HourSDF.format(_24HourDt));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void timeConversion(){
       System.out.println(System.currentTimeMillis());
       System.out.println(Integer.MAX_VALUE);
    }

    public static void kaprekarNumbers(int p, int q) {
        boolean found = false;
        for(int i = p;i<q;i++){
            long a = new Long(i);
            long squared = (Long) a*(Long) a;
            String str = String.valueOf(squared);
            String right = str.substring(0,str.length()/2);
            String left = str.substring(str.length()/2);

            int numL;
            int numR;
            if(right.isEmpty()){
                numR = 0;
            }else {
                numR = Integer.parseInt(right);
            }

            if(left.isEmpty()){
                numL = 0;
            }else {
                numL = Integer.parseInt(left);
            }

            int total = numL+numR;

            if(total == i){
                System.out.print(total + " ");
                found = true;
            }
        }
        if(!found){
            System.out.println("INVALID RANGE");
        }
    }


    public static void minimumBribes(List<Integer> q) {
        int count = 0;
        for(int i = q.size()-1;i>0;i--){
            if(i+1!=q.get(i)){
                if(i-1>=0 && i+1 == q.get(i-1)){
                    int temp = q.get(i);
                    q.set(i,q.get(i-1));
                    q.set(i-1,temp);
                    count++;
                }else if(i-2>=0&&i+1==q.get(i-2)){
                    int temp = q.get(i-2);
                    q.set(i-2,q.get(i-1));
                    q.set(i-1,q.get(i));
                    q.set(i,temp);
                    count=count+2;
                }else{
                    System.out.println("Too chaotic");
                    return;
                }
//                mainPrintAll(q);
            }
        }
        System.out.println(count);
    }

    public static void mainPrintAll(List<Integer> q){
        for (int i = 0; i < q.size(); i++) {
            System.out.print(q.get(i));
            System.out.print(" ");
        }
        System.out.println();

    }

    static int minimumSwaps(int[] arr) {
        int numOfSwaps = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i+1!=arr[i]){
                for(int k = i;k<arr.length;k++){
                    if(arr[k]==i+1){
                        numOfSwaps++;
                        int temp = arr[k];
                        arr[k] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
        return numOfSwaps;
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        if(d>a.size()){
            d = a.size()%d;
        }
        for(int k = 0;k<d;k++){
            int firstVal = a.get(0);
            for(int i = 0;i<a.size()-1;i++){
                a.set(i,a.get(i+1));
            }
            a.set(a.size()-1,firstVal);
        }
        return a;
    }

}

