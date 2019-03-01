public class Sec4Lec40SecondsAndChallenge {

    public static void main(String[] args) {
        //System.out.println(getDurationString(200,59));
        System.out.println(getDurationString(4533));



    }

    public static String getDurationString(long minutes, long seconds) {
        if(minutes>=0 && (seconds>=0 & seconds<=59)){
            long hours =minutes/60;
            long remainingMinutes =  minutes%60;
            return hours +"h " + remainingMinutes + "m " + seconds + "s.";
        }
        return "Invalid value";

    }

    public static String getDurationString(long seconds) {
        if(seconds>=0) {
            long minutes = seconds/60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes,remainingSeconds);
        }
        return "Invalid value";

    }


}
