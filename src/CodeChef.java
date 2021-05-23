public class CodeChef {
    public static String getRoundResult(char winning_suit, char suit1, int number1, char suit2, int number2){
        String result="";
        if(suit1==suit2){
            if(number1>number2){
                result = "Player 1 wins";
            }else if(number2>number1){
                result = "Player 2 wins";
            }else{
                result = "Draw";
            }
        }else{
            if(suit1==winning_suit){
                result = "Player 1 wins";
            }
            if(suit2==winning_suit){
                result = "Player 2 wins";
            }
            if(suit1!=winning_suit&&suit2!=winning_suit){
                if(number1>number2){
                    result = "Player 1 wins";
                }else if(number2>number1){
                    result = "Player 2 wins";
                }else{
                    result = "Draw";
                }
            }
        }
        return result;
    }
}
