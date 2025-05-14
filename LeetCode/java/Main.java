public class Main {
    public static void main(String[] args) {
        /*
        Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
        Example 1:
        Input: x = 123
        >
        Output: 321
        Example 2:

        Input: x = -123
        Output: -321
        Example 3:

        Input: x = 120
        Output: 21
        

        Constraints:

        -231 <= x <= 231 - 1 
        */

        int input = -2147483412;
        int s_input = -2147483412;
        int res = -1;
        int mod = 0;
        int output = 0;
        String str_out = "";
        int exp = 0;
        int ans = 0;
        /*
        String numStr = Integer.toString(input);
        char[] arr_num = numStr.toCharArray();

        for (int i = (arr_num.length - 1); i >= 0; i--) {
            System.out.println(arr_num[i]);
        }
        */
        /*
        res = 1 / 10;
        mod = 1 % 10;

        System.out.println(res);
        System.out.println(mod);
        */

        /*
        while (res != 0) {
            res = Math.abs(input) / 10;
            mod = Math.abs(input) % 10;

            // System.out.println(res);
            // System.out.println(mod);

            // output = output + (mod * (int) Math.pow(10, exp));
            str_out = str_out + Integer.toString(mod);

            input = res;
            exp += 1;
        }
        
        if (s_input < 0) {
            System.out.println(Integer.parseInt(str_out) * -1);
        } else {
            System.out.println(Integer.parseInt(str_out));
        }
        */

        ans = Reverse.reverse(input);
        System.out.println(ans);

    }
}