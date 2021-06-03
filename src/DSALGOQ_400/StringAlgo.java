package DSALGOQ_400;

public class StringAlgo {
    public static void main(String[] args) {

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

    int isPlaindrome(String S) {
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
}
