public class Sec5Lec47Sum3And5Challange {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int i=1; i<=1000 ; i++) {
            if((i % 3 ==0) && (i % 5==0)) {
                System.out.println("Divisible by 3 and 5: " + i);
                sum = sum + i;
                count++;
                if(count==5) {
                    break;
                }
            }
        }
        System.out.println("Total " + sum);

    }
}
