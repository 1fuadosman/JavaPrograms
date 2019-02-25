public class Sec4Lect36CodingChallange2 {

    public static void main(String[] args) {
        printConversion(-2);

    }

    public static void printConversion (double kilometersPerHour) {
        if(kilometersPerHour>0) {
            long milesPerHour = Math.round(kilometersPerHour * 0.621371);
            System.out.println(kilometersPerHour + " km/h " + " = " + milesPerHour + " mi/h.");
        } else {
            System.out.println("Invalid value");
        }
    }

}
