public class highAndLow {
    // att
    // meth
    public static String findNumbers(String numbers) {
        String fix_numbers[] = numbers.split(" ");
        int low = Integer.parseInt(fix_numbers[0]);
        int high = Integer.parseInt(fix_numbers[0]);
        String ans = "";

        for (int i = 1; i < fix_numbers.length; i++) {
            if ( Integer.parseInt(fix_numbers[i]) < low ) {
                low = Integer.parseInt(fix_numbers[i]);
            } else if ( Integer.parseInt(fix_numbers[i]) > high ) {
                high = Integer.parseInt(fix_numbers[i]);
            }
        }

        ans = high + " " + low;
        return ans;
    }
}