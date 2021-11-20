package CodingPracting2021.DSALGOQ_400;

public class StringAlgo {
    public static void main(String[] args) {
//        System.out.println(isRotation("AACD","ACDA"));
//        findAllDuplicates("geeksforgeeks");
        longestPalin("aaaabbaa");
    }

    //reverse String
    public void reverseString(char[] s) {
        int inital = 0;
        int end = s.length-1;
        while (inital<end){
            char temp = s[inital];
            s[inital] = s[end];
            s[end]= temp;
            inital++;
            end--;
        }
    }

    static int isPlaindrome(String S) {
        int initial = 0;
        int end = S.length()-1;
        while (initial<end){
            if(S.charAt(initial)!=S.charAt(end)){
                return 0;
            }
            initial++;
            end--;
        }
        return 1;
    }

    //Whether strA is rotation of strB
    private static boolean isRotation(String strA,String strB){
        String strC = strA+strA;

        if(strC.contains(strB)){
            return true;
        }else {
            return false;
        }
    }

    static int NO_OF_CHARS = 256;
    //hashing
    static void findAllDuplicates(String a){
//        System.out.println((int)a.charAt(1));
        int[] chars = new int[NO_OF_CHARS];

        for(int i = 0;i<a.length();i++){
            chars[a.charAt(i)]=chars[a.charAt(i)]+1;
        }

        for(int i = 0;i<chars.length;i++){
            if(chars[i]>1){
                System.out.println((char) i+" count:- "+chars[i]);
            }
        }
    }

    static int longestPalin(String s){
        String maxPa = "";
        for(int i = 0;i<s.length();i++){
            for(int k = i;k<s.length();k++){
                String sub = s.substring(i,k+1);
                System.out.println(sub);
                int isPalin = isPlaindrome(sub);
                if(isPalin==1){
                    if(sub.length()>maxPa.length()){
                        maxPa = sub;
                    }
                }
            }
        }
        return maxPa.length();
    }


}
