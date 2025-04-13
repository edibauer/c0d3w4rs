public class main {
    public static void main(String[] args) {
       /*
        In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

        Examples
        highAndLow("1 2 3 4 5") // return "5 1"
        highAndLow("1 2 -3 4 5") // return "5 -3"
        highAndLow("1 9 3 4 -5") // return "9 -5"
        Notes
        All numbers are valid Int32, no need to validate them.
        There will always be at least one number in the input string.
        Output string must be two numbers separated by a single space, and highest number is first.
        */

        String numbers = "1 9 3 4 -5";
        String ans = "";
        /*
        String fix_numbers[] = numbers.split(" ");
        int low = Integer.parseInt(fix_numbers[0]);
        int high = Integer.parseInt(fix_numbers[0]);
                
        for (int i = 1; i < fix_numbers.length; i++) {
            if ( Integer.parseInt(fix_numbers[i]) < low ) {
                low = Integer.parseInt(fix_numbers[i]);
            } else if ( Integer.parseInt(fix_numbers[i]) > high ) {
                high = Integer.parseInt(fix_numbers[i]);
            }
        }
        */

        // System.out.println(low);
        // System.out.println(high);

        // method
        ans = highAndLow.findNumbers(numbers);
        System.out.println(ans);


    }
}