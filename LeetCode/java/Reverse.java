public class Reverse {
    // attr
    // meth
    public static int reverse(int x) {
        int input = x;
        int s_input = x;
        int res = -1;
        int mod = 0;
        int output = 0;
        String str_out = "";

        while (res != 0) {
            res = Math.abs(input) / 10;
            mod = Math.abs(input) % 10;

            str_out = str_out + Integer.toString(mod);

            input = res;
        }
        
        if (Long.parseLong(str_out) > 2147483647 || Long.parseLong(str_out) < -2147483647) return 0;

        if (s_input < 0) return Integer.parseInt(str_out) * -1;
        
        return Integer.parseInt(str_out);
    }
}