public class EfficientMO {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-65, 45));

    }

    public static String getDurationString(int seconds) {
        if(seconds < 0)
        {
            return "invalid";
        }
        int minutes = seconds / 60;
       return getDurationString(minutes /60,seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0)
        {
            return "invalid";
        }

        if(seconds < 0 || seconds >59)
        {
            return "invalid";
        }
        int hours = minutes / 60;

        int remMinutes = minutes % 60;


        return hours + "h " + remMinutes + "m " + seconds+ "s";

    }


}
