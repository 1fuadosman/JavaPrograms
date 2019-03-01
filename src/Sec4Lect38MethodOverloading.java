public class Sec4Lect38MethodOverloading {

    /*
    Method overloading is a feature that allows us to have more than one method with the same
    name. so long as we use different paramters

    Its the ability to create multiple methods of the same name with different implementations

    Calls to an overloaded method will run a specific implementation of that method

    In the example from below we had calculateScore method with 0. 1, 2 parameters

    For example if you have method that calculates the sum of numbers. The bad practise would be to write
    sumOfTwo(int a, int b), sumOfThree(int a, int b, int c). A good example is to have method overloading
    sum(int a, int b)
    sum(int a, int b, int c)

    As its easier to remember
     */

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);
        calculateScore(500);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(6,5));
        calcFeetAndInchesToCentimeters(300);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score");
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed playerName  scored " +  score   + " points.");
        return score * 1000;
    }

    //Challange
        /*
        Create a method calcFeetAndInchesToCentimeters
        It needs to have two parameters.
        feet is the first parameter, inches is the 2nd parameter

        You should validate that the first paramter feet is >=0
        You should validate that the 2nd parameter inches is >=0 and <=12

        If the parameters are valid, then calculate how many centimeters
        comprise the feet and inches passed to this method and return
        that value

        Create a 2nd method of the same name but with only one parameter
        inches is the parameter
        validate that its >=0
        return -1 if its not true
        But if its valid, then calculate how many feet are in the inches
        and then here is the tricky part
        call the other overloaded method passing the correct feet and inches
        calculated so that it can calculate correctly.
        hits: Use double for your number datatypes is probably a good idea
        1 inch = 2.53cm and one foot = 12 inches
        use the link I give you to confirm your code is calculating correctly
        Calling another overloaded method just requires you to use the
        right number of parameters
         */

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet>0 && (inches>0 && inches<=12)) {
            double feetToCentimters = 2.54 *(feet * 12);
            double inchesToCentimeters = 2.54 * inches;
            double feetAndInchesToCentimeters = feetToCentimters + inchesToCentimeters;
            System.out.println(feetAndInchesToCentimeters);
            return feetAndInchesToCentimeters;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches>=0) {
           double feet = (int) inches/12;
           double remainingInches = (int) inches % 12;
           System.out.println((feet + ", " + remainingInches));
           return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        return -1;
    }






}
