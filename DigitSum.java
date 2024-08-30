public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int n) {
        if (n < 0) {
            return -1;

        }
        int sum = 0;
        while (n > 9) {
            sum += (n % 10);
            n = n / 10;
        }
        sum += n;
        return sum;
    }


}
