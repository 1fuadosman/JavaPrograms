public class Sec4Lec35CodingChallenge1 {

    public static void main(String [] args) {
        System.out.println(toMilesPerHour(75.114));

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long invalidValue = -1;
        if(kilometersPerHour>0) {
            return Math.round(kilometersPerHour * 0.621371);
        }
        return invalidValue;
    }
}
