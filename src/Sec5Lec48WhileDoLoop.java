public class Sec5Lec48WhileDoLoop {

    public static void main(String[] args) {

        //one way
        int count = 1;
        while(count!=6) {
            System.out.println("Count value is (While loop) " + count);
            count++;
        }

        //the other way
        count=1;
        while(true) {
            if(count==6){
                break;
            }
            System.out.println("Count value is (While loop) " + count);
            count++;
        }

        //
        System.out.println("**Challenge**");
        /*
        Create a method called isEvenNumber that takes a paramter of type int
        Its purpose is to determine if the argument passed to the method is
        an even number or not
        return true if n even number, otherwise return false
         */

        int number = 4;
        while(number<=20){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);

        }
    }

    public static boolean isEvenNumber(int number){
        if((number % 2) ==0) {
            return true;
        }return false;
    }

}

