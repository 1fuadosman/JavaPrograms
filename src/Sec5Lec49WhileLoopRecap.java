import java.util.Objects;

public class Sec5Lec49WhileLoopRecap {

    public static void main(String args[]){
        /*

        //initialize starting variable outside the while loop
        while(condition){//loop will execute as long as condition is true
        //statement
        //iterate
        }
         */

        //example with while break continue

        int number = 0; //init (1)
        while(number<15){ //check condition(2)
            number++; // iterate by 1

            if(number<=5) {
                System.out.println("Skipping number " + number);
                continue; // continues outside the if statement as long as condition is true
            }

            System.out.println("number =" + number);
            if(number >=10){
                System.out.println("Breaking at " + number);
                break;
            }
        }


    }
}
