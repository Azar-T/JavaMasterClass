public class Switch {
    public static void main(String[] args) {
        int s = 9;
        switch (s) {
            case 1 -> System.out.println("its 1");
            case 2 -> System.out.println("its 2");
            case 3 -> System.out.println("its 3");
            default -> System.out.println("others");
        }

        String month = "April";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter ");

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st";

            case "April", "May", "June" -> "2nd";

            case "July", "August", "September" -> "3rd";

            case "October", "November", "December" -> "4th";
            default -> "bad";

        };

    }
}
