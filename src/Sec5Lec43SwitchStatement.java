public class Sec5Lec43SwitchStatement {

    public static void main(String[] args) {

        //if statement
        int value = 1;
        if(value==1) {
            System.out.println("Value was 1");
        } else if(value==2) {
            System.out.println("Value was 2");

        }else{
            System.out.println("Value was not 1 or 2");
        }

        //Switch statement

        //Switch is used when your testing the same variable
        // in the below examble you are only testing for switchValue
        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default: // similar to else
                System.out.println("Value was not 1 or 2");
        }


        //Challange

        /*
        Challange
        Create a new switch statement using the char instead of int
        create a new char variable
        create a switch statement testing ofr
        A, B, C, D or E
        display a message if any of these are found and then break
        add a default which displays a message saying not found
         */

        char charValue = 'A';
        switch(charValue) {
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            default:
                System.out.println("Not found");
                break;

        }



    }


}
