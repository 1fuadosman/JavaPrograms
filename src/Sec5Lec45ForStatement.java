public class Sec5Lec45ForStatement {

    public static void main(String[] args) {

        /*
        Using the for statement, call the calculateInterest method with
        the amount of 10000 with an interestRate of 2,3,4,5,6,7 and 8
        and print the result to the console window.
         */

        for(int i=2; i<=8; i++){
            System.out.println("10,000 at " +  i + "% " +  "interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        System.out.println("***************************");
        //reverse

        for(int i=8; i>=2; i--){
            System.out.println("10,000 at " +  i + "% " +  "interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate){
          return (amount * (interestRate / 100));
    }
}
