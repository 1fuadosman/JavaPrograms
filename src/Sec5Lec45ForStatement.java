public class Sec5Lec45ForStatement {

    public static void main(String[] args) {

        /*
        Using the for statement, call the calculateInterest method with
        the amount of 10000 with an interestRate of 2,3,4,5,6,7 and 8
        and print the result to the console window.
         */

//        for(int i=2; i<=8; i++){
//            System.out.println("10,000 at " +  i + "% " +  "interest = " + String.format("%.2f",calculateInterest(10000, i)));
//        }
//
//        System.out.println("***************************");
//        //reverse
//
//        for(int i=8; i>=2; i--){
//            System.out.println("10,000 at " +  i + "% " +  "interest = " + String.format("%.2f",calculateInterest(10000, i)));
//        }
        int count =0;
        for(int i=1; i<10; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
                if(count==3){
                    System.out.println("Exiting loop");
                    break;
                }
            }else {
                System.out.println(i + " is not a prime number");
            }
        }




    }

    public static double calculateInterest(double amount, double interestRate){
          return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }

        for(int i=2; i< n/2; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }


}
