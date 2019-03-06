public class Sec5Lec46ForLoopRecap {

    /*
    for loop syntax

    for(init: condition; increment) {
    }

    (step 1) init - is where the loop starts
    (step 2) condition - is when you want the loop to stop. Loop will stop when condition is false
    (step 4) increment - is how you want the loop to increment
    (step 3) {} - inside the curly braces are the actions performed per iteration
    (step 5) once the condition is false then the code will continue after curly braces
     */
    //example below will print 1,3,5
    public static void main(String[] args) {
        for (int number = 1; number < 7; number += 2) {
            System.out.println("number= " + number);
        }
        System.out.println("For loop complete");

        //Note this will never execute condition is false, and so it jumps to sout line
        for (int number = 1; number < 0; number += 2) {
            System.out.println("number= " + number);
        }
        System.out.println("For loop complete 2");

    }

}
