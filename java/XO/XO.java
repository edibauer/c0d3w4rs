public class XO {
    // attr
    // meth
    public static boolean getXO(String str) {
        // String str = "ooxx";
        String upper_str = str.toUpperCase();
        int x_counter = 0;
        int o_counter = 0;

        char[] arr_str = upper_str.toCharArray();
        
        for (int i = 0; i < arr_str.length; i++) {
            // System.out.println(arr_str[i]);
            if ( arr_str[i] == 'X' ) {
                x_counter++;
            } else if ( arr_str[i] == 'O' ) {
                o_counter++;
            }
        }

        if ( x_counter == o_counter ) return true;

        return false;
    }
}