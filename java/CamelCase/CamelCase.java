public class CamelCase {
    // attr
    // method
    public static String toCamelCase(String str) {
        char arr_str[] = str.toCharArray();
        String new_str = "";
        int flag = 0;

        for (int i = 0; i < arr_str.length; i++) {
            // validate score, underscore
            if ( arr_str[i] == '-' || arr_str[i] == '_' ) {
                flag = 1;
                // System.out.println(flag);
                continue;
            }

            if ( flag == 0 ) {
                new_str += Character.toString(arr_str[i]);
            } else if ( flag == 1 ) {
                new_str += Character.toString(Character.toUpperCase(arr_str[i]));
                flag = 0;
            }

        }

        return new_str;
    }
}