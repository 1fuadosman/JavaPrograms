public class Sec4Lec36CodingChallange2 {

    public static void main(String[] args) {
        printConversion(6);

    }

    public static void printConversion (double kilometersPerHour) {
        if(kilometersPerHour>0) {
            long milesPerHour = Math.round(kilometersPerHour * 0.621371);
            System.out.println(kilometersPerHour + " km/h " + " = " + milesPerHour + " mi/h.");
        } else {
            System.out.println("Invalid value");
        }
    }

    public long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour< 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour * 0.621371);
        }
    }



}
