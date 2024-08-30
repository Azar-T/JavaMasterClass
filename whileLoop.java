public class whileLoop {
    public static void main(String[] args) {
            int n=4;
            int firstNumber= 20;
            int ecount=0;
            int ocount=0;
            while (n <= firstNumber)
            {
                n++;
                if(!isEvenNumber(n))
                {

                    ocount++;
                    continue;
                }
               System.out.println(" Even Number " + n);
                ecount++;
                if(ecount >= 5)
                {
                    break;
                }
            }

        System.out.println(" No.of. Odd Number " + ocount);
        System.out.println(" No.of.Even Number " +ecount );


    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
