import java.text.SimpleDateFormat;
import java.util.Date;

public class Shivam {
    public static void main(String [] args) throws Exception {
        try {
            String _24HourTime = "2:15";
            SimpleDateFormat _24HourSDF = new SimpleDateFormat("HH:mm");
            SimpleDateFormat _12HourSDF = new SimpleDateFormat("hh:mm a");
            Date _24HourDt = _24HourSDF.parse(_24HourTime);
            System.out.println(_24HourDt);
            System.out.println(_12HourSDF.format(_24HourDt));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

