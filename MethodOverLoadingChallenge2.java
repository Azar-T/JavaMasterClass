public class MethodOverLoadingChallenge2 {
    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int hours = minutes / 60;
        // one step apporach
//        int hours = seconds/3600;
        System.out.println("hours = " + hours);

        int remMinutes = minutes % 60;
        System.out.println("minutes = " + minutes);
        System.out.println("remaining minutes = " + remMinutes);

        int remSeconds = seconds % 60;
        System.out.println("remainingSeconds = " + remSeconds);
        return hours + "h " + remMinutes + "m " + remSeconds + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;

        int remMinutes = minutes % 60;

        int remSeconds = seconds % 60;
        return hours + "h " + remMinutes + "m " + remSeconds + "s";

    }


}
