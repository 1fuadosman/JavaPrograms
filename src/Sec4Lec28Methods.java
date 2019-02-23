public class Sec4Lec28Methods {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //passing variables
        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);

        System.out.println("Your final Score was " + highScore);

        //hardcoded values
        highScore =calculateScore(true,10000,8,200);

        System.out.println("Your final Score was " + highScore);



    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }


}
