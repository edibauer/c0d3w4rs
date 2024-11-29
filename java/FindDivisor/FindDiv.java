public class FindDiv {
    // att
    // methods
    public static long numberOfDivisors(int n) {
        long counter = 0;
        int div = 1;

        while (div <= n ) { 
            if (n % div == 0) counter = counter + 1;
            div ++;
        }

        return counter;
    }
}
