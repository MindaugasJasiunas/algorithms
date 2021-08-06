public class TennisGame {

    // 1st - 15
    // 2nd - 30
    // 3rd - 40
    // both 40 - DEUCE
    // P1 >= 4 score && 2 more than player2 - WINNER P1     & vice versa
    // P1 >= 4 score && 1 more than player2 - ADVANTAGE P1  & vice versa
    // P1 score == P2 score - <score> ALL (if score 0 - LOVE)
    public String playGame(String player1Name, String player2Name, String[] scores){
        int player1Count=0;
        int player2Count=0;

        for(int i=0; i<scores.length; i++){
            if(scores[i].equalsIgnoreCase(player1Name)){
                player1Count++;
            }else if(scores[i].equalsIgnoreCase(player2Name)){
                player2Count++;
            }
        }

        //DEUCE
        if(player1Count>=3 && player1Count==player2Count){
            return "DEUCE";
        }
        //ADVANTAGE
        if(player1Count>=4 && (player1Count == (player2Count+1))){
            return "ADVANTAGE "+player1Name;
        }
        if(player2Count>=4 && (player2Count == (player1Count+1))){
            return "ADVANTAGE "+player2Name;
        }
        //WINNER
        if(player1Count>=4 && (player1Count >= (player2Count+2))){
            return "WINNER "+player1Name;
        }
        if(player2Count>=4 && (player2Count >= (player1Count+2))){
            return "WINNER "+player2Name;
        }
        //ALL
        if(player1Count == player2Count){
            if(player1Count==0){
                return "ALL LOVE";
            }
            return "ALL "+scoreToPoints(player1Count);
        }
        return player1Name+" "+scoreToPoints(player1Count)+"-"+scoreToPoints(player2Count)+" "+player2Name;
    }

    private String scoreToPoints(int score){
        switch(score){
            case 0: return "LOVE";
            case 1: return "15";
            case 2: return "30";
            case 3: return "40";
            default: throw new IllegalArgumentException("Illegal score argument : "+score);
        }
    }
}
