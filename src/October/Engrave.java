package October;
import java.util.ArrayList;


public class Engrave {
    public ArrayList<String> drawnObject;
    int charPrintCount;

    public Engrave() {
        drawnObject = new ArrayList<String>();
        charPrintCount = 0;
    }


    public void engrave(int tickLength, int magnitude) {
        for (int j = magnitude; j >= 0; j--) {
            drawInterval(tickLength - 1);      // draw interior ticks for inch
            drawLine(tickLength,String.valueOf(j).charAt(0));           // draw inch j line and label
        }
    }


    private void drawInterval(int centralLength) {
        if(centralLength==0){
            return;
        }else{
            drawInterval(centralLength-1);
            drawLine(centralLength,' ');
            drawInterval(centralLength - 1);
        }
    }

    public void drawLine (int tickLength, char tickLabel) {
        if(tickLength==0){
            charPrintCount++;
            System.out.println(" "+tickLabel);
            return;
        }else{
            charPrintCount++;
            System.out.print("-");
            drawLine(tickLength-1,tickLabel);
        }
    }

    public static int cupSelection(int weight[], int value[], int maxWeight, int index) {

        return 0;
    }


}