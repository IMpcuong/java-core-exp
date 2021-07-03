package codegym.refactor.source;

public class TennisGame {
    //Constants using in the tennis game:
    public static final int BEGIN_SCORE = 0;
    //Score both:
    public static final String ALL_ZERO_POINT = "Love-All";
    public static final String ALL_ONE_POINT = "Fifteen-All";
    public static final String ALL_TWO_POINT = "Thirty-All";
    public static final String ALL_THREE_POINT = "Forty-All";

    //Score individual:
    public static final String ZERO_POINT = "Love";
    public static final String ONE_POINT = "Fifteen";
    public static final String TWO_POINT = "Thirty";
    public static final String THREE_POINT = "Forty";

    /*
        How to win: who get at least 4 point first and have 2 more point than the others.
        Deuce: if 2 players have at least 3 point, and have the same score, they are "Deuce".
        After "Deuce": if one player get 1 point after "Deuce" -> this player is "Advantage".
        After "Advantage": if the "Advantage" player get 1 point -> win the game.
                           else the game become "Deuce" again.
     */
    public static final String ADVANTAGE_1 = "Advantage player1";
    public static final String ADVANTAGE_2 = "Advantage player2";
    public static final String WINNER_1 = "Win for player1";
    public static final String WINNER_2 = "Win for player2";

    //Getting deuce score:
    public static String getDeuceScore(int score_player1, int score_player2) {
        String score = "";
        if (score_player1 == score_player2) {
            switch (score_player1) {
                case 0:
                    score = ALL_ZERO_POINT;
                    break;
                case 1:
                    score = ALL_ONE_POINT;
                    break;
                case 2:
                    score = ALL_TWO_POINT;
                    break;
                case 3:
                    score = ALL_THREE_POINT;
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }
        return score;
    }

    //Getting individual score:
    public static String getIndividualScore(int score_player1, int score_player2, String score) {
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = score_player1;
            else {
                score += "-";
                tempScore = score_player2;
            }
            switch (tempScore) {
                case 0:
                    score += ZERO_POINT;
                    break;
                case 1:
                    score += ONE_POINT;
                    break;
                case 2:
                    score += TWO_POINT;
                    break;
                case 3:
                    score += THREE_POINT;
                    break;
            }
        }
        return score;
    }

    //Get final score:
    public static String getScore(String player_name1, String player_name2, int score_player1, int score_player2) {
        String score = "";
        int tempScore = BEGIN_SCORE;
        if (score_player1 == score_player2) {
            score = getDeuceScore(score_player1, score_player2);
        } else if (score_player1 >= 4 || score_player2 >= 4) {
            score = getWinnerOrDeuce(score_player1, score_player2);
        } else {
            score = getIndividualScore(score_player1, score_player2, score);
        }
        return score;
    }

    //Finding the winner:
    public static String getWinnerOrDeuce(int score_player1, int score_player2) {
        String result = "";
        if (score_player1 >= 4 || score_player2 >= 4) {
            int minusScore = score_player1 - score_player2;
            if (minusScore == 1) {
                result = ADVANTAGE_1;
            } else if (minusScore == -1) {
                result = ADVANTAGE_2;
            } else if (minusScore >= 2) {
                result = WINNER_1;
            } else {
                result = WINNER_2;
            }
        }
        return result;
    }
}
