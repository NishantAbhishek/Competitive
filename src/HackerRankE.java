public class HackerRankE {
    public static void main(String[] args) {
        staircase(30);
    }

    public static void staircase(int n) {
        int startPlace = n;
        for(int i = 1;i<=n;i++){
            for(int a = 1;a<=n;a++){
                if(startPlace<=a){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }


            startPlace--;
            System.out.println("");
        }
    }

    static String catAndMouse(int x, int y, int z) {
        int distanceFromASquared = (z-x)*(z-x);
        int distanceFromBSquared = (z-y)*(z-y);

        if(distanceFromASquared<distanceFromBSquared){
            return "Cat A";
        }else if(distanceFromASquared>distanceFromBSquared){
            return "Cat B";
        }else{
            return "Mouse C";
        }
    }


}
