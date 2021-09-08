package Past;

import java.util.Calendar;

public class WeekList {
    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    static String[] week = {"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        calendar.set(2021,Calendar.FEBRUARY,28);

        int date = calendar.get(Calendar.DATE);//got the current Date
        int month = calendar.get(Calendar.MONTH);
        System.out.println("Date:- "+date);
        System.out.println("Month:- "+months[month]);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);
        calendar.add(Calendar.DAY_OF_WEEK,-day);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        for(int i = 0;i<7;i++){
            calendar.add(Calendar.DAY_OF_WEEK,1);
            System.out.println(week[calendar.get(Calendar.DAY_OF_WEEK)]+" "+calendar.get(Calendar.DATE));
        }
        System.out.println("n-----");
        nextWeak(calendar);
        System.out.println("n-----");
        nextWeak(calendar);

        System.out.println("p-----");
        prevWeak(calendar);
        System.out.println("p-----");
        prevWeak(calendar);


    }

    private static void nextWeak(Calendar calendar){
        for(int i = 0;i<7;i++){
            calendar.add(Calendar.DAY_OF_WEEK,1);
            System.out.println(week[calendar.get(Calendar.DAY_OF_WEEK)]+" "+calendar.get(Calendar.DATE));
        }
    }

    private static void prevWeak(Calendar calendar){
        calendar.add(Calendar.DAY_OF_WEEK,-14);
        for(int i = 0;i<7;i++){
            calendar.add(Calendar.DAY_OF_WEEK,1);
            System.out.println(week[calendar.get(Calendar.DAY_OF_WEEK)]+" "+calendar.get(Calendar.DATE));
        }
    }
}
