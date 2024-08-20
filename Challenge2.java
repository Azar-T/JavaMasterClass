public class Challenge2 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

//        if(score <5000 && score > 1000)
//        {
//            System.out.println("Your score less than 5000");
//        }
//        else if (score <1000)
//        {
//            System.out.println("Your score greater than 1000");
//        }
//        else
//        {
//            System.out.println("Got here");
//        }
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your Final Score : " + finalScore);

        }

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        int newFinalScore = newScore;

        if (newGameOver == true) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println("Your Final Score : " + newFinalScore);

        }

    }
}
