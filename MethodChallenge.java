public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculate(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculate(1000);
        displayHighScorePosition("Ace", highScorePosition);

        highScorePosition = calculate(500);
        displayHighScorePosition("Luffy", highScorePosition);

        highScorePosition = calculate(100);
        displayHighScorePosition("Zoro", highScorePosition);

        highScorePosition = calculate(25);
        displayHighScorePosition("Sanji", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the High Score list");
    }

    public static int calculate(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }


}
